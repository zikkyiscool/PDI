package Exercise_7;

public class PrimeThread extends Thread {

    @Override
    public void run() {
        System.out.println("Prime numbers from 1 to 100:");

        for (int i = 2; i <= 100; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

