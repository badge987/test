package com.crud.crud.controller;

import com.crud.crud.service.IEtablissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtablissementController {
    @Autowired
    private IEtablissementService etablissementService;
}
