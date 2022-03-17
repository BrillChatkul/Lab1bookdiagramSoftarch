package lsp;

public class Square implements geometryRectangle {
	
    private int side; //add attribute side
    Square(int side) {
        this.setSide(side);
    }
    
    //Remove setHeight and setWidth That not exist in Square because Square now are subclass to geometryRectangle.
    
    public void setSide(int side) {
    	this.side = side; //Change value Height and Width to side.
    }
    
    @Override //Override method from geometryRectangle
    public int getArea(){ 
        return side * side;
    }
}
