package DSTest.interfaceimplements;

public interface Human {

    default void printType(){
        System.out.println("Human");
    }

}
