package isp.lab1;

import java.time.Duration;
import java.time.LocalDate;

public interface Product {

    public String getArtist();

    public String getAuthor();

    public double getCost();

    public String getFormattedReleaseDate();

    public String getISBN();

    public int getPages();

    public Duration getPlayingTime();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public void order(int quantity);

}
