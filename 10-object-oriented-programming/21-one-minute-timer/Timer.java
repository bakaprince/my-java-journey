
public class Timer {
    int hundredthsSecond;
    int seconds;
    public Timer(){
    }
    public void advance(){
        this.hundredthsSecond++;
        if (this.hundredthsSecond>99){
            this.seconds++;
            this.hundredthsSecond=0;
            if(this.seconds>59){
                this.seconds=0;
            }
        }
    }
    @Override
    public String toString(){
        if(this.seconds<10&&this.hundredthsSecond<10){
            return "0"+this.seconds+":"+"0"+this.hundredthsSecond;
        }else if(this.seconds>10&&this.hundredthsSecond<10){
            return this.seconds+":"+"0"+this.hundredthsSecond;
        }else if(this.seconds<10&&this.hundredthsSecond>10){
            return "0"+this.seconds+":"+this.hundredthsSecond;
        }
        return this.seconds+":"+this.hundredthsSecond ;
    }
}
