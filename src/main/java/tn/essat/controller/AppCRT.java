package tn.essat.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IMessage;
import tn.essat.dao.IUtilisateur;
import tn.essat.model.Message;
import tn.essat.model.Utilisateur;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest")


public class AppCRT {
	
@Autowired
IUtilisateur daou;
@Autowired
IMessage daom;

@GetMapping("/utilisateurs")
public List<Utilisateur> f1(){
return daou.findAll();
}

@GetMapping("/utilisateur/{id}")  
public Utilisateur f2(@PathVariable int id ){
    Optional<Utilisateur>  u=daou.findById(id);
    if (u.isPresent()) {
  	  return u.get();  }
    else {return null;}

}

@GetMapping("/messagesrecus/{id}") //les messages reçus d'un user donnée
public List<Message> getMessagesRecus(@PathVariable Integer id) {
return daom.findByUserreceiveId(id);
}

@GetMapping("/messagesenvoyes/{id}") //les messages envoyés d'un user donnée
public List<Message> getMessagesenvoyes(@PathVariable Integer id) {
return daom.findByUsersendId(id);
}
 
@GetMapping("/message/{id}")
public  Message f3(@PathVariable int id ){
	
  Optional<Message> m= daom.findById(id);
  if (m.isPresent()) {
	  return m.get();  }
  else {return null;}
}

@PostMapping("/addMessage")
public void f3(@RequestBody Message msg)
{
daom.save(msg);
}

@DeleteMapping("/delMessage/{id}")
public void f4(@PathVariable int id) {
	
daom.deleteById(id);
}



@GetMapping("/verif/{username}/{password}")

public   Utilisateur f5(@PathVariable String username, @PathVariable String password) {
	Utilisateur u=daou.findByUsernameAndPassword(username,password); 
	return u ;
   
}




}
