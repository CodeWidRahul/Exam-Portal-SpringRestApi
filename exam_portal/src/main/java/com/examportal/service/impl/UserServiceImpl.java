package com.examportal.service.impl;

import com.examportal.model.Country;
import com.examportal.model.User;
import com.examportal.model.UserRole;
import com.examportal.repo.*;
import com.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private CountryMasterRepository countryRepo;
    @Autowired
    private StateMasterRepository stateRepo;
    @Autowired
    private CityMasterRepository cityRepo;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = userRepository.findByUsername(user.getUsername());
        if (local != null) {
            System.out.println("User is already there !!");
            throw new Exception("User is already present !!");
        } else {
            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = userRepository.save(user);
        }
        return local;
    }

    @Override
    public Map<Integer, String> getCountries() {
        List<Country> countryList = countryRepo.findAll();
        Map<Integer, String> countriesMap = countryList.stream()
                .collect(Collectors.toMap(Country::getCountryId, Country::getCountryName));
        return countriesMap;
    }

    @Override
    public List<Object[]> getStates(Integer countryId) {
        List<Object[]> findAllByCountryId = stateRepo.findAllByCountryId(countryId);
        return findAllByCountryId;
    }

    @Override
    public List<Object[]> getCities(Integer stateId) {
        return cityRepo.findAllByStateId(stateId);
    }
}
