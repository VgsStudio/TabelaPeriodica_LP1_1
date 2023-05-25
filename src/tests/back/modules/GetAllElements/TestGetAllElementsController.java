package tests.back.modules.GetAllElements;

import main.back.modules.GetAllElements.GetAllElementsController;
import main.back.modules.GetAllElements.GetAllElementsUsecase;
import main.back.shared.repo.RepositoryMock;

public class TestGetAllElementsController {
    public static void main(String[] args) {
        teste1();
    }
    public static void teste1(){
        System.out.println("Teste de sucesso de GetAllElementsController");
        RepositoryMock repositoryMock = new RepositoryMock();
        GetAllElementsUsecase usecase = new GetAllElementsUsecase(repositoryMock);
        GetAllElementsController controller = new GetAllElementsController(usecase);
        System.out.println(controller.call().size() == 118);
    }
}
