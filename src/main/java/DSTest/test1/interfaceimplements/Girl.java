package DSTest.test1.interfaceimplements;

public interface Girl extends Human {

    @Override
    default void printType() {
        System.out.println("Girl");
    }

}
