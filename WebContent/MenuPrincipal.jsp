<%@page import="frames.MenuPrincipal2"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page import="java.awt.Frame"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.awt.BorderLayout,
java.awt.EventQueue,

javax.swing.JFrame,
javax.swing.JPanel,
javax.swing.border.EmptyBorder,
javax.swing.JLabel,
java.awt.Font,
javax.swing.JButton,
javax.swing.ImageIcon,
java.awt.Color,
java.awt.event.ActionListener,
java.awt.event.ActionEvent,
javax.swing.JTabbedPane,
java.io.Reader,java.sql.Connection, java.sql.DriverManager,java.sql.ResultSet,java.sql.SQLException,java.util.Scanner" %>


    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

Connection conn = null;

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

String url = "jdbc:mysql://localhost:3306/textyourpath";
String user = "root";
String password = "";

try 
{
	conn = DriverManager.getConnection(url, user, password);
	System.out.println("Ligacao a base de dados efectuada com sucesso");

} 
catch (SQLException e) 
{
	System.out.println(e);
}
	
	

	MenuPrincipal2 frame = new MenuPrincipal2();

	frame.setVisible(true);
	

%>


</body>
</html>