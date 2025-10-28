/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Library {
     private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the collection
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    // Remove a book by title
    public void removeBook(String title) {
        boolean removed = false;
     for (int i = 0; i < books.size(); i++) {
     if (books.get(i).getTitle().equalsIgnoreCase(title)) {
        books.remove(i);
        removed = true;
        i--; 
        }
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\nLibrary collection:");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
        }
    }
    }}

