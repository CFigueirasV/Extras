/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarearectangulo;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class ExemploAreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       float base=0,altura=0,area=0;
       System.out.println("teclea base:");
       base=ler.nextFloat()
               ;
       System.out.println("teclea altura:");
       altura=ler.nextFloat();
       area=base*altura;
       System.out.println("area="+area);

    }
    
}
