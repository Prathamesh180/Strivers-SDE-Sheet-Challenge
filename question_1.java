import java.util.*;
class question_1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = s.nextInt();
        int Number = inputNumber, answer = 0, digit = 0;

        if(Number < 0) Number *= -1;
        while(Number > 0){
            digit = Number%10;
            Number = Number/10;
            answer = answer*10+ digit;
        }
        if(inputNumber < 0){
            answer = answer * (-1);
        }
        System.out.println(answer);
    }
}