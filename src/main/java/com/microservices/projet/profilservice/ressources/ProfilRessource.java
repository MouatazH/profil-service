package com.microservices.projet.profilservice.ressources;

import com.microservices.projet.profilservice.entities.Profil;
import com.microservices.projet.profilservice.proxy.CompteProxy;
import com.microservices.projet.profilservice.services.ProfilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profil")
public class ProfilRessource {

    @Autowired
    ProfilServiceImpl profilService;

    @Autowired
    CompteProxy compteProxy;

    @GetMapping()
     public Profil getProfil(){
        Long proId = compteProxy.getProfilId();
        return profilService.getProfil(proId);
    }

    @PutMapping
    public void modifProfil(@RequestBody Profil profil){
        profilService.updateProfil(profil);
    }

    @DeleteMapping("/{proId}")
    public void suppProfil(@PathVariable Long proId){
        profilService.deleteProfilById(proId);
    }

}
