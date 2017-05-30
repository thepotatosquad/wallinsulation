
public class TestExport {
	public static void main(String[]args){
		String FN = "Sean";
		String LN = "Raghed";
		int state = 1; //customer
		String UN = "seanraghed01";
		String pass = "qwerty12345";
		String email = "sean.raghed@yahoo.com";
		Users seanTest = new Users(FN, LN, email, state,
				UN, pass);
		boolean exportBool = seanTest.exportData();
		if (exportBool){
			System.out.println("Successfully exported the data");
		} else {
			System.out.println("Failed to export the data");
		}
		Object importObj = seanTest.importData();
		if (importObj != null ){
			System.out.println("Successfully imported the data."
					+ " Object is: " + importObj.toString());
		} else {
			System.out.println("Failed to import the data");
		}
	}
}
