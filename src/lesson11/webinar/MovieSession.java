package lesson11.webinar;

import java.util.Date;

public class MovieSession {
    private long id;
    private int ticketsCount;
    private Date date;
    private int price;

    private String address;

    public MovieSession(long id, int ticketsCount, Date date, int price, String address) {
        this.id = id;
        this.ticketsCount = ticketsCount;
        this.date = date;
        this.price = price;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public int getTicketsCount() {
        return ticketsCount;
    }

    public Date getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }
}
