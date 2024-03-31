package src.JavaAndSpring;

public class ChildThread extends Thread{


    @Override
    public void run(){

        for (int i = 0; i < 1000; i++) {
            System.out.println("i am child thread...");
        }

    }


}
