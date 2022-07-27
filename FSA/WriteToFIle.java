import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

class WriteToFile extends Validation{
	File fileObj;
	FileWriter fileWriter;
	String textFileName;
	
	public WriteToFile(String _textFileName) {
			// creates File object with reference to the textFileName string
			textFileName = _textFileName;
			fileObj = new File(textFileName);
			
	}
	
	public boolean IsFileExisting() {
		
		if (!fileObj.exists()) {
			return false;
		};
		return true;
	}
	
	
	
	public void DeleteFile() {
			fileObj.delete();
			System.out.println("Cleared out form.");
	}
	
	public void UpdateFile() {
		Scanner in = new Scanner(System.in);
		String[] dataFromFile = new String[8];
		dataFromFile = FileReader.GetFileInputs(textFileName);
		
		// checks if dataFromFile has values inside it
		// if not, just return
		for (int i = 0; i < dataFromFile.length; i++) {
			if (dataFromFile[i] == null) {
				return;
			}
		}
		System.out.println("Which information do you want to update?");
		System.out.println(
				"1 - Registered before, 2 - Owner Name, 3 - Contact Number 4 - Car Brand,"
			+ 	" 5 - Car Model, 6 - Year Model, 7 - Color, 8 - License Number");
		int updateChoice = in.nextInt();
		in.nextLine();
		
		//minus 1 because array starts in 0, and choice
		// starts at 1 and userInput starts at 0
		// for if statement
		int choiceCompToArray = updateChoice - 1;
		String newInfo = "";
		boolean isValidInfo = false;
		while (!isValidInfo) {
			System.out.print("Input new information: ");
			newInfo = in.nextLine();
			switch(choiceCompToArray) {
				case 0: {
					isValidInfo = true;
					break;
				}
				case 1:{
					isValidInfo = IsValidName(newInfo);
					break;
				}
				
				case 2:{
					isValidInfo = IsValidContact(newInfo);
					break;
				}
				case 3:{
					isValidInfo = IsValidBrand(newInfo);
					 if (isValidInfo) {
			             	dataFromFile[4] = "";
			             	System.out.println("Car Model is now blank since Car Brand has been updated.");
			             }
					break;
				}
				case 4:{
					// dataFromFile[2] is carBrand
					isValidInfo = IsValidModel(newInfo, dataFromFile[2]);
					break;
				}
				case 5:{
					isValidInfo = IsValidYear(newInfo);
					break;
				}
				case 6:{
					isValidInfo = IsValidColor(newInfo);
					break;
				}
				case 7:{
					isValidInfo = IsValidLicense(newInfo);
					break;
				}
				default: {
					return;
				}
			}
		}
		
		// minus 1 because array starts in 0, and choice
		// starts at 1
		
		dataFromFile[updateChoice - 1] = newInfo;
		System.out.println("Updated info.");
		WriteFile(dataFromFile);
		
		
	}
	
	public void WriteFile(String[]userInput) {
		try {
			fileWriter = new FileWriter(textFileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileWriter.write(MessageFormat.format(
					"Registered before: {0}\n"
				+ 	"Owner Name: {1}\n"
				+	"Contact Number: {2}\n"
				+	"Car Brand: {3}\n"
				+	"Car Model: {4}\n"
				+	"Year Model: {5}\n"
				+	"Color: {6}\n"
				+ 	"License number: {7}",
					userInput[0], 
					userInput[1],
					userInput[2],
					userInput[3],
					userInput[4],
					userInput[5],
					userInput[6],
					userInput[7]
					));
			
			fileWriter.close();
		} catch (IOException ioE) {
			// TODO Auto-generated catch block
			ioE.printStackTrace();
		} 
		System.out.println("Saved information.");
	
	}
	
	 // Inherited from Validation to change 
	 // where invalid outputs are thrown
	
	 //This method checks the users name if there are special characters that are not allowed
	private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ. ";
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
    private static String hondaModel[] = {"Civic", "Brio", "City", "Jazz"};
    private static String fordModel[] = {"Ecosport", "Everest", "Expedition", "Ranger", "Fiesta", "Ranger Raptor", "Mustang"};
    private static String toyotaModel[] = {"Corolla", "Prius", "Camry", "Fortuner", "Land Cruiser", "Avanza", "Hilux"};
    private static String nissanModel[] = {"Navara", "Urvan", "Terra", "Almera", "Juke"};
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
            return false;
        }
        else{
            return true;
        }
        
    }
    //This method checks if the model inputted by the
    //user is covered by the inusrance company
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
                System.out.println("I am sorry. Our company does not cover this brand's car model. Please enter a car model that our company can cover. [Navara / Urvan / Terra / Alemra / Juke]");
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
    //Determines if the user input are all numbers and has 4 numbers 
    public static boolean IsValidYear(String yearModel){
        if(yearModel.length() != 4){
            System.out.println("I am sorry. Year Model is Invalid. Please enter a valid year model.");
            return false;
        }
        else{
        String number = "0123456789";
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
                    return false;
                }
            }
    }
        return true;
    }
            
    }
    //checks if the user has inputted a color
    public static boolean IsValidColor(String color){
        //The array that contains the colors
        String colorArr[] = {"Red", "Blue", "Black", "Gray", "White", "Green", "Yellow", "Violet", "Purple", "Orange", "Maroon", "Brown"};
        //Sorts them out in alphabetic ascending order
        Arrays.sort(colorArr);
        //using binarySearch the program can easily check if the user input is inside the array
        int checker = Arrays.binarySearch(colorArr, color);
        //validator determines if checker is true or false
        boolean validator = checker >= 0 ? true : false;
        if(validator == false){
            System.out.println("I am sorry. Invalid Color. Please enter valid color");
            return false;
        }
        else{
            return true;
        }

    }
    //Determines if the user inputted the correct license plate number
    //by checking if there are three letters and three numbers
    private static String licenseLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String licenseNumber = "0123456789";
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
                        return false;
                    }
                }
    
            }
            //this part checks if the second half are all numbers
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
                        return false;
                    }
                }
            }
        }
        else{
            System.out.println("I am sorry. License Plate Number is Invalid. Please enter a valid license plate number.");
            return false;
        }
    return true;
    }
	
}
