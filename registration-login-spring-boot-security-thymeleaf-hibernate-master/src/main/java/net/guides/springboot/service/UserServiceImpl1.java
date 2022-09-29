package net.guides.springboot.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserServiceImpl1 {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
