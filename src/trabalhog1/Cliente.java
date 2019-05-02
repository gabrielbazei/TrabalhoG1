
package trabalhog1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

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
  public void gravarCliente(ArrayList<Cliente> pessoa) {
        File arq = new File("cliente.dat");
        String errol = "Testando";
        try {
          //arq.delete(); //Deleta o Arquivo existente
          //arq.createNewFile(); // Cria um novo arquivo
      
          ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
          objOutput.writeObject(pessoa);
          objOutput.close();
          errol= "sucesso";
        } catch(IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
            errol = "Erro: "+erro.getMessage();
            Interface inter = new Interface();
            inter.lblCadClienteErro.setText(errol);
        }
        
      }
    
    public ArrayList<Cliente> lerArquivo() {
        String errol = "Testando";
        ArrayList<Cliente> lista = new ArrayList();
        try {
          File arq = new File("cliente.dat");
          if (arq.exists()) {
             ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
             lista = (ArrayList<Cliente>)objInput.readObject();
             objInput.close();
          }
        } catch(IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
            errol = erro1.getMessage();
            Interface inter = new Interface();
            inter.lblCadClienteErro.setText(errol);
        } catch(ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
            errol = erro2.getMessage();
            Interface inter = new Interface();
            inter.lblCadClienteErro.setText(errol);
        }
        
        return(lista);
      }
}
