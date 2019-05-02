package trabalhog1;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication66 {
    /*public static void main(String[] args){
    ArrayList<Cliente> pessoa = new ArrayList<Cliente>();
    String sexo="",nome="",cpf="";
    Scanner ler = new Scanner(System.in);
    while (true) {
        System.out.printf("Ficha numero: " + (pessoa.size()+1));
        System.out.printf("Informe o nome da pessoa, FIM para encerrar: ");
        	nome = ler.nextLine();
        if (nome.equalsIgnoreCase("FIM"))
           break;
        System.out.printf("Informe o Cpf: ");
        	cpf = ler.nextLine();
        System.out.printf("Informe o Sexo: ");
        	sexo = ler.nextLine();
        pessoa.add(new Cliente(nome, cpf, sexo));
      }
    Documento.gravarArquivo(pessoa);
    
    ArrayList<Cliente> Lei = Documento.lerArquivo();
    for (Cliente obj : Lei) {
        System.out.println (obj.nome + "," + obj.cpf + "," + obj.email);
    }*/
    /*
  	M�todo antigo (at� JDK 1.4):
		List lista = new ArrayList();
		... preencha a lista com seus objetos;
		for (int i = 0; i < lista.size(); ++i) {
		    SuaClasse obj = (SuaClasse) lista.get(i);
		    System.out.println (obj.x1 + "," + obj.x2);
		}
	
	JDK 5.0 ou superior:
	
		List<SuaClasse> lista = new ArrayList<SuaClasse>();
		... preencha a lista com seus objetos;
		for (SuaClasse obj : lista) {
		    System.out.println (obj.x1 + "," + obj.x2);
		}
	
  }*/
}
