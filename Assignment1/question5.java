import java.util.Scanner;
class question5{
    public static void main(String[]args){
    Scanner st = new Scanner(System.in);
        System.out.println("Enter a character to check whether it is vowel or consonant!");
        char ch = st.next().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }

    }
}