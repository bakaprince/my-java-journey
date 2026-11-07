/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BakaPrince
 */
public class Items {
    private String identifier;
    private String itemName;
    
    public Items(String iden,String name){
        this.identifier=iden;
        this.itemName=name;
    }
    @Override
    public String toString(){
        return this.identifier+": "+this.itemName;
    }
    @Override
    public boolean equals(Object compared){
        if(this==compared){
            return true;
        }
        if(!(compared instanceof Items)){
            return false;
        }
        Items comparedItem=(Items) compared;
        
        return this.identifier.equals(comparedItem.identifier);
    } 
    
}
