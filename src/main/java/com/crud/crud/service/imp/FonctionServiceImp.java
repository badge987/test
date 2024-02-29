package com.crud.crud.service.imp;

import com.crud.crud.dao.IFonctionRepository;
import com.crud.crud.service.IFonctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fonctionService")
public class FonctionServiceImp implements IFonctionService {
    @Autowired
    private IFonctionRepository fonctionRepository;
}
