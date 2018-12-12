package SerializationTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerTestWrite {

	public static void main(String[] args) {
		Person object = new Person(10, "John", "Texas");

		// Serialization
		try {

			// Saving of object in a file
			FileOutputStream file = new FileOutputStream("per.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
			System.out.println(object.toString());

			// value of static variable changed
			// object.b = 2000;
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		// object = null;

	}

	

}
