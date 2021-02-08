/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author sachagozlan
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //cette ligne est obligatoire 
      //pour ouvoir fair une saisie au clavier 
        Scanner sc =new Scanner (System.in);
            double cote; 
            System.out.println("quelle est la valeur de votre cote ? ");
            cote = sc.nextDouble();
            //v1 = ça marche mais pas genial:)
            System.out.println(cote * cote );
            
            //v2 = yesss
            System.out.println("l'air de votre carré est de " + cote * cote + "cm^2");
         
            
           //v3
            
   }
    
    
}
