package lsp; //change location


public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
    	geometryRectangle reg1 = new Rectangle(width, height); //Change Object Rectangle to geometryRectangle
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        geometryRectangle reg2 = new Square(5); //Change Object Square to geometryRectangle
        //Remove setHeight and setWidth That not exist in Square because Square now are subclass to geometryRectangle.
        System.out.println("====   Square  ====");
        System.out.println("Side = 5");
        System.out.println("Area = " + reg2.getArea());
    }
}

