package Q2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_handling_3 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Results.txt");
		if(file.createNewFile())
		{
			System.out.println("File created :" +file.getName());
		}
		else
		{
			System.out.println("File already exists");
		}
		
		/*
		 * FileWriter writtenFile = new FileWriter("Results.txt");
		 * writtenFile.write("Test Execution started"); writtenFile.close();
		 * System.out.println("Successfully written to the file....");
		 * 
		 * FileWriter FilewriteAppend = new FileWriter("Results.txt", true);
		 * FilewriteAppend.append("\nTest Exceution Completed");
		 * FilewriteAppend.close();
		 * System.out.println("Successfully appended to the file....");
		 */
        
        Scanner objScanner = new Scanner(file);
        System.out.println("Reading the file content....");
        while(objScanner.hasNextLine())
        {
        	System.out.println(objScanner.nextLine());
        }
        objScanner.close();
		// TODO Auto-generated method stub

	}

}
