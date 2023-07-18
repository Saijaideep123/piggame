package com.mono.game;

import java.util.Scanner;

public class Piggame1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status=true;
		while(status)
		{
		Scanner sc=new Scanner(System.in);
		
		int targetScore=20;
		int turns=0;
		int currentPlayerScore=0;
		    status=false;
		   
		    while (currentPlayerScore < targetScore ) {
		    	 boolean status1=true;
					while(status1)
					{
            System.out.println("Roll (r) or Hold (h)?");
            String choice = sc.nextLine();
              if (choice.equalsIgnoreCase("r")) {
                int diceRoll = (int)(Math.random() * 6) + 1; 

                if (diceRoll!= 1) {
                	currentPlayerScore += diceRoll;  
                    System.out.println("Die: " + diceRoll + ". Current score: " + currentPlayerScore);  
                }
            } 
             
            else if (choice.equalsIgnoreCase("h")) {
                System.out.println("the no of turns:"+turns++);
            }
            else {
        currentPlayerScore=0;
        System.out.println("Die a 1! Score reset to 0.");
            }    
            
		    
            turns++;    
		
        

        if (currentPlayerScore >= targetScore) {
            System.out.println("Congratulations! You reached or exceeded the target score of 20 in " + turns + " turns.");
            System.out.println("Final score: " + currentPlayerScore);
		}
        
        status1=false;
					}
			}
					
		    
		  
		    
		    System.out.println("Do you want to play again?(yes/no)");
			String play=sc.next();
			status=play.equals("yes");
			
            
            
		}
		System.out.println("thank you");
	}
		}


