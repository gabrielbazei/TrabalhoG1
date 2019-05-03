/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhog1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author bazei
 */
public class servico implements Serializable {
    public String Nome;
    public String Desc;
    
    
    public servico (){
    }
    public servico (String nome, String Desc){
        this.Nome = nome;
        this.Desc = Desc;
    }
    public void gravar(ArrayList<servico> pessoa) {
        File arq = new File("servico.dat");
        try {
          //arq.delete(); //Deleta o Arquivo existente
          //arq.createNewFile(); // Cria um novo arquivo
          if (!arq.exists()) {
              System.out.println("Entrou no if do arquivo do serviço");
              arq.createNewFile();
          }
          ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
          objOutput.writeObject(pessoa);
          objOutput.close();
        } catch(IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
        }
        
      }
    
    public ArrayList<servico> ler() {
        ArrayList<servico> lista = new ArrayList();
        try {
          File arq = new File("servico.dat");
          if (arq.exists()) {
             ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
             lista = (ArrayList<servico>)objInput.readObject();
             objInput.close();
          }
        } catch(IOException erro1) {
            System.out.printf("Erro 1: %s", erro1.getMessage());
        } catch(ClassNotFoundException erro2) {
            System.out.printf("Erro 2: %s", erro2.getMessage());
        }
        
        return(lista);
      }
}
