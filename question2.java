import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a date: ");
        String inputDate = s.nextLine();
        int date, month = 0, year = 0;
        String dateConverted[] = {};
        for(int i = 0; i < inputDate.length(); i++){
            dateConverted =  inputDate.split("/");
        }
        date = Integer.parseInt(dateConverted[0]);
        month = Integer.parseInt(dateConverted[1]);
        year = Integer.parseInt(dateConverted[2]);

        
        if(date > 31 || date <= 0){
            System.out.println("Please enter valid date.");
            return;
        }
        if(month > 12 || month < 1){
            System.out.println("Please enter valid month.");
            return;
        }
        
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
}
}
