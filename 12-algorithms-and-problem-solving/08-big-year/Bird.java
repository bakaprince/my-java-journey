
public class Bird {
    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name,String latinName){
        this.name=name;
        this.latinName=latinName;
        this.observation=0;
    }
    
    public void observe(){
        this.observation++;
    }
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + latinName + "): " + this.observation + " observations";
    }

}
