package SerializationTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerRead {
	
	
	public static void main(String[] args) {
		
		//Person object = new Person();
		
		//Object object = new Object();

		// De serialization
		try {

			// Reading the object from a file
			FileInputStream file = new FileInputStream("per.ser");
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for de-serialization of object
			Object object = in.readObject();

			in.close();
			file.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			System.out.println(object.toString());

			// System.out.println("z = " + object1.z);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught" + ex);
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught" + ex);
		}

	} 

}
