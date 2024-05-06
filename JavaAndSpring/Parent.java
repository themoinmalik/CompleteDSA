package src.JavaAndSpring;

public class Parent {

    void forAll(){

    }
}


class childa extends Parent{


    void forAll(){

    }

}


class ChildB extends Parent{

    @Override
    void forAll(){

    }

}


class main{

    Parent p = new Parent();

    Parent b = new ChildB();

//    ChildB d = new Parent();

}