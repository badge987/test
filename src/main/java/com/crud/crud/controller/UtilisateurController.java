package com.crud.crud.controller;


import com.crud.crud.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {
    @Autowired
    private IUtilisateurService utilisateurService;
}
