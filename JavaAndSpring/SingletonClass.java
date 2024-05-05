package src.JavaAndSpring;

public class SingletonClass  {


    private static SingletonClass instance;

    private SingletonClass() {

    }

    // private method
    private static SingletonClass getInstance(){

        if (instance == null){
            instance = new SingletonClass();
        }

        return instance;
    }

    private void getMessage(){
        System.out.println("Hello from singleton instance");
    }


    public static void main(String[] args) {

        SingletonClass singletonClass1 =  SingletonClass.getInstance();
        singletonClass1.getMessage();

        SingletonClass singletonClass2 = SingletonClass.getInstance();
        singletonClass2.getMessage();

        System.out.println(singletonClass1 == singletonClass2);  // this is true...


    }

}
