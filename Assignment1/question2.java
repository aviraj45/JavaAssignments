import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the year to be checked !: ");
        int year = st.nextInt();
      //  boolean r = (year %4 ==0 && year %100 !=0 || year%400==0);
        //System.out.println(r);
       if(year % 4 ==0 && year %100 != 0 || year %400 ==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

    }
}
