package udemy;

import java.util.Scanner;

public class Type {
    public static void main(String[] args) {

        int lettersCount=0;
        int numbersInString=0;
        int spacesInString=0;
        int othersInString=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        char []x = str.toCharArray();

        for(char c : x){
            System.out.print(c);
            if(Character.isDigit(c)){
                numbersInString++;
            } else if (Character.isLetter(c)) {
                lettersCount++;
            } else if (Character.isSpaceChar(c)) {
                spacesInString++;
            }else {
                othersInString++;
            }
        }

        System.out.println("letters : "+lettersCount);
        System.out.println("numbers : "+numbersInString);
        System.out.println("spaces : "+spacesInString);
        System.out.println("others : "+othersInString);

    }
}
