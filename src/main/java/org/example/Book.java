package org.example;

import java.util.List;

public class Book extends AbstractProduct {

    private String author;

    private int numberOfPages;
    private String genre;

    public Book(String name, double price, double rating, String manufacturer, List<String> description) {
        super(name, price, rating, manufacturer);
        setDescriptionOfProduct(description);
    }

    @Override
    public void setDescriptionOfProduct(List<String> description) {
        this.author = description.get(0);
        this.numberOfPages = Integer.parseInt(description.get(1));
        this.genre = description.get(2);
    }

    @Override
    public String getDescriptionOfProduct() {
        return "Name of book: " + this.getProductTitle() + " | "
                + "Author: " + this.author + " | "
                + "Genre: " + this.genre + " | "
                + "Count of pages: " + this.numberOfPages + " | "
                + "Book publisher: " + this.getManufacturer() + " | "
                + "Rating of book: " + this.getRating() + " | "
                + "Price of book: " + this.getPrice();
    }
}
