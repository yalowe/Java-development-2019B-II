abstract class Shape{
    private int x;
    private int y;
    
    public Shape(int x, int y) {
    	setX(x);
    	setY(y);
    }
    
    abstract public double getArea();
    public String show(){
    	return getX()+","+getY();
    }
    
    public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}