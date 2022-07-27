import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

class DisplayInput{
    //This displays the users input so they can verify if the input is correct
    public static void DisplayInputs(String[]userInput){
        
        System.out.println("Registered before in another insurance company: " + userInput[0]);
        System.out.println("Name: " + userInput[1]);
        System.out.println("Contact Information: " + userInput[2]);
        System.out.println("Car Brand: " + userInput[3]);
        System.out.println("Car Model: " + userInput[4]);
        System.out.println("Car Year Model: " + userInput[5]);
        System.out.println("Car Color: " + userInput[6]);
        System.out.println("License Plate Number: " + userInput[7]);
        
    }
}