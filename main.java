// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String fullnames = "";
        String car_type = "";
        String start_day = "";
        String end_day = "";
        int total_amount = 0;
        int start_index = 0;
        int end_index = 0;
        String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; 
        int sedan_amounts[] = {10000,5000,6000,15000,9350,8400,8400};
        int coupe_amounts[] = {12000,8500,6000,13500,7460,8400,8000};
        int minivan_amounts[] = {7500,350,6000,11000,5600,8400,8000};
        
        System.out.println("----------- WELCOME TO CAR RENTALS --------------\n");
        System.out.println("Car Types:");
        System.out.println("        1. SEDAN \n    2. COUPE \n    3. MINIVAN");
        
        System.out.println("\n\nOkay, Lets get down to business\n");
        Thread.sleep(2000);
        System.out.println("Enter your full names: ");
        fullnames = scanner.nextLine();
        
        System.out.println("Enter car type: ");
        car_type = scanner.next();
        
        System.out.println("Enter the start day: ");
        start_day = scanner.next();
        
        System.out.println("Enter the end day: ");
        end_day = scanner.next();
        
        System.out.println("\nNames: " + fullnames + "\nCar type: " + car_type + "\nStart day: " + start_day + "\nEnd day: " + end_day);
        
        // Computing the amount 
        if(car_type.equals("SEDAN")) {
            // Getting the index of first day
            for(int i = 0; i<days.length; i++) {
                if(start_day.equals(days[i])) {
                    start_index = i;
                }
                else if(end_day.equals(days[i])) {
                    end_index = i;
                }
            }
            int renting_days = (end_index - start_index) + 1;
            System.out.println("\nYou will be renting this car for " + renting_days  + " days");
            
            for(int j = start_index; j <= end_index; j++ ) {
                total_amount += sedan_amounts[j];
            }
            
            System.out.println("\nThe total amount will be " + total_amount);
        }
        else if(car_type.equals("COUPE")) {
            for(int i = 0; i<days.length; i++) {
                if(start_day.equals(days[i])) {
                    start_index = i;
                }
                else if(end_day.equals(days[i])) {
                    end_index = i;
                }
            }
            int renting_days = (end_index - start_index) + 1;
            System.out.println("\nYou will be renting this car for " + renting_days  + " days");
            
            for(int j = start_index; j <= end_index; j++ ) {
                total_amount += coupe_amounts[j];
            }
            
            System.out.println("\nThe total amount will be " + total_amount);
        }
        else if(car_type.equals("MINIVAN")) {
            for(int i = 0; i<days.length; i++) {
                if(start_day.equals(days[i])) {
                    start_index = i;
                }
                else if(end_day.equals(days[i])) {
                    end_index = i;
                }
            }
            int renting_days = (end_index - start_index) + 1;
            System.out.println("\nYou will be renting this car for " + renting_days  + " days");
            
            for(int j = start_index; j <= end_index; j++ ) {
                total_amount += minivan_amounts[j];
            }
            
            System.out.println("\nThe total amount will be " + total_amount);
        }
        else {
            System.out.println("Choose a valid car type");
        }
    }
}
