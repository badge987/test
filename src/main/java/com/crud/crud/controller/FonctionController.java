package com.crud.crud.controller;

import com.crud.crud.service.IEtablissementService;
import com.crud.crud.service.IFonctionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FonctionController {

    @Autowired
    private IFonctionService fonctionService;
}
