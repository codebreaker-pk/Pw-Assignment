// Q4. Write a Java program to check if a given string is a palindrome or not using a loop.

public class palindrome {
    public static void main(String[] args) {
        String string = "Avinash";
        boolean flag = true;
        string = string.toLowerCase();
        for(int i = 0; i < string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                flag = false;
                break;
               }
            }
        if(flag) System.out.println("String is palindrome");
        else System.out.println(" string is not a palindrome");
    }

}
