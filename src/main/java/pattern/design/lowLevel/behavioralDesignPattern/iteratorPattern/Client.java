package pattern.design.lowLevel.behavioralDesignPattern.iteratorPattern;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
                new Book(200, "Python"),
                new Book(450, "Data Structure and Algorithm"),
                new Book(269, "Introduction to Java"),
                new Book(660, "Cyber Security")
        );

        Library lib = new Library(bookList);
        Iterator iterator = lib.createIterator();

        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }

    }
}
