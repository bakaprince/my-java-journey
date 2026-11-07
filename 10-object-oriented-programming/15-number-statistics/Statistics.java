
public class Statistics {
    private int number=0;
    private int count;
    
    public Statistics(){
        
    }
    public void addNumber(int number){
        this.number+=number;
        this.count++;
    }
    public int getCount(){
        return count;
    }
    public int sum(){
        return this.number;
    }
    public double average(){
        if (count == 0) {
            return 0.0;
        }
        return (1.0*this.number)/count;
    }
}
