package main.back.modules.get_all_elements;

import java.util.ArrayList;
import java.util.Collections;

import main.back.domain.repo.RepositoryInterface;
import main.entities.Element;

public class GetAllElementsUsecase {
    RepositoryInterface repository;
    public GetAllElementsUsecase(RepositoryInterface repository){
        this.repository = repository;
    }

    public ArrayList<Element> call(){

        ArrayList<Element> elements = this.repository.getAllElements();
        Collections.sort(elements, (e1, e2) -> Integer.valueOf(e1.getAtomicNumber()).compareTo(Integer.valueOf(e2.getAtomicNumber())));   
        return elements;
    }
}
