package SolidISP;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Leon leon = new Leon();

        gato.alimentacion();
        gato.AseoParaGato();

        leon.alimentacion();
        leon.AseoParaLeon();

    }
}
