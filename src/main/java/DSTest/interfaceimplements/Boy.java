package DSTest.interfaceimplements;

public interface Boy extends Human{
    @Override
    default void printType() {
        System.out.println("Boy");
    }
}
