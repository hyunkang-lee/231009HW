package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bd1 = new BookDTO();
        bd1.printInformation();

        BookDTO bd2 = new BookDTO("javas", "dowPu", "Khada");
        bd2.printInformation();

        BookDTO bd3 = new BookDTO("Hongstory", "Hwalbin", " Heo", 5000000, 0.5);
        bd3.printInformation();

    }
}
