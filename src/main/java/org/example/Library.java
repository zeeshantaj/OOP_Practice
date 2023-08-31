package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {


    public static void main(String[] args) {
        book book = new book("abx", "123kjfdshjh1", "zee");
        book book1 = new book("abx1", "123kjfdshjh1", "zee1");
        book book2 = new book("abx2", "123kjfdshjh1", "zee2");

        ArrayList<book> list = new ArrayList<>();
        list.add(book);
        list.add(book1);
        list.add(book2);

        list.remove(book);
    }
}
class book{
    private static ArrayList<book> libraryList = new ArrayList<>();
    private String name,ISBN, author;

    public book(String name,String ISBN,String author){
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;

    }

    public  void addBook(book book){
        libraryList.add(book);
    }
    public  void removedBook(book book){
        libraryList.remove(book);
    }
}
