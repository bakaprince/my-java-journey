
public class Cube {
    int edgeLength;
    int volume;
    public Cube(int edgeLength){
        this.edgeLength=edgeLength;
        this.volume=edgeLength * edgeLength * edgeLength;
    }
    public int volume(){
        return volume;
    }
    @Override
    public String toString(){
        return "The length of the edge is "+edgeLength+" and the volume "+volume;
    }
}
