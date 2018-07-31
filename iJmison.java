package textMessage;

/*
 * You're probably going to do this in steps. So first, before making any separate applications or sockets or anything.
 *  I recommend that you design a class that has the following attributes. 
 *  Name
	ChatBox
 *  
 *  Think about how you would design a chatbox... Each person/client has a name (or some ID), some way of keeping all the text messages they have gotten.
 *  
 *  So you can make your classes have attributes that describe those things
	A chatbox that can hold a bunch of messages will likely hold the messages in a list or something
	Anyway. I will let you mess around with making the chat box. You can make a text file that has a "mock" or "simulation" of a conversation.
	 Where you literally have stuff like:
	 											jmison;heybud;20180717133010
												relentless;hey whatsup;20180717133020
	
	Obviously a message there is encoded as "name;message;datetime"
	After you have some of your chatbox implemented, you can have your main() read from the text file and populate your chat box so that you can kinda see what it looks like.
	
	What you can do is also make your own class for opening/reading/parsing files... 
	Make it a separate file/class that you can use one each project that you work with files... 
	Slowly start building your own library of classes that you wrote
 */

public class iJmison extends TextFileReaderWriter {
	public static void main (String [] args) throws Exception {
		//reads the text file
		reader();
				
		//writes within the text file, overwrites previous writtens text
		//writer();
		
		//appender, continues the output of the console input.. each run and each time called
		appender(null);
	}
}
