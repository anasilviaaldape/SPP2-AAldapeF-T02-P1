/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.t02.p1;
import java.util.Scanner;

/**
 *
 * @author Aldape
 */
public class SPP2AALDAPEFT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ana Silvia Aldape Felizardo
        //A01410367
        //IIS
        // TODO code application logic here
        Scanner kb= new Scanner(System.in);
        double sue;
        int cate;
        int he;
        double sueT;
        
        System.out.print("Sueldo base: $ ");
        sue= kb.nextDouble();
        System.out.print("Horas extras trabajadas: ");
        he= kb.nextInt();
        System.out.println("Categoría del trabajador: ");
        cate= kb.nextInt();
        
        
        switch(cate){
            case 1:
                sueT= sue+ (30*he);
                System.out.println("El sueldo total es de $" + sueT);
                break;
            case 2: 
                sueT= sue+ (38*he);
                System.out.println("El sueldo total es de $" + sueT);
                break;
            case 3: 
                sueT= sue+ (50*he);
                System.out.println("El sueldo total es de $" + sueT);
                break;
            case 4:
                sueT= sue+ (70*he);
                System.out.println("El sueldo total es de $" + sueT);
                break;
            default:
                System.out.println("Adios :)!");
        }
                
        
        
    }
    
}
