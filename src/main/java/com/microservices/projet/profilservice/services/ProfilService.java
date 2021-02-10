package com.microservices.projet.profilservice.services;

import com.microservices.projet.profilservice.entities.Profil;

public interface ProfilService {
    Profil getProfil(Long id);
    Profil updateProfil(Profil p);
    void deleteProfil(Profil p);
    void deleteProfilById(Long id);
}
