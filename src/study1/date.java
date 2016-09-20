package study1;
import java.util.*;

 class date {
	 public static void main(String[] args){
		 Random dice = new Random();
		 int number;
		 
		 for (int counter =1; counter<=100; counter++){
			 number = dice.nextInt(2);
			 System.out.println(number);
			 
		 }
		 
	 }

}
