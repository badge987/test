package com.crud.crud.controller;


import com.crud.crud.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    private IRoleService roleService;
}
