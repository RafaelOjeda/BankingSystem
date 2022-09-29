package sql;

import java.sql.*;
import java.util.ArrayList;

public class Sql {
    private final String url;
    private final String userName;
    private final String password;
    private String query;

    // Creates Sql object
    public Sql(String url, String userName, String password) throws Exception {
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    // Creates connection with database
    public Connection createConnection() throws SQLException {
        try {
            String fullUrl = "jdbc:mysql://" + url; // localhost:3306/banking

            Connection conn = DriverManager.getConnection(fullUrl, userName, password);

            System.out.println("Connection Established.");

            return conn;
        } catch (SQLException e) { e.printStackTrace(); }
        return null;
    }

    // Prints all data that is in the table
    public void printAllFromTable(String tableName) throws SQLException {
        Connection conn = this.createConnection();

        String query = "SELECT * FROM " + tableName;
        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(query);
            ResultSetMetaData rsmd = result.getMetaData();
            int num_columns = rsmd.getColumnCount();
            while (result.next()) { // LOOPS THROUGH ROWS
                for (int i = 1; i <= num_columns; i++) { // LOOPS THROUGH COLUMNS
                    System.out.print(result.getString(i) + ":");
                }
                System.out.println();
            }
        }
    }

    // Returns all data in a specified column in an ArrayList
    public ArrayList<String> printAllFromSelectedColumn(String tableName, String columnName) throws SQLException {

        Connection conn = this.createConnection();
        query = "SELECT " + columnName + " FROM " + tableName;
        ArrayList<String> rowData = new ArrayList<>();

        try (Statement stmt = conn.createStatement()) {
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) { // LOOPS THROUGH ROWS
                rowData.add(result.getString(columnName));
            }

            return rowData;
        } catch (SQLException e) {e.printStackTrace();}
        return null;
    }

    // Inserts new row onto any table
//    public static void newRowInsertion(String tableName, String[] dataInsert) throws SQLException {
//            LOOPS THROUGH ALL COLUMNS OF TABLE AND INSERTS EACH INDEX INTO THE COLUMN;
//        String query = "INSERT INTO " + tableName + "VALUES(";
//        try (Statement stmt = conn.createStatement()) {
//            for (int i = 0; i < dataInsert.length; i++) {
//                if (i == dataInsert.length - 1) {
//                    query.concat(dataInsert[i] + ")");
//                } else {
//                    query.concat(dataInsert[i] + ",");
//                }
//            }
//            ResultSet result = stmt.executeQuery(query);
//
//        } catch (SQLException e) {e.printStackTrace();}
//    }


}
