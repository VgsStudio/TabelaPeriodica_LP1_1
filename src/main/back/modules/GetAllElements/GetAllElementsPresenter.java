package main.back.modules.GetAllElements;
import java.util.ArrayList;
import main.back.domain.repo.RepositoryInterface;
import main.entities.Element;

public class GetAllElementsPresenter {
    private GetAllElementsController controller;
    private GetAllElementsUsecase usecase;
    private RepositoryInterface repo;

    public GetAllElementsPresenter(RepositoryInterface repo){
        this.repo = repo;
        this.usecase = new GetAllElementsUsecase(this.repo);
        this.controller = new GetAllElementsController(usecase);
    }

    public ArrayList<Element> call(){
        return this.controller.call();
    }
}
