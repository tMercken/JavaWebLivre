/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author client
 */
public class Livre {
    private Integer id;
    private String image;
    private Double note;
    private float prix;
    private Promo promotionLivre;
    private Categorie categorieLivre;
    private MaisonEdition maisonEditionLivre;
    private Auteur auteurLivre;

    public Livre() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Promo getPromotionLivre() {
        return promotionLivre;
    }

    public void setPromotionLivre(Promo promotionLivre) {
        this.promotionLivre = promotionLivre;
    }

    public Categorie getCategorieLivre() {
        return categorieLivre;
    }

    public void setCategorieLivre(Categorie categorieLivre) {
        this.categorieLivre = categorieLivre;
    }

    public MaisonEdition getMaisonEditionLivre() {
        return maisonEditionLivre;
    }

    public void setMaisonEditionLivre(MaisonEdition maisonEditionLivre) {
        this.maisonEditionLivre = maisonEditionLivre;
    }

    public Auteur getAuteurLivre() {
        return auteurLivre;
    }

    public void setAuteurLivre(Auteur auteurLivre) {
        this.auteurLivre = auteurLivre;
    }
    
    
    
    
}
