package designePattern.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("PC", "8GB", "500 GB", "i5");
		
		Computer server = ComputerFactory.getComputer("Server", "16GB", "2TB", "i7");
		
		System.out.println("PC := " + pc.toString());
		
		System.out.println("Server := " + server.toString());
		
		

	}

}
