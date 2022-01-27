package SolidISP;

public interface AseoZoologico {
    default void AseoParaLeon(){
        System.out.println("Solo se puede asear en un zoologico");
    }
}
