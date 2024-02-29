package com.crud.crud.service.imp;

import com.crud.crud.dao.IProfilRepository;
import com.crud.crud.service.IProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "profilService")
public class ProfilServiceImp implements IProfilService {
    @Autowired
    private IProfilRepository profilRepository;
}
