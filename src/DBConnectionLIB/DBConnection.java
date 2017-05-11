package DBConnectionLIB;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.util.Scanner;

public class DBConnection 
{
	public static Connection conn = null;
	public static PreparedStatement prepStatement = null;
	public static Statement statement = null;
	public static Statement stmt = null;
	public static int resultSet2;
	public static ResultSet resultSet = null;
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int cont = 0;
	public static int aux = 0;
	
	
	public DBConnection()
	{
		String driverUrl = "com.mysql.jdbc.Driver";
		
		try 
		{
			Class.forName(driverUrl);
			System.out.println("Driver Found");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		
		String url = "jdbc:mysql://localhost/textyourpath";
		String user = "root";
		String password = "";
		
		try 
		{
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Ligacao a base de dados efectuada com sucesso");
			
			statement = (Statement) conn.createStatement();
			
			int contas = 0;
			int [] id = new int[50];
			
			String username;
			String password2;
			
			
			//Sistema para contar quantas contas existem
			resultSet = statement.executeQuery("SELECT Count(*) FROM account");
			
			 while (resultSet.next()) 
			 {
				  int valor = resultSet.getInt(1);
				  System.out.println(valor);
				  contas = valor;
				  
				 
			 }
			 //--------------------------------------------
			 
			 //Sistema para listar todas as contas dentro da base de dados
			resultSet = statement.executeQuery("SELECT * FROM account");
			 
			for(int i = 0; i < contas; i++)
			{
				
				resultSet.next();
				
				
				
				id[i] = resultSet.getInt("id");
				

				String nome = resultSet.getString("accountName");
				String pw = resultSet.getString("accountPass");
				System.out.println(id[i] + " " + nome + " " + pw);
			
				
			}
			//--------------------------------------------------
			
			//Sistema de Login
			resultSet = statement.executeQuery("SELECT accountName, accountPass FROM account");
			System.out.println("Introduza o seu nome");
			 username = sc.nextLine();
			 System.out.println("Introduza a password");
			 password2 = sc.nextLine();
			 
			for(int j = 0; j < contas; j++)
			{
				resultSet.next();
				String nome2 = resultSet.getString("accountName");
				String pass2 = resultSet.getString("accountPass");
				
				if(nome2.compareTo(username) == 0)
				{
					
					if(pass2.compareTo(password2) == 0)
					{
						System.out.println("Login com Successo!");
					}
					else
						System.out.println("Errado");
				}
				
			}
			//----------------------------------------------------------
			
			//Sistema de Registo
			String regNome;
			String regPass;
			System.out.println("Registo: ");
			System.out.println("Introduza o nome que deseja para a conta: ");
			regNome = sc.nextLine();
			System.out.println("Introduza a password que deseja para a conta: ");
			regPass = sc.nextLine();
			
			
			resultSet2 = statement.executeUpdate("INSERT INTO account(accountName, accountPass) VALUES ('"+regNome+"', '"+regPass+"')");
			//--------------------------------------------------------------		
			
			//Sistema de Comentarios
			String comment, comment2, personName;
			int contas2 = 0;
			
			resultSet = statement.executeQuery("SELECT Count(*) FROM comments");
			
			 while (resultSet.next()) 
			 {
				  int valor2 = resultSet.getInt(1);
				  System.out.println(valor2);
				  contas2 = valor2;
				  
				 
			 }
			
			 
			System.out.println("Comentarios:");
			resultSet = statement.executeQuery("SELECT * FROM comments");
			for(int i = 0; i < contas2; i++)
			{
				
				resultSet.next();
				
				
				
				id[i] = resultSet.getInt("idComment");
				

				comment = resultSet.getString("personComment");
				personName = resultSet.getString("personName");
				
				System.out.println(id[i] + " " + personName + " " +  comment);
			
				
			}
			
			System.out.println("Escreva um comentario!");
			comment2 = sc.nextLine();
			resultSet2 = statement.executeUpdate("INSERT INTO comments(personComment, personName) VALUES ('"+comment2+"', '"+username+"')");
			
			//-----------------------------------------------------------
			
			
			
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
	}
	
		
	
	public static void main(String[] args) 
	{
		String driverUrl = "com.mysql.jdbc.Driver";
		
		try 
		{
			Class.forName(driverUrl);
			System.out.println("Driver Found");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		
		String url = "jdbc:mysql://localhost/textyourpath";
		String user = "root";
		String password = "";
		
		try 
		{
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Ligacao a base de dados efectuada com sucesso");
			
			statement = (Statement) conn.createStatement();
			
			int contas = 0;
			int [] id = new int[50];
			
			String username;
			String password2;
			
			
			//Sistema para contar quantas contas existem
			resultSet = statement.executeQuery("SELECT Count(*) FROM account");
			
			 while (resultSet.next()) 
			 {
				  int valor = resultSet.getInt(1);
				  System.out.println(valor);
				  contas = valor;
				  
				 
			 }
			 //--------------------------------------------
			 
			 //Sistema para listar todas as contas dentro da base de dados
			resultSet = statement.executeQuery("SELECT * FROM account");
			 
			for(int i = 0; i < contas; i++)
			{
				
				resultSet.next();
				
				
				
				id[i] = resultSet.getInt("id");
				

				String nome = resultSet.getString("accountName");
				String pw = resultSet.getString("accountPass");
				System.out.println(id[i] + " " + nome + " " + pw);
			
				
			}
			//--------------------------------------------------
			
			//Sistema de Login
			resultSet = statement.executeQuery("SELECT accountName, accountPass FROM account");
			System.out.println("Introduza o seu nome");
			 username = sc.nextLine();
			 System.out.println("Introduza a password");
			 password2 = sc.nextLine();
			 
			for(int j = 0; j < contas; j++)
			{
				resultSet.next();
				String nome2 = resultSet.getString("accountName");
				String pass2 = resultSet.getString("accountPass");
				
				if(nome2.compareTo(username) == 0)
				{
					
					if(pass2.compareTo(password2) == 0)
					{
						System.out.println("Login com Successo!");
					}
					else
						System.out.println("Errado");
				}
				
			}
			//----------------------------------------------------------
			
			//Sistema de Registo
			String regNome;
			String regPass;
			System.out.println("Registo: ");
			System.out.println("Introduza o nome que deseja para a conta: ");
			regNome = sc.nextLine();
			System.out.println("Introduza a password que deseja para a conta: ");
			regPass = sc.nextLine();
			
			
			resultSet2 = statement.executeUpdate("INSERT INTO account(accountName, accountPass) VALUES ('"+regNome+"', '"+regPass+"')");
			//--------------------------------------------------------------		
			
			//Sistema de Comentarios
			String comment, comment2, personName;
			int contas2 = 0;
			
			resultSet = statement.executeQuery("SELECT Count(*) FROM comments");
			
			 while (resultSet.next()) 
			 {
				  int valor2 = resultSet.getInt(1);
				  System.out.println(valor2);
				  contas2 = valor2;
				  
				 
			 }
			
			 
			System.out.println("Comentarios:");
			resultSet = statement.executeQuery("SELECT * FROM comments");
			for(int i = 0; i < contas2; i++)
			{
				
				resultSet.next();
				
				
				
				id[i] = resultSet.getInt("idComment");
				

				comment = resultSet.getString("personComment");
				personName = resultSet.getString("personName");
				
				System.out.println(id[i] + " " + personName + " " +  comment);
			
				
			}
			
			System.out.println("Escreva um comentario!");
			comment2 = sc.nextLine();
			resultSet2 = statement.executeUpdate("INSERT INTO comments(personComment, personName) VALUES ('"+comment2+"', '"+username+"')");
			
			//-----------------------------------------------------------
			
			
			
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
	}
	
	
}