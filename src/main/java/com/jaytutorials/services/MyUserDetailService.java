/**
 * 
 */
package com.jaytutorials.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jaytutorials.model.MyUserDetails;
import com.jaytutorials.model.User;
import com.jaytutorials.repository.UserRepository;

/**
 * @author Jaywant
 *
 */

@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findByUsername(username);
		user.orElseThrow(() -> { 
			throw new UsernameNotFoundException("User Not found");
		});
		return user.map(MyUserDetails::new).get();
	}

}
