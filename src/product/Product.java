/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
            int n=sc.nextInt();
            int sum=1;
            for (int i=1;i<=n;i++){
            sum*=i;   
        }
         System.out.println(sum);
    }
    
}
