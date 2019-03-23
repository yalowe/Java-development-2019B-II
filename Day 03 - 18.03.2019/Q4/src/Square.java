
public class Square extends Shape{

	public Square(double length) {
		super();
	    this.length=length;
	}

	private double length;
	
	@Override
	public double getArea() {
		return Math.pow(length, 2);
	}

	@Override
	public double getPerimeter() {
		return 4*length;
	}

}

