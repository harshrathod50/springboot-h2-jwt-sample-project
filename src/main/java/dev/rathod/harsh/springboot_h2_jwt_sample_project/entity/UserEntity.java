package dev.rathod.harsh.springboot_h2_jwt_sample_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.time.Instant;
import lombok.Data;

@Data
@Entity(name = "User")
@Table(name = "user_")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	@Column(unique = true, length = 255)
	private String userName;

	@Column(unique = true, length = 255)
	private String email;

	@Column(length = 255)
	private String fullName;

	@Column(length = 255)
	private String passWord;

	@Column(nullable = false)
	private Timestamp dateModified = Timestamp.from(Instant.now());

	@Column(nullable = false)
	private Timestamp dateCreated = Timestamp.from(Instant.now());
}
