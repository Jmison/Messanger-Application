package textMessage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

//When a user(a) sends a message the message is saved to a text file, the text file is then sent to user(b) who then reads it.
//Thats why we have a writer, and reader.

public class TextFileReaderWriter {
	//reads
	public static void reader() {
		try {
			//allows us to read the DM Convo file, and spit results within the console
			File file = new File ("/Users/jamie/Desktop/Chatter");
			Scanner sc = new Scanner (file);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
			sc.close();		//made yellow squiggly line go away xD
		} catch (FileNotFoundException e) {
			System.out.println("There's an error mate, go fix it." + '\n');
			e.printStackTrace();
		}
	}
	
	//writes
	public static void writer() {
		try {
			FileWriter writer = new FileWriter("/Users/jamie/Desktop/Chatter");
			writer.write("Wow, I can actually type in a Java IDE that goes into a text file?!");
			writer.close();
		} catch (IOException e) {			
			System.out.println("There's an error mate, go fix it." + '\n');
			e.printStackTrace();
		}
	}
	
	//method that appends the file
	//when called, the outputs will continue to spit out altering the text file each time
	// *pretty much repeats itself constantly, if called
	public static void appender(String inputMessages) {
		try(FileWriter fw = new FileWriter("/Users/jamie/Desktop/Chatter", true);
				//for user input
				InputStreamReader iS = new InputStreamReader(System.in);
				BufferedReader iSB = new BufferedReader(iS);
				
				//for text file
			    BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			
					//preprented text dialoge
					out.println("");
					out.println("User 1: Wanna go to Starbucks?");
					out.println("User 2: What time are you thinking?");
					
					//user input ~ needs work, if I rerun it will seperate the first and second response as if the previous responses never happened
					//think deep on it, could be an easy fix you've gotten this far!
					String response = iSB.readLine();
					System.out.println("User 1: " + response); //lets us see what user typed, in console
					out.println("User 1: " + response); //adds to the text file, of what user typed
				} catch (IOException e) {
					System.out.println("Exception occuried mate.");
				}
	}
}
