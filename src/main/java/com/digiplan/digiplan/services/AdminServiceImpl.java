package com.digiplan.digiplan.services;

import com.digiplan.digiplan.entities.Admin;
import com.digiplan.digiplan.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public List<Admin> getEmailAndPassword(String email, String password) {
        return adminRepository.findByEmailAndPassword(email,password);
    }
}
