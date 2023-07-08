package org.example;

import java.util.List;

public class Food extends AbstractProduct {
    private double weight;
    private String shelfLife;

    public Food(String title, double price, double rating, String manufacturer, List<String> description) {
        super(title, price, rating, manufacturer);
        this.setDescriptionOfProduct(description);
    }

    @Override
    public void setDescriptionOfProduct(List<String> description) {
        this.weight = Double.parseDouble(description.get(0));
        this.shelfLife = description.get(1);
    }


    @Override
    public String getDescriptionOfProduct() {
        return "Name of food: " + this.getProductTitle() + " | "
                + "Product manufacturer: " + this.getManufacturer() + " | "
                + "Weight: " + this.weight + " | "
                + "Shelf life: " + this.shelfLife + " | "
                + "Rating of food: " + this.getRating() + " | "
                + "Price of food: " + this.getPrice();
    }
}
