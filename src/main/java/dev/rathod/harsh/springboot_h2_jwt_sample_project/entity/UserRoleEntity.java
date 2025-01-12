package dev.rathod.harsh.springboot_h2_jwt_sample_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
class CompositeKey implements Serializable {
	private Integer roleId;

	private Integer userId;
}

@Data
@Entity(name = "UserRole")
@Table(name = "user_role")
@IdClass(CompositeKey.class)
public class UserRoleEntity {
	@Id
	private Integer roleId;

	@Id
	private Integer userId;
}
