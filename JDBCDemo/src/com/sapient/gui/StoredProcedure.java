package com.sapient.gui;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoredProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection dbConnection=null;
    	//PreparedStatement pStatement=null;
    	CallableStatement cStatement= null;
    	int empID= 102;
    	try {
    		
    		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        	
       	 dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "mohit", "mohit123");
    		
			cStatement =dbConnection.prepareCall("{call query_emp(?,?,?,?)}");
			cStatement.setInt(1, empID);
			
			cStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
			cStatement.registerOutParameter(3, java.sql.Types.DECIMAL);
			cStatement.registerOutParameter(4, java.sql.Types.DECIMAL);
			
			cStatement.execute();
			
			String empName = cStatement.getString(2);
			BigDecimal empSal = cStatement.getBigDecimal(3);
			BigDecimal empComm = cStatement.getBigDecimal(4);
			
			System.out.println("Employee name is : "+empName);
			System.out.println("Employee salary is : "+empSal);
			System.out.println("Employee compensation is : "+empComm);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		

	}

}
