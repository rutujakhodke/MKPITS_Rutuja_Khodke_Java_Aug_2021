package com.mkpits.service;
import com.mkpits.myconnection.ConnectionClass;
import java.sql.*;
public class CandidateService {
    Connection con = null;

    //method to insert record into Candidate table.
    public String insertCandidate(String fn, String ln) {
        String str = null;
        try {
            con = ConnectionClass.createConnection();
            String query = "Insert into Candidate (firstname,lastname) values (?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, fn);
            pstmt.setString(2, ln);
            int res = pstmt.executeUpdate();
            str = "Candidate Table Created successfully";
        } catch (Exception ee) {
            str = ee.toString();
        }
        return str;
    }

    //method toupdate record from Candidate table.
    public String updateCandidate(String fn1, String ln1) {
        String str1 = null;
        try {
            con = ConnectionClass.createConnection();
            String query = "Update Candidate set Lastname=? where firstname=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, ln1);
            pstmt.setString(2, fn1);
            int res = pstmt.executeUpdate();
            str1 = "Record updated successfully";
        } catch (Exception ee) {
            str1 = ee.toString();
        }
        return str1;
    }

    //method to delete record from Candidate table.
    public String deleteCandidate(String fn) {
        String str = null;
        try {
            con = ConnectionClass.createConnection();
            String query = "Delete from Candidate where firstname=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, fn);
            int res = pstmt.executeUpdate();
            str = "Record deleted successfully";
        } catch (Exception ee) {
            str = ee.toString();
        }
        return str;
    }
}

