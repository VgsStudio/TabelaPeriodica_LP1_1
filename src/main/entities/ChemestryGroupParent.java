package main.entities;

public class ChemestryGroupParent {
    private String name;
    private String color;
    
    public ChemestryGroupParent(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return "#"+this.color;
    }
}
