/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor;
import java.util.regex.Matcher; //Esta libreria es la encargada de leer el patron.
import java.util.regex.Pattern; //Esta libreria es la encargada de definir el patron.
/**
 *
 * @author AlfaroFito
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String patron = ("(for)|([a-zA-Z]+)|([>|<|=]+)|([0-9]+)|([(|)]+)|([{|}]+)|(;)");
        String texto = ("for ( int i = 0 ; i < 2 ; i ++ ) { HolaMundo ; }");
        
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(texto);
        while(matcher.find()){
            String tokenTipo1 = matcher.group(1);
            String tokenTipo2 = matcher.group(2);
            String tokenTipo3 = matcher.group(3);
            String tokenTipo4 = matcher.group(4);
            String tokenTipo5 = matcher.group(5);
            String tokenTipo6 = matcher.group(6);
            String tokenTipo7 = matcher.group(7);
            
            if(tokenTipo1 != null){
                System.out.println("1Palabra reservada: " + tokenTipo1);
            }else if(tokenTipo2 != null){
                System.out.println("2Letra: " + tokenTipo2);
            }else if(tokenTipo3 != null){
                System.out.println("3Comparacion: " + tokenTipo3);
            }else if(tokenTipo4 != null){
                System.out.println("4Entero: " + tokenTipo4);
            }else if(tokenTipo5 != null){
                System.out.println("5Parentesis: " + tokenTipo5);
            }else if(tokenTipo6 != null){
                System.out.println("6Llaves: " + tokenTipo6);
            }else{
                System.out.println("7Punto y coma: " + tokenTipo7);
            }
        }
    }
    
}
