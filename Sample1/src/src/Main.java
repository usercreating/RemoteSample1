package src;

public class Main {

	public static void main(String[] args) {
		PrintHello print = new PrintHello();
		Calculate math = new Calculate();
		print.display();
		math.add(1,3);
		math.mul(2,4);
		math.div(4,2);
	}

}
