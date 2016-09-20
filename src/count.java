
public class count {
	int myCount = 0;
	static int ourCount = 0;
	void increment() {
		myCount++;
		ourCount++;
	}
	public static void main(String[] args) {
		count count1 = new count();
		count count2 = new count();
		count1.increment();
		count1.increment();
		count2.increment();
		System.out.println("counter 1:" + count1.myCount + " "
				+ count.ourCount);
		System.out.println("counter 2:" + count2.myCount + " "
				+ count.ourCount);
	}
}
