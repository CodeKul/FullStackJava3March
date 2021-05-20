package java8;

public class FirstLetterCaps {

    public static void main(String[] args) {
        UpperCase upperCase = FirstLetterCaps::capFirstLetter;
        upperCase.capFirstLetter("java");
    }

    private static void capFirstLetter(String str){
        char[] arr = str.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        String up = new String(arr);
        System.out.println(up);
    }
}

interface UpperCase{
    void capFirstLetter(String str);
}
