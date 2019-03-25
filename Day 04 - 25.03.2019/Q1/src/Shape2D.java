abstract class Shape2D extends Shape{
	
    public Shape2D(int x, int y) {
		super(x, y);
	}

	abstract public double getCircumference();
	
	@Override
	public String show() {
		return "Shape2D:" + super.show();
	}
}