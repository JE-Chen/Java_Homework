package DSTest.interfaceimplements;

public interface Girl extends Human {

    @Override
    default void printType() {
        System.out.println("Girl");
    }

}
