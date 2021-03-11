package abstraction;

public interface SportInterface {

     void play();


}

class Football1 implements SportInterface{


    @Override
    public void play() {
        System.out.println("Playing football");
    }

    public static void main(String[] args) {
        Football1 football1 = new Football1();
        football1.play();
    }
}
