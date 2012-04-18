package TopTrumpsMcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class dbtest {
	// public static void main(String[] args) throws Exception {
	List<trumpcard> cardlist = new ArrayList<trumpcard>();

	dbtest() throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager
				.getConnection("jdbc:sqlite:db/emcees.sqlite");
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select rowid,* from Emcees;");
		// rowid is not included with *

		while (rs.next()) {
			// get values
			int num = rs.getInt("rowid");
			String name = rs.getString("Rapper");
			String v1n = "Substance";
			int v1v = rs.getInt("Substance");
			String v2n = "Originality";
			int v2v = rs.getInt("Originality");
			String v3n = "Flow";
			int v3v = rs.getInt("Flow");
			String v4n = "Total Score";
			int v4v = rs.getInt("Total Score");

			// instatiate tempcard
			trumpcard tempcard = new trumpcard(num, name, v1n, v1v, v2n, v2v,
					v3n, v3v, v4n, v4v);
			// now add to list
			cardlist.add(tempcard);
		}
		rs.close();
		conn.close();

	}

	void iterate() { // printing for test purposes
		Collections.shuffle(cardlist); // shuffle deck ;-)
		Iterator<trumpcard> it = cardlist.iterator();
		while (it.hasNext()) {
			trumpcard tcard = it.next(); // temp card object because java
			// System.out.println(it.toString()); // cant talk directly to
			// iterator
			System.out.println(tcard.toString());
		}
	}

}
/*
 * TODO How to retrieve the column name
 * 
 * sqlite_datareader.GetName(i).ToString() (i is the id of the column)
 */

// from testdb
// creates table and inserts
// Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
/*
 * stat.executeUpdate("drop table if exists people;");
 * stat.executeUpdate("create table people (name, occupation);");
 * PreparedStatement prep = conn
 * .prepareStatement("insert into people values (?, ?);");
 * 
 * prep.setString(1, "Gandhi"); prep.setString(2, "politics"); prep.addBatch();
 * prep.setString(1, "Turing"); prep.setString(2, "computers"); prep.addBatch();
 * prep.setString(1, "Wittgenstein"); prep.setString(2, "smartypants");
 * prep.addBatch();
 * 
 * conn.setAutoCommit(false); prep.executeBatch(); conn.setAutoCommit(true);
 * 
 * // ResultSet rs = stat.executeQuery("select * from people;");
 * 
 * while (rs.next()) { // System.out.println("name = " + rs.getString("name"));
 * // System.out.println("job = " + rs.getString("occupation")); }
 */

// ___________________________________________
// System.out.print("Rapper = " + rs.getString("Rapper"));
// System.out.print("Originality = " + rs.getString("Originality"));

// System.out.print("Substance = " + rs.getString("Substance"));
// System.out.print("Flow = " + rs.getString("Flow"));
// System.out.println("Total Score = " +
// rs.getString("Total Score"));
// ___________________________________________