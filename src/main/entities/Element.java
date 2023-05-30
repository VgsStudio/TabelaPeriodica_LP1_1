package main.entities;

import java.util.HashMap;

import main.back.shared.errors.EntityError;
import main.entities.chemistry_group.ChemistryGroupGPACT;
import main.entities.chemistry_group.ChemistryGroupGPAEM;
import main.entities.chemistry_group.ChemistryGroupGPAKM;
import main.entities.chemistry_group.ChemistryGroupGPHAL;
import main.entities.chemistry_group.ChemistryGroupGPPTM;
import main.entities.chemistry_group.ChemistryGroupGPRNM;
import main.entities.chemistry_group.ChemistryGroupGPTTM;
import main.entities.chemistry_group.ChemistryGroupGPLAN;
import main.entities.chemistry_group.ChemistryGroupGPMET;
import main.entities.chemistry_group.ChemistryGroupGPMTL;
import main.entities.chemistry_group.ChemistryGroupGPNBG;
import main.entities.chemistry_group.ChemistryGroupParent;

public class Element {
    private int atomicNumber, neutronNumber, atomicMass, year;
    private String name, symbol;
    private ChemistryGroupParent group;
    private String info;
    private HashMap<String, ChemistryGroupParent> code_to_group = new HashMap<String, ChemistryGroupParent>();

    public Element(int atomicNumber, String name, String symbol, int neutronNumber, int atomicMass, String groupCode, int year){
        if(validateAtomicNumber(atomicNumber)){
            this.atomicNumber = atomicNumber;
        }else{
            throw new EntityError("atomicNumber", "O número atômico deve ser maior que 0");
        }
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

    // Getters and setters

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
        this.code_to_group.put("GPAKM", new ChemistryGroupGPAKM());
        this.code_to_group.put("GPAEM", new ChemistryGroupGPAEM());
        this.code_to_group.put("GPLAN", new ChemistryGroupGPLAN());
        this.code_to_group.put("GPACT", new ChemistryGroupGPACT());
        this.code_to_group.put("GPTTM", new ChemistryGroupGPTTM());
        this.code_to_group.put("GPPTM", new ChemistryGroupGPPTM());
        this.code_to_group.put("GPMTL", new ChemistryGroupGPMTL());
        this.code_to_group.put("GPRNM", new ChemistryGroupGPRNM());
        this.code_to_group.put("GPNBG", new ChemistryGroupGPNBG());
        this.code_to_group.put("GPHAL", new ChemistryGroupGPHAL());
        this.code_to_group.put("GPMET", new ChemistryGroupGPMET());
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

    public String getInfo(){
        return this.info;
    }

    public void setInfo(String info){
        this.info = info;
    }

    // Validations
    public static boolean validateAtomicNumber(int atomicNumber){
        return atomicNumber > 0;
    }

    // Method toString
    
    public String toString(){
        return 
            "Elemento: " + this.name + "\n" +
            "Número atômico: " + this.atomicNumber + "\n" +
            "Símbolo: " + this.symbol + "\n" +
            "Número de nêutrons: " + this.neutronNumber + "\n" +
            "Massa atômica: " + this.atomicMass + "\n" +
            "Grupo Química: " + this.group.getName() + "\n" +
            "Ano de descoberta: " + this.year + "\n" +
            "Cor: " + this.group.getColor() + "\n" +
            "Info: " + this.info;
    }
}
