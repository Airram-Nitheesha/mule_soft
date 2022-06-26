package com.company;

import java.sql.*;

public class Insert_Record{
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement
			
			String query0 = "INSERT INTO MyMovies values ('KGF 2','Yash','Srinidhi Shetty', 2022,'Prashanth Neil');";
            stmt.executeUpdate(query0); // Create Query-0

            String query1 = "INSERT INTO MyMovies values ('Bahubali 1','Prabhas','Anushka', 2015,'S.S.Rajamouli');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO MyMovies values ('Don','Shiva Karthikeyan','Priyanka Mohan',2022,'Cibi Chakravarthi');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO MyMovies values ('Ninnu Kori','Nani','Nivetha Thomas',2017,'Shiva Nirvana');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO MyMovies values ('Chhichhore','Sushanth singh rajput','Shraddha kapoor',2019,'Nitesh Tiwari');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO MyMovies values ('Khiladi','Ravi Teja','Dimple Hayathi',2020,'Ramesh Varma');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}