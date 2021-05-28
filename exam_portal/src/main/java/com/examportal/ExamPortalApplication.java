package com.examportal;


import com.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(ExamPortalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*System.out.println("Starting code...Admin data saving.");
        User user = new User();
        user.setUsername("rahul12");
        user.setPassword(bCryptPasswordEncoder.encode("1234"));
        user.setFirstname("Rahul");
        user.setLastname("Kumar");
        user.setEmail("rahul@gmail.com");
        user.setPhone("34387433");
        user.setProfileImg("default.png");
        user.setCountryId(1);
        user.setStateId(1);
        user.setCityId(1);
        user.setGender("M");

        Role role = new Role();
        role.setRoleId(12L);
        role.setRoleName("ADMIN");

        Set<UserRole> userRoleSet = new HashSet<>();
        UserRole userRole = new UserRole();
        userRole.setRole(role);
        userRole.setUser(user);

        userRoleSet.add(userRole);

        User user1 = userService.createUser(user, userRoleSet);
        System.out.println(user1.getUsername());*/
    }
}
