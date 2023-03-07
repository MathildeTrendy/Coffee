package org.example;
import java.sql.DriverManager;
import java.sql.*;

public class Database {
    public void coffeeprod(){
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_db", "root", "Mathmilo1996")) {
            String SQL= "SELECT COF_NAME FROM coffees";

            Statement stmt = con.createStatement();

            ResultSet rst = stmt.executeQuery(SQL);
        while(rst.next()) {
            System.out.println(rst.getString("COF_NAME"));
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
public void coffeepricename(){
    try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_db", "root", "Mathmilo1996")) {
        String nameprice= "SELECT COF_NAME, PRICE \n" +
                "FROM coffees\n" +
                "WHERE PRICE =8.99 or PRICE >9\n" +
                "ORDER BY PRICE ASC";

        PreparedStatement pstmt = con.prepareStatement(nameprice);



        ResultSet rst = pstmt.executeQuery();
        while(rst.next()) {
            System.out.println(rst.getString("COF_NAME"));
            System.out.println(rst.getString("PRICE"));
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

public void supplier(){
    try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_db", "root", "Barthur2254!")) {
        String nameprice= "SELECT SUP_NAME, STREET, ZIP, CITY, STATE\n" +
                "FROM suppliers";

        PreparedStatement pstmt = con.prepareStatement(nameprice);

        ResultSet rst = pstmt.executeQuery();
        while(rst.next()) {
            System.out.println(rst.getString("COF_NAME"));
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}
}

    //c)	En metode, der returnerer en String med leverandørnavn og adresse på alle leverandører (tabellen SUPPLIERS).
    //Adresseinformationer skal være i denne rækkefølge: vejnavn, postnr, by og stat.
