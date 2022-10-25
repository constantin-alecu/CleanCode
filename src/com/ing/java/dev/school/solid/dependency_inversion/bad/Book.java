package com.ing.java.dev.school.solid.dependency_inversion.bad;

import java.util.List;

public class Book {
    String title;
}

class Shelf {
    private List<Book> books; // does rely on concrete class
}
