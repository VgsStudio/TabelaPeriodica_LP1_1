package main.back.modules.GetAllElements;

import java.util.ArrayList;

import main.back.domain.repo.RepositoryInterface;
import main.entities.Element;

public class GetAllElementsUsecase {
    RepositoryInterface repository;
    public GetAllElementsUsecase(RepositoryInterface repository){
        this.repository = repository;
    }

    public ArrayList<Element> call(){
        return repository.getAllElements();
    }
}
