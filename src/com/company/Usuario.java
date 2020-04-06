package com.company;

import org.w3c.dom.ls.LSOutput;

public class Usuario {
    public int senha1 = 001;
    public int senha2 = 002;
    public int senha3 = 003;
    public String nome1 = "Usuario1" + "usuario1@hotmail.com";
    public String nome2 = "Usuario2" + "usuario2@hotmail.com";
    public String nome3 = "Usuario3" + "usuario3@hotmail.com";


  public void validarConta(){
      if(senha1 && nome1 == "Usuario e senha corretos"){
          return;
      } else{
          return false;
      }
      if(senha2 && nome2 == "Usuario e senha corretos"){
          return;
      } else{
          return false;
      }
      if(senha3 && nome3 == "Usuario e senha corretos"){
          return;
      } else{
          return false;
      }

  }

}


