package Model;

public interface Prioritas {
    String tentukanPrioritas();

    default void tampilkanPrioritas() {
        System.out.println("Prioritas   : " + tentukanPrioritas());
    }
}
