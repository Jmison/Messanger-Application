package textMessage;

//parent class for users, we will extend this class in the others
public class Users {
	//variables
	String users;
	String[] messages;		//messages have to be stored so an Array List best fits

	//constructor
	public Users(String users, String[] messages) {
		super();
		this.users = users;
		this.messages = messages;
	}

	//will implement soon, think "how will one be able to send a message"
	void sendMessage (String message) {
		//sending user(A) message from user(B)
	}
}
