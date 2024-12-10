/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locale;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author alunni
 */
public class Locale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        ArrayList<prodotto> menu= new ArrayList<prodotto>();
        int s = 0;
        System.out.println("1) Aggiungi prodotto");
        System.out.println("2) Menu");
        System.out.println("3) Scontrino");
        System.out.println("Decidi operazione e inserisci il numero:");
        try{
            s= input.nextInt();

        }
        catch(Exception e){
            System.out.println("inserisci  numero:");
        
        }
        switch(s){
            case 1 :
                aggiungiProdotto();
                break;
            case 2 :
                menu();
                break;
            case 3 :
                scontrino();
                break;
        }
            
        

    }
    public static void aggiungiProdotto(){
        System.out.println("prodotto");
    }
    public static void menu(){
        System.out.println("==========MENU'==========\n"
                + "\n"
                + "~~~~BEVANDE~~~~\n"
                + "1.Caffe' 1,20EUR\n"
                + "2.Cappuccino 1,50EUR\n"
                + "3.Gingseng 1,50EUR\n"
                + "4.Gingseng lungo 1,80EUR\n"
                + "5.Succo 1,50EUR\n"
                + "6.Acqua 1,00EUR\n"
                + "7.Cocacola 2,50EUR\n"
                + "8.Fanta 2,50EUR\n"
                + "9.Sprite 2,50EUR\n"
                + "10.Cocacola zero 2,50EUR\n"
                + "11.Monster 3EUR\n"
                + "12.Schweppes 2,80EUR\n"
                + "13.JageirMaister 3EUR\n"
                + "14.Vodka 3EUR\n"
                + "15.Aperol Spritz 6EUR\n"
                + "16.Birra 3EUR\n"
                + "\n"
                + "~~~~DOLCI~~~~\n"
                + "17.Cornetto 1,20EUR\n"
                + "18.Ciambella 1,20EUR\n"
                + "19.Bomba alla crema 1,20EUR\n"
                + "20.Mignon 1EUR\n"
                + "21.Cannolo 1,50EUR\n"
                + "22.Cassata 3EUR\n"
                + "23.Crostata 2,50EUR"
                + "24.Torta della nonna 2,50EUR\n"
                + "25.Ciambellone 2,50EUR\n"
                + "26.Treccia 1,20EUR\n"
                + "27.Gelato 2gusti 2,20EUR\n"
                + "28.Gelato 3 gusti 2,50EUR\n"
                + "\n"
                + "~~~~SALATO~~~~\n"
                + "29.Tramezzino 2,50EUR\n"
                + "30.Pizzetta 2EUR\n"
                + "31.Patatine 1,50EUR\n"
                + "32.Panino con Cotoletta 3,50EUR\n"
                + "33.Piadina 3,50EUR\n"
                + "34.Girella 3EUR\n"
                + "35.Panzerotto 2,50EUR\n"
                + "36.Focaccia 3EUR\n"
                + "37.Cornetto salato 3EUR\n"
                + "38.Toast 2,50EUR\n"
                + "39.Hotdog 2,50EUR\n"
                + "40.Aperitivo completo 10EUR");
    }
    public static void scontrino(){
        System.out.println("scontrino");
    }
}
