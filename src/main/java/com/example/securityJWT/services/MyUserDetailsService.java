package com.example.securityJWT.services;


import com.example.securityJWT.repo.UserRepositry;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    /*user detail service deer hereglegchee ugugdliin
     sangaas haij UserDetail-d huvirgaj bucaadag*/

    private final UserRepositry repository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        return repository.findByEmail(userName)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}

