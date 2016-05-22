package autoboxingExample;

public class Autoboxing {

	public static void main(String[] args) {

		Integer integer1 = new Integer(5); //Inboxing
		Integer integer2 = 5; //Auto-inboxing

		int a = integer1.intValue(); //Outboxing
		int b = integer1; //Auto-outboxing

		System.out.println(integer1);
		System.out.println(integer2);
		System.out.println(a);
		System.out.println(b);
	}
}
