package com.digiplan.digiplan.controllers;

import com.digiplan.digiplan.entities.Admin;
import com.digiplan.digiplan.services.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiadmin")
public class AdminRestController {

    private AdminService adminService;
    public AdminRestController(AdminService adminService) {
        super();
        this.adminService = adminService;
    }
    @PostMapping(path="/auth")
    public List<Admin> getEmailAndPassword(@RequestBody Admin admin) {
        return adminService.getEmailAndPassword(admin.getEmail(),admin.getPassword());
    }
}