package abstraction;

public interface MarkerInterface {
}

class MyMarkerClass {

    public void show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {
        MyMarkerClass myMarkerClass = new MyMarkerClass();

        if(myMarkerClass instanceof MarkerInterface){
            myMarkerClass.show();
        }

    }

}
