package flat;

public class TwoBHK {

	public double room2Area;

	public TwoBHK(double room2Area, OneBHK twoBhk) {
		super();
		this.room2Area = room2Area;
		this.twoBhk = twoBhk;
	}

	OneBHK twoBhk;

	public TwoBHK() {
		super();
	}

	public void Show() {
		System.out.println("Room2 Area:" + room2Area);
		twoBhk.Show();
	}
}
