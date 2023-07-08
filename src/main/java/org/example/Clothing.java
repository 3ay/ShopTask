package org.example;

import java.util.List;

public class Clothing extends AbstractProduct{
    private String material;
    private String itemSize;
    private String composition;
    public Clothing(String name, double price, double rating, String manufacturer, List<String> description) {
        super(name, price, rating, manufacturer);
        setDescriptionOfProduct(description);
    }

    @Override
    public void setDescriptionOfProduct(List<String> description) {
        this.material = description.get(0);
        this.itemSize = description.get(1);
        this.composition = description.get(2);

    }

    @Override
    public String getDescriptionOfProduct() {
        return "Name of cloth: " + this.getProductTitle() + " | "
                + "Material: " + this.material + " | "
                + "Size: " + this.itemSize + " | "
                + "Composition: " + this.composition + " | "
                + "Cloth publisher: " + this.getManufacturer() + " | "
                + "Rating of cloth: " + this.getRating() + " | "
                + "Price of cloth: " + this.getPrice();
    }
}
