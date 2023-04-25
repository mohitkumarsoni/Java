package a0_git;

import java.util.Scanner;

interface OE{
    void oddEven(int n);
}

public  class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = sc.nextInt();

        OE obj = (int n)->{                     //lambda starts
            if(n%2==0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        };                                      //lambda ends (this function finds if the number is odd or even)

        obj.oddEven(num);

    }
}
/*Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters
and returns a value. Lambda expressions are similar to methods, but they do not need a name, and they can be
implemented right in the body of a method.

"lambda" can be written only when there is one method present in interface, if there is more than one method, you have to make
"anonymous class" , both ways allows us to perform function direct into main method without making class of interface

*/