
package trabalhog1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Documento {
    Interface inter = new Interface();
    /*public static void Gravar(Cliente lista){
     try {
      FileOutputStream arquivoGrav = new FileOutputStream("saida.dat");
      ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
      objGravar.writeObject(lista);
      objGravar.flush();
      objGravar.close();
      arquivoGrav.flush();
      arquivoGrav.close();
    }
    catch(Exception e) {e.printStackTrace();}
    
    }
    public static void Ler (){
        try {
      FileInputStream arquivoLeitura = new FileInputStream("saida.dat");
      ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
      System.out.println(objLeitura.readObject());
      objLeitura.close();
      arquivoLeitura.close();
    }
    catch(Exception e) {e.printStackTrace();}
    }*/
    //Codigo n�o utilizado para gravar objetos 
    //----------------------------------------------------------
    /*public static void gravarArquivo(ArrayList<Cliente> pessoa) {
        File arq = new File("saida.dat");
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
        }
        FuncErroBanco(errol);
      }
    
    public static ArrayList<Cliente> lerArquivo() {
        String errol = "Testando";
        ArrayList<Cliente> lista = new ArrayList();
        try {
          File arq = new File("saida.dat");
          if (arq.exists()) {
             ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
             lista = (ArrayList<Cliente>)objInput.readObject();
             objInput.close();
          }
        } catch(IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
            errol = erro1.getMessage();
        } catch(ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
            errol = erro2.getMessage();
        }
        FuncErroBanco(errol);
        return(lista);
      }*/
}
