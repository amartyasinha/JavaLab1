import java.util.Scanner;

class Complex {
    double x;
    double y;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Real Part: ");
        x = sc.nextDouble();
        System.out.print("Enter the Imaginary Part: ");
        y = sc.nextDouble();
    }

    public String toString(){
        return (x + " + " + y + "i");
    }

    void add(Complex c2) {
        x = x + c2.x;
        y = y + c2.y;
    }

    void multiplication(Complex c2){
        x = (x*c2.x) - (y*c2.y);
        y = (x*c2.y) + (y*c2.x);
    }

}
class Q1Complex{
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.input();
        System.out.println("The Complex Number is "+c1);
        c2.input();
        System.out.println("The Complex Number is "+c2);

        char repeat;
        do {
            System.out.println("Select the Operation you want to Perform: ");
            System.out.println("1. Addition of Complex Numbers");
            System.out.println("2. Multiplication of Complex Numbers");
            System.out.print("Choice: ");
            Scanner scn = new Scanner(System.in);
            int choice = scn.nextInt();

            switch (choice) {
                case 1 -> {
                    c1.add(c2);
                    System.out.print("The Addition of these two Complex numbers is ");
                    System.out.println(c1);
                }
                case 2 -> {
                    c1.multiplication(c2);
                    System.out.print("The Multiplication of these two Complex numbers is ");
                    System.out.println(c1);
                }
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
            System.out.println("Do you want to Return to Main Menu? Y/N");
            System.out.print("Choice: ");
            repeat = scn.next().charAt(0);
        }while(repeat == 'Y' || repeat == 'y');

    }
}