package Patient;

import java.util.List;

public interface PatientDAO {
    
    void addPatient( Patient p );
    void deletePatient( int patientId );
    Patient getPatient( int Id );
    List<Patient> getAllPatients();
    
}
