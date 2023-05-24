package main.entities;

import java.util.HashMap;

public class ChemestryFamilyParent {
    private String name;
    private String color;
    public HashMap<String, String> code_to_family = new HashMap<String, String>();
    
    public ChemestryFamilyParent(String name, String color){
        code_to_family.put("FM1", "Metais Alcalinos");
        code_to_family.put("FM2", "Metais Alcalinoterrosos");
        code_to_family.put("FM3_12", "Metais de Transição");
        code_to_family.put("FM13", "Família do Boro");
        code_to_family.put("FM14", "Família do Carbono");
        code_to_family.put("FM15", "Família do Nitrogênio");
        code_to_family.put("FM16","Família dos Calcogênios");
        code_to_family.put("FM17","Família dos Halogênios");
        code_to_family.put("FM18","Gases Nobres");
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
