package dev.rathod.harsh.springboot_h2_jwt_sample_project.service;

import dev.rathod.harsh.springboot_h2_jwt_sample_project.dto.UserDTO;
import dev.rathod.harsh.springboot_h2_jwt_sample_project.entity.UserEntity;
import dev.rathod.harsh.springboot_h2_jwt_sample_project.repository.UserRepository;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;

	public Optional<UserDTO> findOne(Integer userId) {
		Optional<UserEntity> userEntityOpt = this.userRepository.findById(userId);
		if (userEntityOpt.isPresent()) {
			return Optional.of(
				this.modelMapper.map(userEntityOpt.get(), UserDTO.class)
			);
		}
		return Optional.empty();
	}
}
