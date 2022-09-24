public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double firstVaribale = 20.00;
        double secondVariable = 80.00;

        double result= 100.00 * (firstVaribale+secondVariable);// 10000.00
        System.out.println("addition result is ="+result);
        double remainder = result%40.00; // 10000%40.00
        System.out.println("remainder result is ="+remainder);

        boolean isNoremainder = (remainder==0)? true:false;
        System.out.println("isNoremainder="+isNoremainder);
        if (!isNoremainder){
            System.out.println("Got some remainder");
        }
        boolean isremainder = (remainder!= 0)? true:false;
        if (!isremainder){
            System.out.println("I got it");
        }

    }
}