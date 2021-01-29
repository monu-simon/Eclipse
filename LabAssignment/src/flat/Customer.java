package flat;

public class Customer {
	public static void main(String[] args) {

		OneBHK obhk1 = new OneBHK(4020, 500, 500000);
		TwoBHK f1 = new TwoBHK(23456, obhk1);
		
		
		System.out.println("*********************");
		f1.Show();
		
	}

}
