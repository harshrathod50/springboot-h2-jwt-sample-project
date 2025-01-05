package dev.rathod.harsh.springboot_h2_jwt_sample_project.repository;

import dev.rathod.harsh.springboot_h2_jwt_sample_project.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {}
