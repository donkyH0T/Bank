package com.example.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private Environment environment;

//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String password = environment.getProperty("spring.security.user." + username + ".password");

        if (password != null) {
            String[] roles = environment.getProperty("spring.security.user." + username + ".roles", "USER").split(",");
            return User.builder()
                    .username(username)
                    .password(new BCryptPasswordEncoder().encode(password))
                    .roles(roles)
                    .build();
        }
        throw new UsernameNotFoundException("User not found");
    }
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }

}
