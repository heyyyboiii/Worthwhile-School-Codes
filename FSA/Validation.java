import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

class Validation{

	private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ. ";
	
    static Scanner in = new Scanner(System.in);
    //This method ask the user if the inputs are correct and prompts them to change if there are anything wrong
    public static void AskIfCorrect(){
        System.out.print("Are the information shown above correct? [1 - Yes / 2 - No] ");
        int correct = in.nextInt();

        if(correct == 2){
            UserInput.GetUserInput();
        }
    }
    //This method checks the users name if there are special characters that are not needed
    public static boolean IsValidName(String ownername){
    
        for (int i = 0; i < ownername.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                // isValid is re-declared over and over again
                // because if it is only true, a non-valid
                // character will no longer be detected
                // and isValid will not change
                boolean isValid = false;
                if (ownername.charAt(i) == alphabet.charAt(j)) {
                    isValid = true;
                    break;
                }
            
                // if loop already end, and still not valid
                if (j + 1 == alphabet.length() && !isValid ) {
                    System.out.println("I am sorry. Name is Invalid. Please enter a valid name.");
                    UserInput.GetName();
                    return false;
                }
            }
    
    }
        return true;
    }
    //This method checks if the contact number is correct
    // by checking if it is all numbers and has eleven number
    private static String number = "0123456789";
    public static boolean IsValidContact(String contact){
        //This checks if the contact number is not equal to eleven 
        //if not then it will warn the user that the contact number is invalid
        if(contact.length() != 11){
            System.out.println("I am sorry. Contact Number is Invalid. Please enter a valid contact number.");
            UserInput.GetContact();
            return false;
        }
        else{
        for (int i = 0; i < contact.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                // isValid is re-declared over and over again
                // because if it is only true, a non-valid
                // character will no longer be detected
                // and isValid will not change
                boolean isValid = false;
                if (contact.charAt(i) == number.charAt(j)) {
                    isValid = true;
                    break;
                }
            
                // if loop already end, and still not valid
                if (j + 1 == number.length() && !isValid ) {
                    System.out.println("I am sorry. Contact Number is Invalid. Please enter a valid contact number.");
                    UserInput.GetContact();
                    return false;
                }
            }
    }
        return true;
    }
    }
    //This method checks if the brand inputted by the 
    //user is covered by the insurance company
    private static String carBrand[] = {"Ford", "Toyota", "Honda", "Nissan"};
    public static boolean IsValidBrand(String brand){
        //The array with the valid brands
        //Sorts them out in alphabetic ascending order
        Arrays.sort(carBrand);
        //using binarySearch the program can easily check if the user input is inside the array
        int checker = Arrays.binarySearch(carBrand, brand);
        //validator determines if checker is true or false
        boolean validator = checker >= 0 ? true : false;
        if(validator == false){
            System.out.println("I am sorry. Our company does not cover this car brand. Please enter a car brand that our company can cover. [Toyota / Honda / Ford / Nissan]");
            UserInput.GetBrand();
            return false;
        }
        else{
            return true;
        }
        
    }
    //This method checks if the model inputted by the
    //user is covered by the inusrance company
    private static String toyotaModel[] = {"Corolla", "Prius", "Camry", "Fortuner", "Land Cruiser", "Avanza", "Hilux"};
    private static String hondaModel[] = {"Civic", "Brio", "City", "Jazz"};
    private static String fordModel[] = {"Ecosport", "Everest", "Expedition", "Ranger", "Fiesta", "Ranger Raptor", "Mustang"};
    private static String nissanModel[] = {"Navara", "Urvan", "Terra", "Almera", "Juke"};
    public static boolean IsValidModel(String model, String brand){
        
        if(brand.equals("Toyota")){
            //The array with the valid car models
            //Sorts them out in alphabetic ascending order
            Arrays.sort(toyotaModel);
            //using binarySearch the program can easily check if the user input is inside the array
            int checker = Arrays.binarySearch(toyotaModel, model);
            //validator determines if checker is true or false
            boolean validator = checker >= 0 ? true : false;
            if(validator == false){
                System.out.println("I am sorry. Our company does not cover this brand's car model. Please enter a car model that our company can cover. [Corolla / Prius / Camry / Fortuner / Land Cruiser / Avanza / Hilux]");
                UserInput.GetModel();
                return false;
            }
            else{
                return true;
            }
        }
        else if(brand.equals("Honda")){
            //The array with the valid car models
            //Sorts them out in alphabetic ascending order
            Arrays.sort(hondaModel);
            //using binarySearch the program can easily check if the user input is inside the array
            int checker = Arrays.binarySearch(hondaModel, model);
            //validator determines if checker is true or false
            boolean validator = checker >= 0 ? true : false;
            if(validator == false){
                System.out.println("I am sorry. Our company does not cover this brand's car model. Please enter a car model that our company can cover. [Civic / Brio / City / Jazz]");
                UserInput.GetModel();
                return false;
            }
            else{
                return true;
            }
        }
        else if(brand.equals("Ford")){
            //The array with the valid car models
            //Sorts them out in alphabetic ascending order
            Arrays.sort(fordModel);
            //using binarySearch the program can easily check if the user input is inside the array
            int checker = Arrays.binarySearch(fordModel, model);
            //validator determines if checker is true or false
            boolean validator = checker >= 0 ? true : false;
            if(validator == false){
                System.out.println("I am sorry. Our company does not cover this brand's car model. Please enter a car model that our company can cover. [Ecosport / Everest / Expedition / Ranger / Fiesta / Ranger Raptor / Mustang]");
                UserInput.GetModel();
                return false;
            }
            else{
                return true;
            }
        }
        else if(brand.equals("Nissan")){
            //The array with the valid car models
            //Sorts them out in alphabetic ascending order
            Arrays.sort(nissanModel);
            //using binarySearch the program can easily check if the user input is inside the array
            int checker = Arrays.binarySearch(nissanModel, model);
            //validator determines if checker is true or false
            boolean validator = checker >= 0 ? true : false;
            if(validator == false){
                System.out.println("I am sorry. Our company does not cover this brand's car model. Please enter a car model that our company can cover. [Navara / Urvan / Terra / Almera / Juke]");
                UserInput.GetModel();
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
    public static boolean IsValidYear(String yearModel){
        if(yearModel.length() != 4){
            System.out.println("I am sorry. Year Model is Invalid. Please enter a valid year model.");
            UserInput.GetYearModel();
            return false;
        }
        else{
        for (int i = 0; i < yearModel.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                // isValid is re-declared over and over again
                // because if it is only true, a non-valid
                // character will no longer be detected
                // and isValid will not change
                boolean isValid = false;
                if (yearModel.charAt(i) == number.charAt(j)) {
                    isValid = true;
                    break;
                }
            
                // if loop already end, and still not valid
                if (j + 1 == number.length() && !isValid ) {
                    System.out.println("I am sorry. Year Model is Invalid. Please enter a valid year model.");
                    UserInput.GetYearModel();
                    return false;
                }
            }
    }
        return true;
    }
            
    }
    
    //checks if the user has inputted a color
    private static String colorArr[] = {"Red", "Blue", "Black", "Gray", "White", "Green", "Yellow", "Violet", "Purple", "Orange", "Maroon", "Brown"};
    //Determines if the user input are all numbers and has 4 numbers 
    public static boolean IsValidColor(String color){
        //The array that contains the colors
        //Sorts them out in alphabetic ascending order
        Arrays.sort(colorArr);
        //using binarySearch the program can easily check if the user input is inside the array
        int checker = Arrays.binarySearch(colorArr, color);
        //validator determines if checker is true or false
        boolean validator = checker >= 0 ? true : false;
        if(validator == false){
            System.out.println("I am sorry. Invalid Color. Please enter valid color");
            UserInput.GetColor();
            return false;
        }
        else{
            return true;
        }

    }
    //Determines if the user inputted the correct license plate number
    //by checking if there are three letters and three numbers
    
    private static String licenseLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static boolean IsValidLicense(String license){
        //splits the license plate into letters and numbers 
        //and assigns them into their respective variables
        String licenseSpilt[] = license.split(" ", 2);
        String let = licenseSpilt [0];
        String num = licenseSpilt [1];
        //checks if the user has inputted 3 letters and 3 numbers, 
        //if not then the program warns the user that they have 
        //inputted and invalid license plate number
        if(let.length() == 3 & num.length() == 3){
            //this part checks if the first half are all letters
            for (int i = 0; i < let.length(); i++) {
                for (int j = 0; j < licenseLetter.length(); j++) {
                    // isValid is re-declared over and over again
                    // because if it is only true, a non-valid
                    // character will no longer be detected
                    // and isValid will not change
                    boolean isValid = false;
                    if (let.charAt(i) == licenseLetter.charAt(j)) {
                        isValid = true;
                        break;
                    }
            
                    // if loop already end, and still not valid
                    if (j + 1 == licenseLetter.length() && !isValid ) {
                        System.out.println("I am sorry. License Plate Number is Invalid. Please enter a valid license plate number.");
                        UserInput.GetLicense();
                        return false;
                    }
                }
    
            }
            //this part checks if the second half are all numbers
            String licenseNumber = "0123456789";
            for (int i = 0; i < num.length(); i++) {
                for (int j = 0; j < licenseNumber.length(); j++) {
                    // isValid is re-declared over and over again
                    // because if it is only true, a non-valid
                    // character will no longer be detected
                    // and isValid will not change
                    boolean isValid = false;
                    if (num.charAt(i) == licenseNumber.charAt(j)) {
                        isValid = true;
                    break;
                    }
        
                    // if loop already end, and still not valid
                    if (j + 1 == licenseNumber.length() && !isValid ) {
                        System.out.println("I am sorry. License Plate Number is Invalid. Please enter a valid license plate number.");
                        UserInput.GetLicense();
                        return false;
                    }
                }
            }
        }
        else{
            System.out.println("I am sorry. License Plate Number is Invalid. Please enter a valid license plate number.");
            UserInput.GetLicense();
            return false;
        }
    return true;
    }
}
