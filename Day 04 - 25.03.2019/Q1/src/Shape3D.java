abstract class Shape3D extends Shape{
    public Shape3D(int x, int y) {
		super(x, y);
	}
    
    abstract public double volume();
    
	private int z;
	
    
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String show() {
		return "Shape3D:" + super.show();
	}
}