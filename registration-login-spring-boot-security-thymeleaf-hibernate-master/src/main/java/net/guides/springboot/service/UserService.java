package net.guides.springboot.service;

import net.guides.springboot.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import net.guides.springboot.model.User;
import net.guides.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
