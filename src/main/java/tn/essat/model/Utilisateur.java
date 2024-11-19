package tn.essat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Utilisateur  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer id;
	
	   private String nom;
	   private String username;
	   @JsonIgnore
	   private String password;
	public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
	}
	public Utilisateur(Integer id, String nom, String username, String password) {
	super();
	this.id = id;
	this.nom = nom;
	this.username = username;
	this.password = password;
	}
	public Integer getId() {
	return id;
	}
	public void setId(Integer id) {
	this.id = id;
	}
	public String getNom() {
	return nom;
	}
	public void setNom(String nom) {
	this.nom = nom;
	}
	public String getUsername() {
	return username;
	}
	public void setUsername(String username) {
	this.username = username;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}
	
	   
	   
	   
}
