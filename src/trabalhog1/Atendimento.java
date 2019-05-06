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

public class Atendimento implements Serializable {
  private int cdg=0;
  public String data;
  public String horario;
  public Funcionario func;
  public Cliente cliente;
  public String status;
  public String desc;
  public servico serv;
  private int t=0;
  public Atendimento (){
  }
  public Atendimento(String data, String horario, Funcionario func, Cliente cliente, String status, String desc, servico serv){
    this.data=data;
    this.horario=horario;
    this.func=func;
    this.cliente=cliente;
    this.status=status;
    this.desc=desc;
    this.serv=serv;
    cdg=t;
    t++;
  }
  public int getCdg(){
      return cdg;
  }
  public void gravar(ArrayList<Atendimento> pessoa) {
        File arq = new File("Atendimento.dat");
        //String errol = "Testando";
        try {
          //arq.delete(); //Deleta o Arquivo existente
          
          arq.createNewFile(); // Cria um novo arquivo
          ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
          objOutput.writeObject(pessoa);
          objOutput.close();
        } catch(IOException erro) {
            //System.out.printf("Erro: %s", erro.getMessage());
        }
        
      }
    
    public ArrayList<Atendimento> ler() {
        //String errol = "Testando";
        ArrayList<Atendimento> lista = new ArrayList();
        try {
          File arq = new File("Atendimento.dat");
          if (arq.exists()) {
             ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
             lista = (ArrayList<Atendimento>)objInput.readObject();
             objInput.close();
          } else {
              System.out.println("Arquivo não encontrado");
          }
        } catch(IOException erro1) {
            //System.out.printf("Erro: %s", erro1.getMessage());
        } catch(ClassNotFoundException erro2) {
            //System.out.printf("Erro: %s", erro2.getMessage());
        }
        
        return(lista);
      }
}

