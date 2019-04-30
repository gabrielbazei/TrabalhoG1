
package trabalhog1;

import javaapplication66.*;
import java.io.Serializable;

public class Cliente implements Serializable {
  public String nome;
  public String email;
  public String cpf;
  public String telefone;
  public String nasc;
  public String endereco;
  public String sexo;
  public String civil;
  public boolean ativado;
  
  public Cliente (){
  }
  public Cliente(String nome, String cpf, String sexo){
    this.nome = nome;
    this.email = sexo;
    this.cpf = cpf;
  }
  public String getCpf(){
    return cpf;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getEmail(){
    return email;
  }
  public void setEmail(String sexo){
    this.email = sexo; 
  }
}
