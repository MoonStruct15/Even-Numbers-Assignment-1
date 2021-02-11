/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumbers.assignment.pkg1;

/**
 *
 * @author jasmineboxley
 */
public class EvenNumbersAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
      int n = 100;        // initializing the varible so loop can stop at 100
	
	for (int i = 0; i <= n; i++) 
            
            if (i % 2 == 0)      // tells me im only going to get even numbers
                
		System.out.println(i);  //print even numbers line by line to screen
        
        
    }
    
}
