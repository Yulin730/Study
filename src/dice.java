import java.util.Random;
/**
 * @author yulinfeng
 *
 */
public class dice {
	public static void main(String[] args) {
		Random dicethrow = new Random();
		for(int i = 1; i<=100 ; i++){
			int number = 1 + dicethrow.nextInt(6);
			System.out.println("你掷出了 "+number);
			if (number == 6){
			System.out.println("恭喜！ 你的飞机起飞了");
			System.out.println("你用了 " + i + " 次机会");
			break;
			}
		}
	}
}
