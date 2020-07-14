package Patient;

import Common.LoadApp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Id;
import static jdk.nashorn.internal.runtime.Debug.id;

public class PatientDAOImpl implements PatientDAO{

    @Override
            public void addPatient(Patient p) {
        String query = "insert into patients (firstname, password ,contact, address,email) values (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = LoadApp.conn.prepareStatement(query);
            
            ps.setString(1, p.getFirstname());
            ps.setString(2, p.getPassword());
            
            ps.setString(3, p.getContact());
            ps.setString(4, p.getAddress());
            ps.setString(5, p.getEmail());
                    
            ps.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
            
    
    
 @Override
    public void deletePatient(int patientId) {
        String query = "delete from patients where Id = " + patientId;
        
        try {
            Statement stmt = LoadApp.conn.createStatement();
            
            stmt.executeUpdate(query);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

   
    @Override
    public Patient getPatient(int patientId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> getAllPatients() {
        
        List<Patient> list = new LinkedList<Patient>();
        
        String query = "select * from patients";
        
        try {
            Statement stmt = LoadApp.conn.createStatement();
            
            ResultSet rs =  stmt.executeQuery(query);
            
            while( rs.next() )
            {
                Patient p = new Patient();
                
                p.setId( rs.getInt("Id") );
                p.setFirstname( rs.getString("firstname") );
                p.setContact( rs.getString("contact") );
                p.setAddress(rs.getString("address") );
                p.setEmail( rs.getString("email") );
                list.add(p);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return list;
    }
}












