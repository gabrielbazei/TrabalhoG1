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
}
