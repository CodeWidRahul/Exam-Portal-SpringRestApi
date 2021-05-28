package com.examportal.service;

import com.examportal.model.User;
import com.examportal.model.UserRole;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserService {
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public Map<Integer, String> getCountries();

    public List<Object[]> getStates(Integer countryId);

    public List<Object[]> getCities(Integer stateId);
}
