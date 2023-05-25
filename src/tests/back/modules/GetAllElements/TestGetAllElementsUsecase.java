package tests.back.modules.GetAllElements;

import main.back.modules.GetAllElements.GetAllElementsUsecase;
import main.back.shared.repo.RepositoryMock;

public class TestGetAllElementsUsecase {
    public static void main(String[] args) {
        teste1();
    }
    public static void teste1(){
        System.out.println("Teste de sucesso de GetAllElementsUsecase");
        RepositoryMock repositoryMock = new RepositoryMock();
        GetAllElementsUsecase usecase = new GetAllElementsUsecase(repositoryMock);
        System.out.println(usecase.call().size() == 118);
    }
}
