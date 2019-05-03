/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhog1;

/**
 *
 * @author bazei
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Horario implements Serializable {
  public String data;
  public String horario;
  public Funcionario func;
  public Cliente cliente;
  
  public Horario (){
  }
  public Horario (String data, String horario, Funcionario func, Cliente cliente){
    this.data=data;
    this.horario=horario;
    this.func=func;
    this.cliente=cliente;
  }
  public void gravar(ArrayList<Horario> pessoa) {
        File arq = new File("Horario.dat");
        //String errol = "Testando";
        try {
          //arq.delete(); //Deleta o Arquivo existente
          //arq.createNewFile(); // Cria um novo arquivo
          if (!arq.exists()) {
              arq.createNewFile();
          }
          ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
          objOutput.writeObject(pessoa);
          objOutput.close();
          //errol= "sucesso";
        } catch(IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
            //errol = "Erro: "+erro.getMessage();
            Interface inter = new Interface();
            //inter.lblCadFuncErro.setText(errol);
        }
        
      }
    
    public ArrayList<Horario> ler() {
        //String errol = "Testando";
        ArrayList<Horario> lista = new ArrayList();
        try {
          File arq = new File("Horario.dat");
          if (arq.exists()) {
             ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
             lista = (ArrayList<Horario>)objInput.readObject();
             objInput.close();
          }
        } catch(IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
            //errol = erro1.getMessage();
            Interface inter = new Interface();
            //inter.lblCadFuncErro.setText(errol);
        } catch(ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
            //errol = erro2.getMessage();
            Interface inter = new Interface();
            //inter.lblCadFuncErro.setText(errol);
        }
        
        return(lista);
      }
}

