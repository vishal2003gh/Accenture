import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight");
        int wt = sc.nextInt();
        System.out.println("Enter Height");
        float ht = sc.nextFloat();
        float BMI = wt / (ht * ht);
        System.out.println(BMI);
        if (BMI < 18)
            System.out.println("0");
        if (BMI >= 18 && BMI < 25)
            System.out.println("1");
        if (BMI >= 25 && BMI < 30)
            System.out.println("2");
        if (BMI >= 30 && BMI < 40)
            System.out.println("3");
        if (BMI >= 40)
            System.out.println("4");
    }
}
