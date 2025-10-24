
import java.util.Scanner;

public class linkedListTest {
	protected static linkedlist S;
	public static void main(String[] args) {
		// int num;
		S = new linkedlist();
		Scanner x = new Scanner(System.in);
		for (int i = 0; i < 5; ++i) {
			System.out.println("Enter a number");
			S.Insert(x.nextInt());
		}
		System.out.println("\nCreated List is:");
		S.display();
		System.out.println("\n-----List Test Over-----");
	}
}
