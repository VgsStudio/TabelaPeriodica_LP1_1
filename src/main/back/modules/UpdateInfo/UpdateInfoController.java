package main.back.modules.UpdateInfo;


import main.back.shared.errors.EntityError;
import main.back.shared.errors.NotFound;
import main.entities.Element;

public class UpdateInfoController {
    private UpdateInfoUsecase usecase;

    public UpdateInfoController(UpdateInfoUsecase usecase){
        this.usecase = usecase;
    }

    public Element call(int atomicNumber, String info){
        try {
            Element element = this.usecase.call(atomicNumber, info);
            return element;
        } catch (EntityError e) {
            return null;
        } catch (NotFound e) {
            return null;
        }
    }
}
