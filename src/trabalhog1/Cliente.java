
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
  public Cliente(String nome, String cpf, String sexo, String Email, String tel, String nasc, String endereco, String civil, boolean ativado){
    this.nome = nome;
    this.sexo = sexo;
    this.cpf = cpf;
    this.email = Email;
    this.telefone = tel;
    this.nasc = nasc;
    this.endereco = endereco;
    this.civil = civil;
    this.ativado = ativado;
  }
  public void gravar(ArrayList<Cliente> pessoa) {
        File arq = new File("cliente.dat");
        try {
          arq.delete(); //Deleta o Arquivo existente
          arq.createNewFile(); // Cria um novo arquivo
          ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
          objOutput.writeObject(pessoa);
          objOutput.close();
        } catch(IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
        }
        
      }
    
    public ArrayList<Cliente> ler() {
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
        } catch(ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
        }
        
        return(lista);
      }
}
