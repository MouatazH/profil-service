package com.microservices.projet.profilservice.services;

import com.microservices.projet.profilservice.entities.Profil;
import com.microservices.projet.profilservice.repos.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfilServiceImpl implements ProfilService{

    @Autowired
    ProfilRepository profilRepository;

    @Override
    public Profil getProfil(Long id) {
        return profilRepository.findById(id).get();
    }

    @Override
    public Profil updateProfil(Profil p) {
        return profilRepository.save(p);
    }

    @Override
    public void deleteProfil(Profil p) {
        profilRepository.delete(p);
    }

    @Override
    public void deleteProfilById(Long id) {
        profilRepository.deleteById(id);
    }
}
