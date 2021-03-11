package polymorphism;

public class Bank {

    public void interest(int i){
        System.out.println("Interest is "+i);
    }
}

class SBI extends Bank{

    public void interest(int i){
        System.out.println("Interest is "+i);
    }
}

class HDFC extends  Bank{

//    public void interest(int i){
//        System.out.println("Interest is "+i);
//    }
}


class Main{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.interest(9);

        Bank hdfc = new HDFC();
        hdfc.interest(8);

    }
}