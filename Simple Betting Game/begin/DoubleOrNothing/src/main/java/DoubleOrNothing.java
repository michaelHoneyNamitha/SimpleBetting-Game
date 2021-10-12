import java.util.*;

/*
 * A user will start off with 10 points and throughout the game, 
 * the user has the option to take a chance to double their points. 
 * Or, walk away with their current point value. If the user decides
 * to gamble their points in the chance of doubling,
 * the program should randomly to decide whether 
 * the points get doubled or the user loses it all.
 */


public class DoubleOrNothing {
	private Scanner s= new Scanner(System.in);
	private Random r= new Random();
	private final static int freePoints=10;// points Given to the players at starting
	private int gamePoints=freePoints;
	private boolean continuePlaying=true;
    
	public void playGame() {
    	welcomeMsg();
    	resumePlaying();
    	int result;
    	while(this.continuePlaying) {
    		result=betting();
    		if(result==0) {
    			doublePoints();
    			resumePlaying();
    		}
    		else {
    			System.out.println("\noh Sorry !! You Have Lost all your points");
    			System.exit(0);
    		}
    	}
    	System.out.println("\nThankYou for palying! You finished with "+this.gamePoints+" Points");

    }
    public static void welcomeMsg() {
    	System.out.println("Let's play Betting Game. " + " We'll start you off with " + freePoints +" Points\n");
    	
    }
    public void resumePlaying() {
    	System.out.println("would you like to double your points? Let's bet (Type Yes to continue)");
    	this.continuePlaying=this.s.nextLine().toLowerCase().equals("yes");
    	
    }
    public int betting() {
    	return this.r.nextInt(2);
        
    }
    public void doublePoints() {
    	this.gamePoints*=2;
    	System.out.println("\nCongrats! You Doubled your Points\nYour Points: "+this.gamePoints+" Points\n");
    }
    
   }