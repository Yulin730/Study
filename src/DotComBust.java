
import java.util.*;
public class DotComBust {
private GameHelper helper = new GameHelper();
private ArrayList<DotCom>dotComsList = new ArrayList<DotCom>();
private int numOfGuesses = 0;
private void setUpGame() {
	DotCom one = new DotCom();
	one.setNames("amazon.com");
	DotCom two = new DotCom();
	two.setNames("google.com");
	DotCom three = new DotCom();
	three.setNames("facebook.com");
	dotComsList.add(one);
	dotComsList.add(two);
	dotComsList.add(three);
	
	System.out.println("Your goal is to sink three dot coms.");
	System.out.println("amazon.com" + " google.com" + "facebook.com");
	System.out.println("Try to sink them al inthe fewest number of guesses");
	
	for (DotCom dotComToSet : dotComsList){
		ArrayList<String> newLocation = helper.placeDotCom(3);
		dotComToSet.setLocationCells(newLocation);
	}//close for loop
}//close setUpGame method
private void startPlaying(){
	while(!dotComsList.isEmpty()){
		String userGuess = helper.getUserInput("Enter a Guess");
		checkUserGuess(userGuess);
	}//close while
	finishGame();
}
private void checkUserGuess(String userGuess){
	numOfGuesses ++;
	String result = "miss";
	for (int x =0; x<dotComsList.size(); x++){
		result =dotComsList.get(x).checkYourself(userGuess);
		if(result.equals("hit")){
			break;
		}
		if(result.equals("kill")){
			dotComsList.remove(x);
			break;
		}
		}//close for
	System.out.println(result);		
	}//close method
private void finishGame(){
	System.out.println("All Dot Comes are dead! Your stock is now worthless.");
	if (numOfGuesses <= 18){
		System.out.println("it only took you " + numOfGuesses + "guesses.");
		System.out.println(" You got out before your options sank");
	}else {
		System.out.println("Took you long enough. " + numOfGuesses + "guesses. ");
	}
}
public static void main(String[] args) {
	DotComBust game = new DotComBust();
	game.setUpGame();
	game.startPlaying();
}
}
