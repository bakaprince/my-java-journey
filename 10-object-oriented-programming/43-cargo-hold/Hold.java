import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight=maxWeight;
        this.suitcases=new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        int weight=0;
        for(Suitcase sc:suitcases){
            weight+=sc.totalWeight();
        }
        int remainingSpace=this.maxWeight-weight;
        if(remainingSpace>=suitcase.totalWeight()){
            this.suitcases.add(suitcase);
        }
    }
    @Override
    public String toString(){
        int weight=0;
        for(Suitcase sc:this.suitcases){
            weight+=sc.totalWeight();
        }
        return this.suitcases.size()+" suitcases("+weight+" kg)";
    }
    public void printItems(){
        for(Suitcase sc:this.suitcases){
            sc.printItems();
        }
    }
    
}
