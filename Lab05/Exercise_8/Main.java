package Exercise_8;

public class Main {
    public static void main(String[] args) {

        SumTask task1 = new SumTask(10);
        PrimeTask task2 = new PrimeTask();
        StudentCSVTask task3 = new StudentCSVTask();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

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
