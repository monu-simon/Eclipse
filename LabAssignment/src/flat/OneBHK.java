package flat;

public class OneBHK {
	public double roomArea;
	public double hallArea;
	public int price;

	public OneBHK(double roomArea, double hallArea, int price) {
		super();
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}

	public OneBHK() {
		super();
	}

	public void Show() {
		System.out.println("Room Area:" + roomArea);
		System.out.println("Hall Area:" + hallArea);
		System.out.println("Price:" + price);

	}

}
