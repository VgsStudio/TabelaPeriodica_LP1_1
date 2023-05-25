package main.entities;

import java.util.HashMap;

import main.entities.ChemestryGroupChildren.GroupGPACT;
import main.entities.ChemestryGroupChildren.GroupGPAEM;
import main.entities.ChemestryGroupChildren.GroupGPAKM;
import main.entities.ChemestryGroupChildren.GroupGPHAL;
import main.entities.ChemestryGroupChildren.GroupGPPTM;
import main.entities.ChemestryGroupChildren.GroupGPRNM;
import main.entities.ChemestryGroupChildren.GroupGPTTM;
import main.entities.ChemestryGroupChildren.GroupGPLAN;
import main.entities.ChemestryGroupChildren.GroupGPMET;
import main.entities.ChemestryGroupChildren.GroupGPMTL;
import main.entities.ChemestryGroupChildren.GroupGPNBG;

public class Element {
    private int atomicNumber, neutronNumber, atomicMass, year;
    private String name, symbol;
    private ChemestryGroupParent group;
    private String info;
    private HashMap<String, ChemestryGroupParent> code_to_group = new HashMap<String, ChemestryGroupParent>();

    public Element(int atomicNumber, String name, String symbol, int neutronNumber, int atomicMass, String groupCode, int year){
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
        this.neutronNumber = neutronNumber; 
        this.atomicMass = atomicMass;
        this.year = year;
        this.createCodeToGroup();
        this.setGroup(groupCode);
        this.info = "";
    }
    public Element(int atomicNumber, String name, String symbol, int neutronNumber, int atomicMass, String groupCode, int year, String info){
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
        this.neutronNumber = neutronNumber; 
        this.atomicMass = atomicMass;
        this.year = year;
        this.createCodeToGroup();
        this.setGroup(groupCode);
        this.info = info;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }
    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public int getNeutronNumber() {
        return neutronNumber;
    }
    public void setNeutronNumber(int neutronNumber) {
        this.neutronNumber = neutronNumber;
    }

    public int getAtomicMass() {
        return atomicMass;
    }
    public void setAtomicMass(int atomicMass) {
        this.atomicMass = atomicMass;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    private void createCodeToGroup(){
        this.code_to_group.put("GPAKM", new GroupGPAKM());
        this.code_to_group.put("GPAEM", new GroupGPAEM());
        this.code_to_group.put("GPLAN", new GroupGPLAN());
        this.code_to_group.put("GPACT", new GroupGPACT());
        this.code_to_group.put("GPTTM", new GroupGPTTM());
        this.code_to_group.put("GPPTM", new GroupGPPTM());
        this.code_to_group.put("GPMTL", new GroupGPMTL());
        this.code_to_group.put("GPRNM", new GroupGPRNM());
        this.code_to_group.put("GPNBG", new GroupGPNBG());
        this.code_to_group.put("GPHAL", new GroupGPHAL());
        this.code_to_group.put("GPMET", new GroupGPMET());
    }

    public String getColor() {
        return this.group.getColor();
    }

    public String getGroupName() {
        return this.group.getName();
    }

    public void setGroup(String groupCode){
        this.group = this.code_to_group.get(groupCode);
        if(this.group == null){
            throw new IllegalArgumentException("groupCode inválido");
        }
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return 
            "Elemento: " + this.name + "\n" +
            "Número atômico: " + this.atomicNumber + "\n" +
            "Símbolo: " + this.symbol + "\n" +
            "Número de nêutrons: " + this.neutronNumber + "\n" +
            "Massa atômica: " + this.atomicMass + "\n" +
            "Grupo Química: " + this.group.getName() + "\n" +
            "Ano de descoberta: " + this.year + "\n" +
            "Cor: " + this.group.getColor();
    }
}
