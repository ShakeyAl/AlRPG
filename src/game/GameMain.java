package game;
//import java.sql.*;

public class GameMain {

	public static void main(String[] args) throws Exception{
		
		Game game1 = new Game();
		
		/*
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/charactersheet", "sa", "sa");
		Statement stat = conn.createStatement();
		stat.execute("insert into charsheet values(1, 'Duke', 'Warrior', 1, 0, 0, 10, 10, 10, 10, 100, 50, 20, 20, 20)");
		stat.execute("insert into charsheet values(2, 'Dude', 'Wizard', 1, 0, 0, 10, 10, 10, 10, 100, 50, 20 , 20, 20)");
		
		ResultSet rs;
		rs = stat.executeQuery("select * from charsheet");
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		
		}
		
		stat.close();
		conn.close();
		*/
		game1.start();
		
	}
}