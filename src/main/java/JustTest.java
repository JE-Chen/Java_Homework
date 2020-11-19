interface Test{

    //必須實作
    abstract void abstractTest();

    //沒有被繼承 不必實作
    default void defaultTest(String name){
        //privateTest(name);
    }

    /*
    //沒有被繼承 不必實作
    private void privateTest(String name){
        System.out.println("Hello " + name);
    }
     */
}

public class JustTest implements Test{

    public static void main(String[] argv){
        //可以用實例化界面的方式
        Test test = new JustTest();
        //不需覆寫直接呼叫
        test.defaultTest("JE");

        System.out.println("------------------------------------");

        //呼叫覆寫後的
        test.abstractTest();

        //動態繫結到另一個有實作介面的類別
        test = new implementsTest();
        //呼叫另一個類別實作的方法
        test.abstractTest();

    }

    @Override
    public void abstractTest() {
        this.defaultTest("JustTest");
        System.out.println("abstractTest in JustTest");
    }

    static class implementsTest implements Test{

        @Override
        public void abstractTest() {
            this.defaultTest("abstractTest");
            System.out.println("abstractTest in implementsTest");
        }
    }

}