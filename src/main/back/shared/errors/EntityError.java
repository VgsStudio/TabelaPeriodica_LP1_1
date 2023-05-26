package main.back.shared.errors;

public class EntityError extends IllegalArgumentException{
    public EntityError(String atribute, String errorMessage) {
        super("Erro no atributo " + atribute + ": " + errorMessage);
    }
}
