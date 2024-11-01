class Stock{
    private int day;
    private String stockSymbol;
    private String stockName;
    private double prevClose;
    private double current;
    private double percentage;

    public Stock(int day, String stockSymbol, String stockName, double prevClose, double current){
        this.day = day;
        this.stockSymbol = stockSymbol;
        this.stockName = stockName;
        this.prevClose = prevClose;
        this.current = current;
    }

    public void getPercentage(){ //method that calculates the percentage of the difference between the preClose and current
        percentage = ((current - prevClose)*100)/prevClose;
        System.out.printf("%.02f%n", percentage);
    }

    public void setPrevClose(double prevClose){ //method that sets the instance to a string, so it is easier to do the format
        this.prevClose = prevClose;
        String str = String.valueOf(prevClose);
    }

    public void setCurrent(double current){
        this.current = current;
        String str = String.valueOf(current);
    }

    public String toString(){
        return String.format("%-15d", day) + String.format("%-15s", stockSymbol) + String.format("%-15s", stockName) +
                String.format("%-15s", prevClose) + String.format("%-15s", current);
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Stock Market -----");
        System.out.println( String.format("%-15s", "Day") + String.format("%-15s", "Symbol") + String.format("%-15s", "Name") +
                String.format("%-15s", "PrevClose") + String.format("%-15s", "Current") + String.format("%-15s", "% Change"));

        //Spotify
        Stock Spotify1 = new Stock(1, "SPOT", "Spotify", 278.98, 271.55);
        Stock Spotify2 = new Stock(2, "SPOT", "Spotify", 271.55, 268.56);
        Stock Spotify3 = new Stock(3, "SPOT", "Spotify", 268.56, 263.27);

        //Amazon
        Stock Amazon1 = new Stock(1, "AMZN", "Amazon", 3539.01, 3564.99);
        Stock Amazon2 = new Stock(2, "AMZN", "Amazon", 3564.99, 3566.35);
        Stock Amazon3 = new Stock(3, "AMZN", "Amazon", 3566.35, 3705.18);

        //Google
        Stock Google1 = new Stock(1, "GOOG", "Google", 2965.06, 2960.55);
        Stock Google2 = new Stock(2, "GOOG", "Google", 2960.55, 2964.83);
        Stock Google3 = new Stock(3, "GOOG", "Google", 2964.83, 2999.51);

        //print system for Spotify
        System.out.print(Spotify1);
        Spotify1.getPercentage();
        System.out.print(Spotify2);
        Spotify2.getPercentage();
        System.out.print(Spotify3);
        Spotify3.getPercentage();
        System.out.print("\n\n\n");

        //print system for Amazon
        System.out.print(Amazon1);
        Amazon1.getPercentage();
        System.out.print(Amazon2);
        Amazon2.getPercentage();
        System.out.print(Amazon3);
        Amazon3.getPercentage();
        System.out.print("\n\n\n");

        //print system for Google
        System.out.print(Google1);
        Google1.getPercentage();
        System.out.print(Google2);
        Google2.getPercentage();
        System.out.print(Google3);
        Google3.getPercentage();


    }
}