package main.back.modules.GetAllElements;

import java.util.ArrayList;

import main.back.domain.repo.RepositoryInterface;
import main.back.shared.repo.RepositoryMock;
import main.back.shared.repo.RepositoryMySQL;
import main.entities.Element;

public class GetAllElementsPresenter {
    private GetAllElementsController controller;
    private GetAllElementsUsecase usecase;
    private RepositoryInterface repo;
    private static String TIPO_DO_MOCK = "MYSQL";

    public GetAllElementsPresenter(){
        if(TIPO_DO_MOCK.equals("MOCK")){
            this.repo = new RepositoryMock();
        }else if(TIPO_DO_MOCK.equals("MYSQL")){
            this.repo = new RepositoryMySQL();
        }
        this.usecase = new GetAllElementsUsecase(repo);
        this.controller = new GetAllElementsController(usecase);
    }

    public ArrayList<Element> call(){
        return this.controller.call();
    }
}
