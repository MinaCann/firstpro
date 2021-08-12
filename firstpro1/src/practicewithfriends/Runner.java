package practicewithfriends;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Runner {
public static void main (String[]args) throws IOException {
	 Circle circle1=new Circle();
	 GeometricObject circle2=(GeometricObject) new Circle();
	 Rectangle rectangle = new Rectangle();
	 
	 FileOutputStream file = new FileOutputStream ("GeometricObjects.txt");
	 ObjectOutputStream os=new ObjectOutputStream(file);
	 os.writeObject(circle1);
	 os.writeObject(circle2);
	 os.writeObject(rectangle);
	 
}


}
