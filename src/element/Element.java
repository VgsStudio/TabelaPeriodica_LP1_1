package element;

public class Element {
    private int atomicNumber;
    private String name;
    private String symbol;
    private String color;

    public Element(int atomicNumber, String elementName, String elementSymbol) {
        this.atomicNumber = atomicNumber;
        this.name = elementName;
        this.symbol = elementSymbol;

        // generate a random int number between 0 e 9
        int random = (int) (Math.random() * 10);

        switch (random) {
            case 0 -> this.color = "#ffaa01";
            case 1 -> this.color = "#f3f300";
            case 2 -> this.color = "#dd999a";
            case 3 -> this.color = "#ffab89";
            case 4 -> this.color = "#ddaacb";
            case 5 -> this.color = "#99bbaa";
            case 6 -> this.color = "#55cc88";
            case 7 -> this.color = "#00ef00";
            case 8 -> this.color = "#00ddba";
            case 9 -> this.color = "#66aaff";
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
}
