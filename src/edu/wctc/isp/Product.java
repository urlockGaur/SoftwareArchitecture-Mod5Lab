package edu.wctc.isp;

import java.time.LocalDate;

public interface Product {

    double getCost();
    String getFormattedReleaseDate();
    LocalDate getReleaseDate();
    int getQuantityOnHand();
    String getTitle();

    void order(int quantity);
}
