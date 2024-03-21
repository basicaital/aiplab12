import task.Task;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        class Myclass extends Thread {
//            @Override
//            public void run() {
//                System.out.println("Running");
//            }
//            public void arrays(){
//                final int SIZE = 10000000;
//                final int HALF = SIZE/2;
//                float[] arr = new float[SIZE];
//                long a = System.currentTimeMillis();
//            }
//        }
//        class Myclass1 implements Runnable {
//            @Override
//            public void run() {
//                System.out.println("Running!!!");
//            }
//        }
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("running");
//            }
//        });
//        t1.start();
        Task task = new Task();
        System.out.println("Первый метод: ");
        task.runOneThread();
        System.out.println("Второй метод: ");
        task.runTwoThread();
    }

}