package com.digiplan.digiplan.services;

import com.digiplan.digiplan.entities.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getEmailAndPassword(String email, String password);
}
