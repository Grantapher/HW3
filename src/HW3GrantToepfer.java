import java.util.Scanner;

public class HW3GrantToepfer {
	private static double d1;
	private static double d2;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		while(true) {
			System.out
					.println("Insert two doubles separated by a space: ");
			d1 = sr.nextDouble();
			d2 = sr.nextDouble();
			new Thread(add).start();
			new Thread(subtract).start();
			new Thread(multiply).start();
			new Thread(divide).start();
		}
	}
	public static Runnable add = new Runnable() {
		public void run() {
			System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
		}
	};
	public static Runnable subtract = new Runnable() {
		public void run() {
			System.out.println(d1 + " - " + d2 + " = " + (d1 - d2));
		}
	};
	public static Runnable multiply = new Runnable() {
		public void run() {
			System.out.println(d1 + " * " + d2 + " = " + (d1 * d2));
		}
	};
	public static Runnable divide = new Runnable() {
		public void run() {
			System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
		}
	};
}
