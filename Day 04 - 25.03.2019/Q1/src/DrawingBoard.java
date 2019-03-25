
public class DrawingBoard {
     private Shape[] shapes;
     private int counter=0;
     public DrawingBoard(int length) {
    	 shapes=new Shape[length];
     }
     
     
     public void add(Shape ...s) {
    	 if(counter+s.length < shapes.length) {
    		 Shape[] temp=shapes;
    		 shapes=new Shape[(int) (shapes.length*1.5)];
    		 for(int i=0; i<=counter; i++) {
    			 shapes[i]=temp[i];
    		 }
    	 }
    	 
    	 for(int i=0; i<=s.length; i++) {
			 shapes[++counter]=s[i];
		 }
     }
}
