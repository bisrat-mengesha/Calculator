import java.util.Scanner;

public class Calculator {
    Scanner input =new Scanner(System.in);
    String Swith(){
        System.out.println("Choose the following index");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        System.out.println("Enter the operation index :");
        int options=input.nextInt();

        return switch (options) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            case 4 -> "/";
            default -> "0";
        };

    }
public static void main(String[] args) {
    
}

}
class Calculation{
    double a,b;
    public Calculation(double a, double b){
        this.a=a;
        this.b=b;
    }

    static double Add(double a, double b) {
        return a+b;
    }
    static double Substract(double a,double b ){
        return a-b;
    }
    
    
}
