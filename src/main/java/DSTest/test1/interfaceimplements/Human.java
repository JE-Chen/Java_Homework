package DSTest.test1.interfaceimplements;

public interface Human {

    default void printType(){
        System.out.println("Human");
    }

}
