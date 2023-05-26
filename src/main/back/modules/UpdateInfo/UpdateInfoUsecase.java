package main.back.modules.UpdateInfo;


import main.back.domain.repo.RepositoryInterface;
import main.back.shared.errors.EntityError;
import main.back.shared.errors.NotFound;
import main.entities.Element;

public class UpdateInfoUsecase {
    RepositoryInterface repository;
    public UpdateInfoUsecase(RepositoryInterface repository){
        this.repository = repository;
    }

    public Element call(int atomicNumber, String info){
        if(!Element.validateAtomicNumber(atomicNumber)){
            throw new EntityError("atomicNumber", "O número atômico deve ser maior que 0");
        }
        Element element = this.repository.getElement(atomicNumber);

        if(element == null){
            throw new NotFound("Element");
        }

        return this.repository.updateElement(atomicNumber, info);
    }
}
