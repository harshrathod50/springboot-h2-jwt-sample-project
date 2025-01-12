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
@Entity(name = "Role")
@Table(name = "role_")
public class RoleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;

	@Column(length = 255, unique = true)
	private String name_;

	@Column(nullable = false)
	private Timestamp dateModified = Timestamp.from(Instant.now());

	@Column(nullable = false)
	private Timestamp dateCreated = Timestamp.from(Instant.now());
}
