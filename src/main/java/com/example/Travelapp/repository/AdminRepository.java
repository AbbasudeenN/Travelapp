package com.example.Travelapp.repository;

import com.example.Travelapp.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,Long> {

    AdminEntity findByEmail(String email);
}
