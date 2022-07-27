import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

class FileReader {
	
	public static String[] ReadFile(String textFileName) {
				// there are 7 user inputs to retrieve
			  String[] dataArray = new String[8];
		      File fileObj = new File(textFileName);
		      WriteToFile writeToFile = new WriteToFile(textFileName);
		      if (!writeToFile.IsFileExisting()) {
		    	  System.out.println("There are no current records!");
		    	  return dataArray;
		      }
		      try {
			      Scanner fileReader = new Scanner(fileObj);
			      int lineCounter = 0;
			      System.out.println("-Car Form-");
			      while (fileReader.hasNextLine()) {
			        dataArray[lineCounter] = fileReader.nextLine();
			        System.out.println(dataArray[lineCounter]);
			        lineCounter++;
			        
			      }
			      fileReader.close();
			      return dataArray;
		
		} catch (IOException ioE) {
			// insert error message saying file do not exist
			ioE.printStackTrace();
		}
		      return dataArray;
		     

}
	public static String[] GetFileInputs(String textFileName) {
		boolean isStartOfInput = false;
		String[] inputs = new String[8];
		String[] dataFromFile;
		dataFromFile = FileReader.ReadFile(textFileName);
		
		// if any of the file is null, it means the 
		// file is just empty
		for (int i = 0; i < dataFromFile.length; i++) {
			if (dataFromFile[i] == null) {
				//System.out.println("There are no current records!");
				return dataFromFile;
			}
		}
		
		// loop for all input lines
		for(int i = 0; i < dataFromFile.length; i++) {
			// initialize all null values to ""
			// to avoid adding null: in inputs value
			inputs[i] = "";
			// loops through all characters in input lines
			for (int j = 0; j < dataFromFile[i].length(); j++) {
				// if loop has detected ":"
				// it means the next characters are the inputs
				if (dataFromFile[i].charAt(j) == ':') {
					isStartOfInput = true;
				}
				// if the loop has not yet reached the end(maximum length of dataArray)
				// then continue storing characters
				// if the character is ":", ignore it
				if (isStartOfInput && j != dataFromFile[i].length() &&
					dataFromFile[i].charAt(j) != ':') {
					inputs[i] = inputs[i] + dataFromFile[i].charAt(j);
					
					// removes whitespaces from start and end of string
					String noSpaceInput= inputs[i].replaceFirst("^ *", "");
					inputs[i] = noSpaceInput;
					 
				}
				
				// minus 1 because length() starts with 1
				// while j starts with 0
				if (j == dataFromFile[i].length() - 1){
					isStartOfInput = false;
					
				}
			
			}
		}
		return inputs;
	}
}
