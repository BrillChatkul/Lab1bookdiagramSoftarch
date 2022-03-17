package book;


import java.util.List;

public class BookReader {
    public static void main(String[] args) {
    	//Use interFaceToScreen to let BookReader use only printToScreen() in interFaceToScreen
    	interFaceToScreen book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
