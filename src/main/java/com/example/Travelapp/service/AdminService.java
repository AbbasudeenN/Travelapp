package com.example.Travelapp.service;

import com.example.Travelapp.entity.AdminEntity;
import com.example.Travelapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public AdminEntity saveAdmin(AdminEntity adminEntity){
        return adminRepository.save(adminEntity);
    }

    public AdminEntity getAdminByEmail(String email){
        return adminRepository.findByEmail(email);
    }

}
