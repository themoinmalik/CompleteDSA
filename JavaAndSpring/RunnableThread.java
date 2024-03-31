package src.JavaAndSpring;

public class RunnableThread implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i am runnable...");
//            try {
////                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }


}
