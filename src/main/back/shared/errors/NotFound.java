package main.back.shared.errors;

public class NotFound extends IllegalArgumentException{
    public NotFound(String entity) {
        super("Entidade " + entity + " não encontrada");
    }
}
