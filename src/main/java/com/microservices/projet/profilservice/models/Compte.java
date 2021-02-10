package com.microservices.projet.profilservice.models;

public class Compte {

    private Long compteId;
    private String userName;
    private String password;
    private Long profilId;

    public Compte() {
    }

    public Compte(Long compteId, String userName, String password, Long profilId) {
        this.compteId = compteId;
        this.userName = userName;
        this.password = password;
        this.profilId = profilId;
    }

    public Long getCompteId() {
        return compteId;
    }

    public void setCompteId(Long compteId) {
        this.compteId = compteId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getProfilId() {
        return profilId;
    }

    public void setProfilId(Long profilId) {
        this.profilId = profilId;
    }
}
