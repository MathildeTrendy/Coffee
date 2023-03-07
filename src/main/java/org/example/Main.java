package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Database db = new Database();

        db.coffeeprod();

        db.coffeepricename();


        //c)	En metode, der returnerer en String med leverandørnavn og adresse på alle leverandører (tabellen SUPPLIERS).
        //Adresseinformationer skal være i denne rækkefølge: vejnavn, postnr, by og stat.
        //Tip: Benyt StringBuilder.
        //Main metoden udskriver returnværdien.
    }
}