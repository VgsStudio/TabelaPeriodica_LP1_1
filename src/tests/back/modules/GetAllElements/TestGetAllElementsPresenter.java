package tests.back.modules.GetAllElements;

import main.back.modules.GetAllElements.GetAllElementsPresenter;

public class TestGetAllElementsPresenter {
    public static void main(String[] args) {
        teste1();
    }
    public static void teste1(){
        System.out.println("Teste de sucesso de TestGetAllElementsPresenter");
        GetAllElementsPresenter presenter = new GetAllElementsPresenter();
        System.out.println(presenter.call().size() == 118);
    }
}