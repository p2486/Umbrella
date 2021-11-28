package at.ac.fhstp;

public class Coin implements Comparable<Coin>{
    private int id; // 1
    private String name; // Bitcoin
    private String symbol; // BTC
    private int cmc_rank; // 1
    private double price; // 9283.92

    // Quote
    private double volume_24h; // 7155680000
    private double percent_change_24h; // 0.518894
    private String last_updated; // "2018-08-09T22:53:32.000Z"

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getCmc_rank() {
        return this.cmc_rank;
    }

    public void setCmc_rank(int cmc_rank) {
        this.cmc_rank = cmc_rank;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume_24h() {
        return this.volume_24h;
    }

    public void setVolume_24h(double volume_24h) {
        this.volume_24h = volume_24h;
    }

    public double getPercent_change_24h() {
        return this.percent_change_24h;
    }

    public void setPercent_change_24h(double percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public String getLast_updated() {
        return this.last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Coin(int id, String name, String symbol, int cmc_rank, double price, double volume_24h, double percent_change_24h, String last_updated) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.cmc_rank = cmc_rank;
        this.price = price;
        this.volume_24h = volume_24h;
        this.percent_change_24h = percent_change_24h;
        this.last_updated = last_updated;
    }
    @Override
    public int compareTo(Coin c){
        return Double.compare(c.price,this.price);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", symbol='" + getSymbol() + "'" +
                ", cmc_rank='" + getCmc_rank() + "'" +
                ", price='" + getPrice() + "'" +
                ", volume_24h='" + getVolume_24h() + "'" +
                ", percent_change_24h='" + getPercent_change_24h() + "'" +
                ", last_updated='" + getLast_updated() + "'" +
                "}";
    }

}
