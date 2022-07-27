import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

class UserInput{

    static Scanner in = new Scanner(System.in);
    static String registeredBefore;
    static String ownerName;
    static String contact;
    static String brand;
    static String model;
    static String yearModel;
    static String color;
    static String license;
    static String userInput[] = new String[8];
    static WriteToFile writeToFile = new WriteToFile("userFile.txt");
    public static void GetUserChoice(){
        Scanner in = new Scanner(System.in);
        
		
		/*String[] userInput = {
				"Yes", "Jiyo", "Toyota", "Vios", "2021", "Pearl White", "LAD 400"
				};*/
        System.out.println("1 - Read Files");
        System.out.println("2 - Write Files");
        System.out.println("3 - Update Files");
        System.out.println("4 - Delete Files");
        System.out.println("Hello and Welcome. What do you want to do today? ");
        int choice = in.nextInt();

        String textFileName = "userFile.txt";
            if (choice == 1) {
                FileReader.ReadFile(textFileName);
            }
            else if (choice == 2) {
                GetUserInput();
            }
            else if (choice == 3) {
                writeToFile.UpdateFile();
            }
            else if (choice == 4) {
                writeToFile.DeleteFile();
            }

    }
    
    public static void GetUserInput(){
        UserInput.GetRegistration();
        UserInput.GetName();
        UserInput.GetContact();
        UserInput.GetBrand();
        UserInput.GetModel();
        UserInput.GetYearModel();
        UserInput.GetColor();
        UserInput.GetLicense();
        DisplayInput.DisplayInputs(userInput);
        Validation.AskIfCorrect();
        writeToFile.WriteFile(userInput);
    }
    public static void GetRegistration(){
        System.out.print("Have you registered with an insurance company before? ");
        registeredBefore = in.nextLine();
        userInput[0] = registeredBefore;

        }
    public static void GetName(){
        System.out.print("Enter your full name: ");
        ownerName = in.nextLine();
        userInput[1] = ownerName;
        //calls validation in order to check if the input is correct         
        Validation.IsValidName(userInput[1]);

    }
    public static void GetContact(){

        System.out.print("Enter your contact information: ");
        contact = in.nextLine();
        
        // nextLine otherwise carbrand will have the same
        //value as contact info
        userInput[2] = contact;
        //calls validation in order to check if the input is correct
        Validation.IsValidContact(userInput[2]);

    }
    public static void GetBrand(){

        System.out.print("Enter the brand of your car: ");
        brand = in.nextLine();
        userInput[3] = brand;
        //calls validation in order to check if the input is correct
        Validation.IsValidBrand(brand);
        // if carBrand is valid, clear out carModel
        // to remove issues with carModel not being in carBrand
        //

    }
    //This method ask for the model of the users car
    public static void GetModel(){

        System.out.print("Enter the model of your car: ");
        model = in.nextLine();
        userInput[4] = model;
        //calls validation in order to check if the input is correct
        Validation.IsValidModel(userInput[4], userInput[3]);

    }
    public static void GetYearModel(){
        
        System.out.print("Enter the the year model of your car: ");
        yearModel = in.nextLine();
        userInput[5] = yearModel;
        //calls validation in order to check if the input is correct
        Validation.IsValidYear(userInput[5]);
    
    }
    public static void GetColor(){
        System.out.print("Enter the colour of your car: ");
        color = in.nextLine();
        userInput[6] = color;
        //calls validation in order to check if the input is correct
        Validation.IsValidColor(userInput[6]);
    
    }
    public static void GetLicense(){
        
        System.out.print("Enter the license plate number of your car: [ex. LLL 555] ");
        license = in.nextLine();
        userInput[7] = license;
        //calls validation in order to check if the input is correct
        Validation.IsValidLicense(userInput[7]);
        
    }
      
}