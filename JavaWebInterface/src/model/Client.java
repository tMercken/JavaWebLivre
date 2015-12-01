/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.GregorianCalendar;

/**
 *
 * @author client
 */
public class Client {
    public Integer id;
    public String mail;
    public String password;
    public String nom;
    public String prenom;
    public GregorianCalendar dateDeNaissance;
    public String sex;
    public Integer telephone;
    public String adresse;
    
    public Client () {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public GregorianCalendar getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(GregorianCalendar dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
