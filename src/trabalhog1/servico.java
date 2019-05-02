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
import java.util.ArrayList;

/**
 *
 * @author bazei
 */
public class servico {
    private String Nome;
    private String Desc;
    
    
    public void setNomeServ(String NomeServ){
        this.Nome = NomeServ;
    }
    public String getNomeServ(){
        return (this.Nome);
    }
    public void setDescServ(String DescServ){
        this.Desc = DescServ;
    }
    public String getDescServ(){
        return (this.Desc);
    }
    public void gravarCliente(ArrayList<servico> pessoa) {
        File arq = new File("servico.dat");
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
            inter.lblErroServ.setText(errol);
        }
        
      }
    
    public ArrayList<servico> lerArquivo() {
        String errol = "Testando";
        ArrayList<servico> lista = new ArrayList();
        try {
          File arq = new File("servico.dat");
          if (arq.exists()) {
             ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
             lista = (ArrayList<servico>)objInput.readObject();
             objInput.close();
          }
        } catch(IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
            errol = erro1.getMessage();
            Interface inter = new Interface();
            inter.lblErroServ.setText("Erro: "+ erro1);
        } catch(ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
            errol = erro2.getMessage();
            Interface inter = new Interface();
            inter.lblErroServ.setText("Erro: "+erro2);
        }
        
        return(lista);
      }
}
