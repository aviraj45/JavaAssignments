import java.util.Scanner;
class question6{
    public static void main(String[]args){
    Scanner st = new Scanner(System.in);
        System.out.println("Enter your body weight");
        double weight = st.nextDouble();
        System.out.println("Enter your body height in metres");
        double height = st.nextDouble();
        double bmi = (weight/(height*height));
        System.out.println("Your BodyMassIndex is : "+bmi + " kg/m^2");
    }
}