/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final String title;
    private final String director;
    private final List<String> actors;
    private final List<String> reviews;

    // Constructor
    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>(actors);
        this.reviews = new ArrayList<>();
    }

    // Method to add a review
    public void addReview(String review) {
        reviews.add(review);
        System.out.println("Review added: " + review);
    }

    // Method to retrieve all reviews
    public List<String> getReviews() {
        return new ArrayList<>(reviews);
    }

    // Method to display movie details
    public void displayMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
        } else {
            System.out.println("Reviews:");
            for (String review : reviews) {
                System.out.println("- " + review);
            }
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("Leonardo DiCaprio");
        actors.add("Joseph Gordon-Levitt");
        actors.add("Elliot Page");

        Movie inception = new Movie("Inception", "Christopher Nolan", actors);

        inception.displayMovieInfo();

        inception.addReview("Amazing movie with mind-bending plot!");
        inception.addReview("Great visuals and acting.");

        System.out.println("\nAll Reviews: " + inception.getReviews());

        inception.displayMovieInfo();

    }
}
