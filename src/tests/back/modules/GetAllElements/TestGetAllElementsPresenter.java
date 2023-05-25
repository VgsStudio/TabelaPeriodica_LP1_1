package tests.back.modules.GetAllElements;

import main.back.domain.repo.RepositoryInterface;
import main.back.modules.GetAllElements.GetAllElementsPresenter;
import main.back.shared.repo.RepositoryMock;

public class TestGetAllElementsPresenter {
    public static void main(String[] args) {
        teste1();
    }
    public static void teste1(){
        System.out.println("Teste de sucesso de TestGetAllElementsPresenter");
        RepositoryInterface repo = new RepositoryMock();
        GetAllElementsPresenter presenter = new GetAllElementsPresenter(repo);
        System.out.println(presenter.call().size() == 118);
    }
}
