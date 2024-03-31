package src.JavaAndSpring;

public class MainThread extends Thread{


    public static void main(String[] args) {

//        ChildThread childThread = new ChildThread();
//        childThread.start();
//
//
//
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("i am main method...");
//            System.out.println(" this is working asynchronously...");
//        }

        RunnableThread runnableThread = new RunnableThread();

        Thread thread = new Thread(runnableThread);
        thread.start();
        thread.stop();

        System.out.println("i am main thread... " + Thread.currentThread().getName());


    }
}
