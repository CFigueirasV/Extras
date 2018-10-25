/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplooperadores;

/**
 *
 * @author cfigueirasvalverde
 */
public class Exemplooperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1=0,num2=4;
       System.out.println("num1= "+num1 +"\nnum2= "+num2);
       num1=num2++;
       System.out.println("(num1=num2++)"+num1 +"\nnum2= "+num2);
       num1=++num2;
       System.out.println("(num1=++num2)"+num1+"num1"+"\nnum2="+num2);
       num1=3;
       num2=4;
       int suma;
       suma=num1+num2;
       System.out.println("suma="+(num1+num2));
       //Directamente podemos facer a operacion e imos amenizando memoria.
       //Casting
       int enteiro=6;
       float decimal=2.3f;
       //Conversion automatica: cando un pequeno pasa a un grande
       decimal=enteiro;
       System.out.println(decimal);
       enteiro=(int) decimal;
       //Casting: ao reves.Un enteiro pasa a un decimal.
       
    }
    
}
