import java.util.ArrayList;
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.items=new ArrayList<>();
        this.maxWeight=maxWeight;
    }
    public void addItem(Item item){
        int weight=0;
        for(Item i:this.items){
            weight+=i.getWeight();
        }
        int remainingWeight=maxWeight-weight;
        if(remainingWeight>=item.getWeight()){
            this.items.add(item);   
        }       
    }
    public void printItems(){
        for(Item i:this.items){
            System.out.println(i.toString());
        }
    }
    public int totalWeight(){
        int weight=0;
        for(Item i:this.items){
            weight+=i.getWeight();
        }
        return weight;
    }
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heavyItem=this.items.get(0);
        for(Item i:items){
            if(i.getWeight()>heavyItem.getWeight()){
                heavyItem=i;
            }
        }
        return heavyItem;
    }
    @Override
    public String toString(){
        int weight=0;
        for(Item i:this.items){
            weight+=i.getWeight();
        }
        if(this.items.isEmpty()){
            return "no items(0 kg)";
        }else if(this.items.size()==1){
            return this.items.size()+" item("+weight+" kg)";
        }
        return this.items.size()+" items("+weight+" kg)";
    }
}
