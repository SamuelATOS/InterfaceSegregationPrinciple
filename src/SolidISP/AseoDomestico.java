package SolidISP;

public interface AseoDomestico {
    default void AseoParaGato(){
        System.out.println("Se puede asear en la casa");
    }
}
