package main.element;

public class Element {
    private int atomicNumber, neutronNumber, atomicMass;
    private String name, symbol, color;

    private String family;
    private String year;

    public Element(int atomicNumber, String name, String symbol, int neutronNumber, int atomicMass, String family, String year) {
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
        this.neutronNumber = neutronNumber;
        this.atomicMass = atomicMass;
        this.family = family;
        this.year = year;
        this.neutronNumber = neutronNumber;

        switch (family) {
            case "alcalinos" -> this.color = "#ffaa01";
            case "gases nobres" -> this.color = "#f3f300";
            case "alcalinos terrosos" -> this.color = "#dd999a";
        }
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getColor() {
        return color;
    }

    public int getAtomicMass() {
        return atomicMass;
    }

    public String getFamily() {
        return family;
    }

    public String getYear() {
        return year;
    }
    public int getNeutronNumber() {
        return neutronNumber;
    }
}
