package com.Nishkar.springbootbackend.G4L_Reverside.repository;

import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}