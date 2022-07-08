
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

        for (int k = 1; k < 1000; k++) {
            int counter = 0, result = 0; //we declared these two integer in this loop bc at the end
            // of every loop, we have to initialise these two variables to make sure that they
            // don't affect the result variable.
            int temp = k, mod;
            while (temp != 0) {
                temp /= 10;
                counter++;
            }
            temp = k;
            while (temp != 0) {
                mod = temp % 10;
                int init = 1;
                for (int i = 1; i <= counter; i++) {
                    init *= mod;
                }
                result += init;
                temp /= 10;
            }

            if (result == k) {
                System.out.println(k + "     is an Armstrong Number.");
            }
        }
    }
    }

