/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BakaPrince
 */
public class Containers {
    private int first;
    private int second;
    
    public Containers(){
        this.first=0;
        this.second=0;
    }
    
    public void add(int num){
        
        if(num>0&&(this.first+num)<=100){
            this.first+=num;
        }else if(this.first+num>100){
            this.first=100;
        }
    }
    public void move(int num){
        if(num>0 && num<=this.first &&this.second+num<100){
            this.second+=num;
            this.first-=num;
        }else if(num>this.first){
            this.second+=this.first;
            this.first=0;
        }else if(this.second+num>100){
            this.second=100;
            this.first=0;
        }
    }
    
    public void remove(int num){
        if(num>0&&num<=this.second){
            this.second-=num;
        }else if(num>this.second){
            this.second=0;
        }
    }
    
    @Override
    public String toString(){
        return "First: "+this.first+"/100\nSecond: "+this.second+"/100";
    }
}
