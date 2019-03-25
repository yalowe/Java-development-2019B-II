
public class Cube extends Shape3D{

	public Cube(int x) {
		super(x, x);
	}

	@Override
	public double volume() {
		return Math.pow(getX(), 3);
	}

	@Override
	public double getArea() {
		return 6*Math.pow(getX(), 2);	
	}

	@Override
	public String show() {
		return "Cube:"+super.show();
	}

}
