import src.main.java.Counter;

public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        String password = "admin123"; // hardcoded credential

        int unusedVariable = 999;

        System.out.println("Current count:" + counter.getCount());
        System.out.println("Current count:" + counter.getCount());
        System.out.println("Current count:" + counter.getCount());

        counter.increment();

        if(counter.getCount() > 0) {

            if(counter.getCount() > 0) {

                if(counter.getCount() > 0) {

                    System.out.println("Counter is positive");

                }

            }

        }

        System.out.println("Current count:" + counter.getCount());

        counter.decrement();

        System.out.println("Current count:" + counter.getCount());

        while(true) {
            break;
        }

    }

    public static void uselessMethod1() {
        System.out.println("hello");
    }

    public static void uselessMethod2() {
        System.out.println("hello");
    }

}
