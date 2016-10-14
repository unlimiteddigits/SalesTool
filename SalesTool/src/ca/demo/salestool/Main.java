package ca.demo.salestool;


public class Main {
	public static void main(String[] args){
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People");
		System.out.println("This app shows Sales Data");

		System.out.println("Test 1-from eclipse");
		System.out.println("Test 2-from web");
		System.out.println("Test 3-from eclipse after rebase");
		System.out.println("Test 4-from web to test pull from upstream");
		System.out.println("Test 5-from eclipse had to pull from upstream into current branch");
		
	}
}
