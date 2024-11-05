package com.sawpnapurantravels.SawpnaPuranTravels.service;

import com.sawpnapurantravels.SawpnaPuranTravels.exception.CustomException;
import com.sawpnapurantravels.SawpnaPuranTravels.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByEmail(username).orElseThrow(() -> new CustomException("Username/Email not Found"));
    }

}
