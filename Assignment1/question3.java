import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int x,y,choice;

            System.out.println("Mini-Calculator");
            System.out.println("0-Exit  1-Addition  2-Subtraction  3-Multiplication   4-Divison ");
            System.out.println("Enter your choice: ");
            choice = st.nextInt();
            System.out.println("Enter the vale of x: ");
            x = st.nextInt();
            System.out.println("Enter the value of y: ");
            y = st.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1: {
                    int add = x + y;
                    System.out.println("Addition: " + add);
                    break;
                }
                case 2: {
                    int sub = x - y;
                    System.out.println("Subtraction: " + sub);
                    break;
                }
                case 3: {
                    int mul = x * y;
                    System.out.println("Multiplication: " + mul);
                    break;
                }
                case 4: {
                    int div = x / y;
                    System.out.println("Divsion: " + div);
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        

    }
}
