package tn.essat.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Message {
	@Id@GeneratedValue(strategy= GenerationType.IDENTITY)

	private Integer id;
	   private String sujet;
	   private String contenu;
	   @ManyToOne@JoinColumn(name="usersend_id")
	   private Utilisateur usersend;
	   @ManyToOne@JoinColumn(name="userreceive_id")
	   private Utilisateur userreceive;
	   private int etat;
	public Message() {
	super();
	// TODO Auto-generated constructor stub
	}
	public Message(Integer id, String sujet, String contenu, Utilisateur usersend, Utilisateur userreceive,
	int etat) {
	super();
	this.id = id;
	this.sujet = sujet;
	this.contenu = contenu;
	this.usersend = usersend;
	this.userreceive = userreceive;
	this.etat = etat;
	}
	public Integer getId() {
	return id;
	}
	public void setId(Integer id) {
	this.id = id;
	}
	public String getSujet() {
	return sujet;
	}
	public void setSujet(String sujet) {
	this.sujet = sujet;
	}
	public String getContenu() {
	return contenu;
	}
	public void setContenu(String contenu) {
	this.contenu = contenu;
	}
	public Utilisateur getUsersend() {
	return usersend;
	}
	public void setUsersend(Utilisateur usersend) {
	this.usersend = usersend;
	}
	public Utilisateur getUserreceive() {
	return userreceive;
	}
	public void setUserreceive(Utilisateur userreceive) {
	this.userreceive = userreceive;
	}
	public int getEtat() {
	return etat;
	}
	public void setEtat(int etat) {
	this.etat = etat;
	}
	   
	   

}
