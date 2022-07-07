import java.util.Scanner;
public class HailToArmstrong {
    public static void main(String[] args) {
/*
* This code aims to solve certain problem.
* link: https://app.patika.dev/courses/java101/pratik-armstrong-1
* find armstrong numbers in this range 0<x<1000
What is armstrong numbers?
*Armstrong number definition is the number in any given number base, which forms the total
* of the same number, when each of its digits is raised to the power of the number of digits
*  in the number.
* EXP: 153 is an armstrong number
* it has 3 digit.
* (1^3)+(3^3)+(5^3)=1+27+125=153
* To find these numbers. We have to find how much digit in the number.
* therefore, we have to divide the given number by 10 and declare the new number as an
* integer until the new number goes to 0.
* Then we have to find the every digit of this given number one by one. mod this number by
* 10 and declare the new number as an INTEGER number will give us one digit at a time.
*  */

        //LET'S GET STARTED
        int counter=0, result=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int isArmstrong = scan.nextInt();
        int temp=isArmstrong, mod;
        while(temp!=0){
            temp /= 10;
            counter++;
        }
            temp=isArmstrong;
            while(temp!=0){
                mod=temp%10;
                int init=1;
                for (int i=1; i<=counter;i++){
                    init*=mod;
                }
                    result+=init;
                    temp/=10;
            }
            if(result==isArmstrong){
                System.out.println(isArmstrong+"     is an Armstrong Number.");
            }
            else
                System.out.println(isArmstrong+"     is not an Armstrong Number.");



    }
}
