
public class Sphere extends Shape3D{
	public Sphere(int x) {
		super(x, x);
	}

	@Override
	public double volume() {
		return (4/3)*Math.PI*Math.pow(getX(), 3);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4*Math.PI*Math.pow(getX(), 2);
	}
}
