
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        int comparedTo=compared.squares;
        if(this.squares>comparedTo){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int comparedPrice=compared.princePerSquare;
        int comparedSize=compared.squares;
        
        int priceDifference= Math.abs((this.princePerSquare*this.squares)-(comparedPrice*comparedSize));
        
        return priceDifference;
    }
    public boolean moreExpensiveThan(Apartment compared){
        int comparedPrice=compared.princePerSquare;
        int comparedSize=compared.squares;
        
        if((comparedPrice*comparedSize)<(this.princePerSquare*this.squares)){
            return true;
        }
        return false;
    }

}
