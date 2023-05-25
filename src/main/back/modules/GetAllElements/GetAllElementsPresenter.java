package main.back.modules.GetAllElements;

import java.util.ArrayList;

import main.back.domain.repo.RepositoryInterface;
import main.back.shared.repo.RepositoryMock;
import main.entities.Element;

public class GetAllElementsPresenter {
    private GetAllElementsController controller;
    private GetAllElementsUsecase usecase;
    private RepositoryInterface repo;
    private static String TIPO_DO_MOCK = "MOCK";

    public GetAllElementsPresenter(){
        if(TIPO_DO_MOCK.equals("MOCK")){
            this.repo = new RepositoryMock();
        }else{
            // this.repo = new Repository();
        }
        this.usecase = new GetAllElementsUsecase(repo);
        this.controller = new GetAllElementsController(usecase);
    }

    public ArrayList<Element> call(){
        return this.controller.call();
    }
}
