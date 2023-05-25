package main.back.modules.GetAllElements;

import java.util.ArrayList;

import main.entities.Element;

public class GetAllElementsController {
    private GetAllElementsUsecase usecase;

    public GetAllElementsController(GetAllElementsUsecase usecase){
        this.usecase = usecase;
    }

    public ArrayList<Element> call(){
        return usecase.call();
    }
}
