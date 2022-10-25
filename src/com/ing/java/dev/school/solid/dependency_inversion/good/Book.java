package com.ing.java.dev.school.solid.dependency_inversion.good;

import java.util.List;

interface Product{}

public class Book implements Product {
    String title;
}

class DVD implements Product{
    String title;
}

class Shelf{
    private List<Product> items;// cold be either book or dvd

    public static void main(String[] args) {
        new Shelf().items.add(new Book());
        new Shelf().items.add(new DVD());

    }
}
