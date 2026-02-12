package Q2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_handling_1 {

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
		
		FileWriter writtenFile = new FileWriter("Results.txt");
		writtenFile.write("Test Execution started");
		writtenFile.close();
        System.out.println("Successfully written to the file....");
		
		// TODO Auto-generated method stub

	}

}
