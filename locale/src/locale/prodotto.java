/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locale;

/**
 *
 * @author alunni
 */
public class prodotto {
    public int id;
    public String nome;
    public double prezzo;
    
    public prodotto(int id, String nome, double prezzo){
        this.id= id;
        this.nome=  nome;
        this.prezzo= prezzo;
    }
    
    public int getid(){
        return id;
    }
    
    public String getnome(){
        return nome;
    }
    
    public double getprezzo(){
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    
}
