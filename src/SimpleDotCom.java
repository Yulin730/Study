
public class SimpleDotCom {

	int[] locationCells;
	int numOfHits = 0;
	public void setLocationCells(int[] locs){
		locationCells = locs;
	}
	public String checkYourself (String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "Miss";
		for(int cell:locationCells){
			if (cell == guess){
				numOfHits++;
				result  = "hit!";
				break; //need to stop the loop
			}
		}
		if(numOfHits == locationCells.length){
			result= "kill!";
		}
		System.out.println(result);
	return result;
	}//close method
}//close class
