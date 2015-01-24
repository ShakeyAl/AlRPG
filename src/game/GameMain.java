package game;
//import java.sql.*;
import java.sql.Types;

import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;

public class GameMain {

	public static void main(String[] args) throws Exception{
		
		Game game1 = new Game();
		
		SimpleResultSet rs = new SimpleResultSet();
		rs.addColumn("NAME",  Types.VARCHAR, 255, 0);
		rs.addColumn("EMAIL", Types.VARCHAR, 255, 0);
		rs.addRow("Bob Meier", "bob.meier@abcde.abc");
		rs.addRow("John Jones", "john.jones@abcde.abc");
		new Csv().write("data/test.csv", rs, null);
		
		game1.start(/* pass database into here */);
		
		
	}
}