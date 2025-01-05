package dev.rathod.harsh.springboot_h2_jwt_sample_project.controller;

import dev.rathod.harsh.springboot_h2_jwt_sample_project.dto.UserDTO;
import dev.rathod.harsh.springboot_h2_jwt_sample_project.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/v1/user/{userId}")
	public ResponseEntity<UserDTO> findOne(@PathVariable Integer userId) {
		Optional<UserDTO> userDtoOpt = userService.findOne(userId);
		if (userDtoOpt.isPresent()) {
			return new ResponseEntity<UserDTO>(userDtoOpt.get(), HttpStatus.OK);
		}
		return new ResponseEntity<UserDTO>(HttpStatus.NOT_FOUND);
	}
}
