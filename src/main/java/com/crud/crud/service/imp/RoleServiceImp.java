package com.crud.crud.service.imp;

import com.crud.crud.dao.IRoleRepository;
import com.crud.crud.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImp implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;
}
