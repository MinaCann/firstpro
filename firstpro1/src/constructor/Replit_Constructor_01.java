package constructor;

import java.util.Scanner;

public class Replit_Constructor_01 {
	/*Write a Scrabble Game for two person Rules OK== 1- At the beginning Ask to first Player enter a word for starting game OK 2- Then change the player ask to new player if given word is valid or not OK i) If new player accepts the given word add number of letters in the word as points to player who wrote the word And go to step 3 OK ii) If new player does not accept the word as valid then print "Invalid word, player X(Current player) won the game" and finish the game

     OK 3- Ask to users if user want to continue game or not OK i) If player want to continue, OK ask to user a letter to add to word OK and ask to user side to add (beginning or end) OK then add letter to word and run step 2

      OK ii) If player does not want to continue then print "Game Finished" and print points and winner
    */

	public static void main(String[] args) {
		
			
		game();

	}
	public static void game() {
		boolean currentPlayer=true;
		
		int[] scores=new int[2];//[player1,player2]
		Scanner input= new Scanner(System.in);
		System.out.println("First player name?");
		String firstPlayer=input.nextLine();
		System.out.println("Second player name?");
		String secondPlayer=input.nextLine();
		
		String activePlayer=firstPlayer;
		
        System.out.println("activetPlayer: Give me a word.");
        String firstWord=input.next();
        int activeScore=firstWord.length();
        activePlayer=secondPlayer;
  
        	while(activePlayer==secondPlayer) {
        		System.out.println("Hey " +activePlayer+" "+firstWord+" valid or not?(Y/N)");
        		char answer=input.next().toUpperCase().charAt(0);
            	if(answer=='N') {
            		System.out.println("Invalid word," +activePlayer+ " player won the game");
            	   System.exit(1);
        	   }else if(answer=='Y') {
        		   if(activePlayer==firstPlayer) {
        			   scores[1]+=activeScore; 
        			   activeScore=0;
        		   }else if(activePlayer==secondPlayer) {
        			   scores[0]+=firstWord.length();
        			   activeScore=0;
        		   }
        		  
        		   System.out.println(activePlayer+ " Do you want to continue?");
        		   char answer2=input.next().toUpperCase().charAt(0);
        		   if(answer2=='N') {
        			   System.out.println("Thanks for playing...");
        			   System.out.println("Points: " + firstPlayer+ " = "+scores[0]+"\n" +secondPlayer+" = " +scores[1]);
        			   System.exit(2);
        	   }else if(answer2=='Y') {
        		   System.out.println(activePlayer+ " Give me your word.");
        		   String word=input.next();
        		   activeScore=word.length();
        		   System.out.println(activePlayer+ ": Do you want to add a word to the end of the "+firstWord+" to the beginning of" +" the " +firstWord+"(1/2)");
        		  int  answer3=input.nextInt();
        		  if(answer3==1) {
        			  firstWord=firstWord+word;
        		  }else {
        			  firstWord=word+firstWord;
        		  }  
        	   }else {
        		   throw new WrongAnswerException("Just yes or No accepted.");
        	   }
        	   }else {
					throw new WrongAnswerException("Just Yes or No accepted.");
					
        	   }
        	   
            	if(activePlayer==firstPlayer) {
            		activePlayer=firstPlayer;
            	}else if(activePlayer==secondPlayer) {
            		activePlayer=secondPlayer;
            	}
        	
            	
            }
            
    	}
}

	class WrongAnswerException extends RuntimeException{
		WrongAnswerException(String message){
		
			super(message);
		}
	
	}

        
        
	


