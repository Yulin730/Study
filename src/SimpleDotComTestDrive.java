
public class SimpleDotComTestDrive {
public static void main(String[] args) {
	SimpleDotCom dot = new SimpleDotCom(); //remember to "dot"
	int[] locations = {2,3,4};
	dot.setLocationCells(locations);
	String userGuess = "2";
	 dot.checkYourself(userGuess);
	String userGuess1 = "3";
 dot.checkYourself(userGuess1);
	String userGuess2 = "4";
	 dot.checkYourself(userGuess2);
}
}
