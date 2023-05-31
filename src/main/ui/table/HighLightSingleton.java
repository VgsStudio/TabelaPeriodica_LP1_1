package main.ui.table;

public class HighLightSingleton {
    private static HighLightSingleton instance = null;
    private ElementButton selectedButton = null;

    private HighLightSingleton() {
    }

    public static HighLightSingleton getInstance() {
        if (instance == null) {
            instance = new HighLightSingleton();
        }
        return instance;
    }

    public void setSelectedButton(ElementButton selectedButton) {

        ElementButton oldSelectedButton = this.selectedButton;

        this.selectedButton = selectedButton;

        if (oldSelectedButton != null) {
            oldSelectedButton.unHighLight();
        }



        if (this.selectedButton != null) {
            this.selectedButton.highLight();
        }
    }


    public ElementButton getSelectedButton() {
        return selectedButton;
    }
}
