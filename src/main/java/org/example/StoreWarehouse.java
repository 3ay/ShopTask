package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StoreWarehouse {
    public HashMap<String, AbstractProduct> getProductsMap() {
        return productsMap;
    } //принцип DRY: подход -> извлечение общей функциональности

    private final HashMap<String, AbstractProduct> productsMap = initDefaultProductsMap();
    public  HashMap<String, AbstractProduct> initDefaultProductsMap() {
        HashMap<String, AbstractProduct> productsMap = new HashMap<>();
        productsMap.put("12323",new Food("Хлеб", 40.5, 7.5, "Черемушкинский хлебоком", new ArrayList<>(List.of("300", "23-05-2024"))));
        productsMap.put("84231", new Food("Печенье", 120, 8.1, "Ленинский Хлебзавод", new ArrayList<>(List.of("400", "03-09-2023"))));
        productsMap.put("67293",new Food("Картофель", 30, 6.4, "Агрокомплекс Южный", new ArrayList<>(List.of("350", "20-07-2023"))));
        productsMap.put("47811", new Book("Война и мир", 500.54, 9.0, "Издательство 'Молодая гвардия'", new ArrayList<>(List.of("Л.Н. Толстой", "1300","роман"))));
        productsMap.put("45467", new Book("1984", 478.90, 8.4, "Издательство 'Салют'", new ArrayList<>(List.of("Джордж Оруэлл", "328","роман"))));
        productsMap.put("40381", new Book("Шум и ярость", 320.64, 7.6, "Издательство 'АСТ'", new ArrayList<>(List.of("Уильям Фолкнер", "418","роман"))));
        productsMap.put("74005", new Clothing("Поло", 558, 8.6,"Zara", new ArrayList<>(List.of("Хлопок","XL","80% хлопок , 20% п/э"))));
        productsMap.put("78980", new Clothing("Рубашка", 1200, 9.6,"Bershka", new ArrayList<>(List.of("Лен","L", "хлопок 20%, лен 80%"))));
        productsMap.put("71385", new Clothing("Футболка", 780, 7.9,"Sela", new ArrayList<>(List.of("Хлопок, Лайкра","M","хлопок 95% лайкра 5%"))));
        return productsMap;
    }
}
