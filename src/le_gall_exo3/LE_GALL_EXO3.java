/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package le_gall_exo3;

import java.util.Scanner;

/**
 *
 * @author victorlegall
 */
public class LE_GALL_EXO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter the operator :\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo\n");
        int Meth;
        Scanner sc = new Scanner(System.in);
        Meth=sc.nextInt();
        int res=0;
        if (Meth <= 0 || Meth >5) {
            System.out.println("Wrong method chosen");
            System.exit(0);
        }
        
        System.out.println("Operande 1 : ");
            int Op1;
            Op1=sc.nextInt();
            System.out.println("Operande 2 : ");
            int Op2;
            Op2=sc.nextInt();
            switch(Meth){
                case 1 -> res=Op1+Op2 ;
                
                case 2 -> res=Op1-Op2 ;
                   
                case 3 -> res=Op1*Op2 ;
                
                case 4 -> res=Op1/Op2 ;
                
                case 5 -> res=Op1%Op2 ;
                
            }
            System.out.println("Result : " + res);
        }
    }