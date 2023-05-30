package main.entities.chemistry_group;

public class ChemistryGroupParent {
    private String name;
    private String color;
    
    public ChemistryGroupParent(String name, String color){
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
