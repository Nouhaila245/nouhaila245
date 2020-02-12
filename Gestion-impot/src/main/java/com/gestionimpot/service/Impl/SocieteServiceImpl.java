package com.gestionimpot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionimpot.bean.Societe;
import com.gestionimpot.repository.SocieteRepository;
import com.gestionimpot.service.facade.SocieteService;

@Service
public class SocieteServiceImpl implements SocieteService {
	@Autowired
	private SocieteRepository societeRepository;

	@Override
	public int save(Societe societe) {
		societeRepository.save(societe);
		
		return 1;
	}

}
