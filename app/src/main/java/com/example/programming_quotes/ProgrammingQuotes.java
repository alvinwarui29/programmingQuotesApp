package com.example.programming_quotes;
import com.google.gson.annotations.SerializedName;

public class ProgrammingQuotes {
    @SerializedName("author")
    private String author;

    @SerializedName("en")
    private String en;

    public ProgrammingQuotes(){

    }

    public String getAuthor(){
        return author;
    }
    public void SetAuthor(String author){
        this.author = author;
    }
    public String getEn(){
        return en;
    }
    public void SetEn(String en){
        this.en = en;
    }
}












