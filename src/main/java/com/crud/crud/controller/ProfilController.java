package com.crud.crud.controller;

import com.crud.crud.service.IEtablissementService;
import com.crud.crud.service.IProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilController {
    @Autowired
    private IProfilService profilService;

}
