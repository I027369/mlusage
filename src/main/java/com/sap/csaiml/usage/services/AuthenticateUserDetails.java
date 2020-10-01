package com.sap.csaiml.usage.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sap.csaiml.usage.models.AuthenticatedUser;
import com.sap.csaiml.usage.models.User;
import com.sap.csaiml.usage.repository.UserRepository;

@Service
public class AuthenticateUserDetails implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findByUserName(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("User not found "+username));
		
		System.out.println("the user in the repository "+user);
		
		return user.map(AuthenticatedUser::new).get();
	}

}
