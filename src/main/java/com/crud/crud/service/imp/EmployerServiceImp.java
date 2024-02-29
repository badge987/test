package com.crud.crud.service.imp;

import com.crud.crud.dao.IEmployerRepository;
import com.crud.crud.service.IEmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "employerService")
public class EmployerServiceImp implements IEmployerService {
    @Autowired
    private IEmployerRepository employerRepository;
}
