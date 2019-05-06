
package trabalhog1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class FormataDatas {
public Date StringToDate(String date){
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            if(!date.equalsIgnoreCase("  /  /  ")){
                data = new Date(fmt.parse(date).getTime());
            }
        } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        return data;
    }
public String DateToString(Date date){
        SimpleDateFormat formatBra;     
       formatBra = new SimpleDateFormat("dd/MM/yyyy");  
       try {  
          java.util.Date newData = formatBra.parse(date.toString());  
          return formatBra.format(newData);  
       } catch (ParseException Ex) {  
          return "Erro na conversão da data";  
       }  
    }
    /*public static void main(String[] args) {
        Atendimento test = new Atendimento();
        ArrayList<Atendimento> pessoa = new ArrayList<Atendimento>();
        ArrayList<Cliente> ClienteArray = new ArrayList<Cliente>();
        Cliente FuncCliente = new Cliente();
        ClienteArray=FuncCliente.ler();
        ArrayList<Funcionario> FuncArray = new ArrayList<Funcionario>();
        Funcionario FuncFunc = new Funcionario();
        FuncArray=FuncFunc.ler();
        ArrayList<servico> ServArray = new ArrayList<servico>();
        servico servFunc = new servico();
        ServArray=servFunc.ler();
        
        pessoa.add(new Atendimento("15/05/1997","14",FuncArray.get(0),ClienteArray.get(0),"test","test",ServArray.get(0)));
        test.gravar(pessoa);
    }*/
    /*public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        ArrayList<Date> datas = new ArrayList<Date>();
        DateFormat formataData = DateFormat.getDateInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date temp= new Date();
        temp=StringDate("12/03/2012");
        datas.add(temp);
        temp=StringDate("05/04/2020");
        datas.add(temp);
        temp=StringDate("10/10/2008");
        datas.add(temp);
        Collections.sort(datas);
        for (Date obj :  datas){
            System.out.println("Data atual com formatação: "+ formataData.format(obj));
        }
    }*/
}
