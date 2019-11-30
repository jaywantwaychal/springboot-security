/**
 * 
 */
package com.jaytutorials.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jaywant
 *
 */
@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String welcomeAll() {
		return "<h1>Welcome</h1>";
	}

	@GetMapping("/users")
	public String welcomeUser() {
		return "<h1>Welcome User</h1>";
	}
	
	@GetMapping("/admin")
	public String welcomeAdmin() {
		return "<h1>Welcome Admin</h1>";
	}
}
