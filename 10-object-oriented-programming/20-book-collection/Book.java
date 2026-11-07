/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BakaPrince
 */
public class Book {
    private String title;
    private int pageNumber;
    private int publicationYear;
    
    public Book(String title,int pageNumber,int pubYear){
        this.title=title;
        this.pageNumber=pageNumber;
        this.publicationYear=pubYear;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPageNumber(){
        return this.pageNumber;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    @Override
    public String toString(){
        return this.title+", "+this.pageNumber+" pages, "+this.publicationYear;
    }
}
