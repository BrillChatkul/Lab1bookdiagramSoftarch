package book;


import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
    	//Use interFaceToFile to let BookPublisher use only printToFile() in interFaceToFile
    	interFaceToFile book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too")); 
        book.printToFile();
    }
}
