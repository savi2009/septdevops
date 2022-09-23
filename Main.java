public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte MyByteValue = 10;
        short MyShortValue = 20;
        int MyIntValue = 50;

        long MyLongValue = 50000L+(10*(MyByteValue+MyShortValue+MyIntValue));
        System.out.println(MyLongValue);

        short shortTotal = (short) (1000 + 10 * (MyByteValue+MyShortValue+MyIntValue));


        ;
    }

}