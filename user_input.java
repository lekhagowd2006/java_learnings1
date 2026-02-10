import java.lang.System;
import java.util.Scanner;

class user_input_int{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("The value of a is: "+a);
    }
}

class user_input_string{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("The name is: "+name);
    }
}

class user_input_float{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float f = scn.nextFloat();
        System.out.println("The value of f is: "+f);
    }
}

class addition_of_two_numbers{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scn.nextInt();
        System.out.println("Enter second number:");
        int b = scn.nextInt();
        int sum = a + b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
    }
}