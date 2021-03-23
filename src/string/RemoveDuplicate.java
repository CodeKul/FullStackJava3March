package string;

public class RemoveDuplicate {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("JavaCode");

        for(int i=0;i<s.length();i++){

            for(int j=i+1;j<s.length();j++){

                if(s.charAt(i)==s.charAt(j)){
                    s.deleteCharAt(j);
                }
            }
        }

        System.out.println(s);

    }
}
