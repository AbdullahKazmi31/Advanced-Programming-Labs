package javaapplication1;
/**
 *
 * @author mkazmi.bscs16seecs
 */
import java.sql.*;  
import java.util.Scanner;
class JavaApplication1{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/students","root","seecs@123"); 
Statement stmt=con.createStatement();

System.out.println("What action do you want to perform?\n");
System.out.println("1)Insert 2)Update 3)Delete\n");
Scanner sc = new Scanner(System.in);
int ans = sc.nextInt();

if(ans == 1){
boolean rs1=stmt.execute("INSERT INTO feeslip VALUES('3','Raeed', 'Asif', 'december', '12/11/2018')");
}
else if(ans == 2){
boolean rs2=stmt.execute("UPDATE feeslip SET firstname = 'Asim', lastname= 'Noor' WHERE regno = 1");
}
else if(ans == 3){
boolean rs3=stmt.execute("DELETE FROM feeslip WHERE firstname='Asim'");
}

ResultSet rs=stmt.executeQuery("select * from feeslip");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+ " "+rs.getString(4)+" "+rs.getString(5)); 

rs.close();
stmt.close();
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}