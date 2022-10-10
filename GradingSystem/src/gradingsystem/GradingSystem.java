/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradingsystem;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class GradingSystem {

   public static void log_in()
   {
   System.out.println();
   }
   
    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       byte Score;
       String name;
       
       for(int i = 1; i <= 100; i++){
        
        System.out.println("Enter name");
        name = input.next();
        
        System.out.println("Enter your Score");
        score = input.nextByte();
        
        if (score >= 90 && score <= 100) {
            System.out.println("Your name is:" + name + "And your Grade is: A")
        }
        
       
        
        
        
        
        
        
    }
    }
    
}
