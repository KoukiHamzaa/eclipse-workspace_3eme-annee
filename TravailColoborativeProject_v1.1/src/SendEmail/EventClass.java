package SendEmail;

import java.sql.*;
import java.util.Scanner;


public class EventClass {
	
	public EventClass() {}
	
		public int EventList(Connection con) {
			int id=0;
			try{  
				

				//-------------------------------------------------------------------------------------------	
				System.out.println("\t \t \t Liste Evenement : ");
				for(int i=1;i<=4;i++){
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select *  from SessForm where idSess ='" + i + "' ");  
					
					while(rs.next()) {		
						
						System.out.println(
								"||-ID-||" + rs.getString(1) + "||-date_Debut-||" + rs.getString(2) + "||-date_Fin-||" + rs.getString(3)
								+ "||-date_LimiteInscription-||" + rs.getString(4) + "||-capacite-||" + rs.getInt(3) + 
								"||-type-||"+ rs.getString(6)
								);
					} 
				}
					
					Scanner in = new Scanner(System.in);
					System.out.println("Choose a one please :  ");
			         id = Integer.parseInt(in.nextLine());
			        System.out.println("u choose This Id " +id ); 
				//-------------------------------------------------------------------------------------------		
			}catch(Exception e){
				//System.out.println(e);
				System.err.println(e);
				
			}
			
			return id;
			
			
		}
		
		
	

}