/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geeks;

import Common.LoadApp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jatin
 */
public class thirdInterImpl implements thirdInterface{

    @Override
    public void userCarDta(third third1) {

       String query = "insert into cardetails (MODEL, VARIANT ,REGISTRATIONYEAR, COLOR,KILOMETERDRIVE,OWNERSHIP,CITY,LOCALITY,SELLINGPRICE,OWNERNAME,EMAIL,MOBILENO,IMAGE_PATH) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = LoadApp.conn.prepareStatement(query);
            
            System.out.println("User Car Data");
            System.out.println( third1.getModel() );
            
            ps.setString(1, third1.getModel());
            ps.setString(2, third1.getVariant());
            ps.setString(3, third1.getRegistrationyear());
            ps.setString(4, third1.getColor());
            ps.setString(5, third1.getKilometerdrive());
            ps.setString(6, third1.getOwnership());
            ps.setString(7, third1.getCity());
            ps.setString(8, third1.getLocality());
            ps.setString(9, third1.getSellingprice());
            ps.setString(10, third1.getOwnername());
            ps.setString(11, third1.getEmail());
            ps.setString(12, third1.getMobileno());
            ps.setString(13, third1.getImage_path());
            ps.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList list_data() {
        String query="select * from CARDETAILS";
        ArrayList<third> arrayList=new ArrayList();
        try {
            PreparedStatement ps = LoadApp.conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
               
                third pn=new third();
                pn.setId(rs.getInt("id")); 
                pn.setModel(rs.getString("model"));
                pn.setVariant(rs.getString("variant"));
                pn.setRegistrationyear(rs.getString("registrationyear"));
                pn.setColor(rs.getString("color"));
                pn.setKilometerdrive(rs.getString("kilometerdrive"));
                pn.setOwnership(rs.getString("ownership"));
                pn.setCity(rs.getString("city"));
                pn.setLocality(rs.getString("locality"));
                pn.setSellingprice(rs.getString("sellingprice"));
                pn.setOwnername(rs.getString("ownername"));
                pn.setEmail(rs.getString("email"));
                pn.setMobileno(rs.getString("mobileno"));
                pn.setImage_path(rs.getString("image_path"));
                arrayList.add(pn);
               }
        } catch (SQLException ex) {
            System.out.println("erorr in sql: "+ex);
        }

        return  arrayList;
    }
    
    }


