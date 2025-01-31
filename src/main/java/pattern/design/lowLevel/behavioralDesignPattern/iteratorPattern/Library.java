package pattern.design.lowLevel.behavioralDesignPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements Aggregate {

    List<Book> bookList = new ArrayList<>();

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
