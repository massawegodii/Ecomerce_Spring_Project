package com.massawe.service;

import com.massawe.dto.AdminDto;
import com.massawe.models.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
