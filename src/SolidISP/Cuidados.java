package SolidISP;

public interface Cuidados {
    default void alimentacion(){
        System.out.println("Los Felinos se alimentan de carne");
    }
}
