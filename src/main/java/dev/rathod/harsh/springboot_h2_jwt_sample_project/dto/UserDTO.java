package dev.rathod.harsh.springboot_h2_jwt_sample_project.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserDTO {
	private Integer userId;

	private String userName;

	private String email;

	private String fullName;
}
