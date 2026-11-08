package Exercise_7;

public class Main {
    public static void main(String[] args) {

        SumThread t1 = new SumThread(10);
        PrimeThread t2 = new PrimeThread();
        StudentCSVThread t3 = new StudentCSVThread();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        t3.start();
    }
}
