package com.microservices.projet.profilservice.repos;

import com.microservices.projet.profilservice.entities.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRepository extends JpaRepository<Profil, Long> {
}
