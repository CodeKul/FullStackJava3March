package abstraction;

import java.util.Arrays;
import java.util.List;

public abstract class Sport {

    Sport(){
        System.out.println("In const");
    }
    abstract void play();//declaring method
    public void exercise(){//defining method
        System.out.println("do exercise");
    }

    public void a(){
        exercise();
    }
}


class Football extends Sport{

    @Override
    void play() {
        System.out.println("Playing football");
    }

    public static void main(String[] args) {
        Football football = new Football();
        football.play();


    }
}

class Cricket extends Sport{

    @Override
    void play() {
        System.out.println("Playing C");
    }

    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.play();
        cricket.exercise();
    }
}