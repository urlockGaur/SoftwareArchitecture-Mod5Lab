package edu.wctc.isp;

import java.time.LocalDate;

public interface PrintMedia extends Product {

    String getAuthor();
    String getISBN();

    int getPages();

}
