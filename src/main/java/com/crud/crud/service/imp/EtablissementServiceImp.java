package com.crud.crud.service.imp;

import com.crud.crud.dao.IEtablissementRepository;
import com.crud.crud.service.IEtablissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "etablissementService")
public class EtablissementServiceImp implements IEtablissementService {
    @Autowired
    private IEtablissementRepository etablissementRepository;
}
