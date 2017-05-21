import java.io.*;
public class Users implements Serializable{
	private static final long serialVersionUID = 5532279828291713377L;
	private final String myFName;
	private final String myLName;
	private String myEmail;
	private int myState;
	private String myUsername;
	private String myPassword;
	
	public Users(String theFN, String theLN, String theEmail,
			int theState, String theUN, String thePass){
		myFName = theFN;
		myLName = theLN;
		myEmail = theEmail;
		myState = theState;
		myUsername = theUN;
		myPassword = thePass;
	}
	public String getUsername(){
		return myUsername;
	}
	public String getPassword(){
		return myPassword;
	}
	public String getFName(){
		return myFName;
	}
	public String getLName(){
		return myLName;
	}
	public int getState(){
		return myState;
	}
	public String getEmail(){
		return myEmail;
	}
	public void setUserName(String theUN){
		myUsername = theUN;
	}
	public void setPassword(String thePass){
		myPassword = thePass;
	}
	public void setEmail(String theEmail){
		myEmail = theEmail;
	}
	public boolean exportData(){
		ObjectOutputStream objout;
		FileOutputStream fout;
		try{
			fout = new FileOutputStream("profile.ser",true);
			objout = new ObjectOutputStream(fout);
			objout.writeObject(this);
			objout.close();
		}catch(Exception ex){
			return false;
		}
		return true;
	}
	public Object importData(){
		ObjectInputStream objin;
		FileInputStream fin;
		Object read;
		try{
			fin = new FileInputStream("profile.ser");
			objin = new ObjectInputStream(fin);
			read = objin.readObject();
			objin.close();
		} catch(Exception ex){
			return null;
		}
		return read;
	}
}
