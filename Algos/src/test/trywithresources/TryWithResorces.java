package test.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TryWithResorces {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		 
		        try (Connection con = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/TestDB","sa","test_1234");
		             PreparedStatement ps = con.prepareStatement("SELECT * FROM Vehicle ");
		        	 ResultSet rs = ps.executeQuery();) {
				    while(rs.next()){
		            	System.out.println(rs.getInt("id"));
		                System.out.println(rs.getString("VehicleName"));
		            }
		        }catch (SQLException e) {
			        e.printStackTrace();
			    }
		    
		

	}

}
