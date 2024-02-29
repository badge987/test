package com.crud.crud.service.imp;

import com.crud.crud.dao.IUtilisateurRepository;
import com.crud.crud.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "utilisateurService")
public class UtilisateurServiceImp implements IUtilisateurService {
    @Autowired
    private IUtilisateurRepository utilisateurRepository;
}
