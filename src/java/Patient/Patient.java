package Patient;

import org.json.simple.JSONObject;

public class Patient {

    private int id;
 
    private String firstname;
    private String password;
    
    private String Contact;
    private String address;
    private String email;

    
    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", firstname=" + firstname + ", password=" + password + ", Contact=" + Contact + ", address=" + address + ", email=" + email + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    public Patient() {
    }
    
    public String getJSON()
    {
        String retval = "";
        
        JSONObject jobj = new JSONObject();
        
        
        jobj.put("firstname", this.getFirstname());
        jobj.put("password", this.getPassword());
        jobj.put("contact", this.getContact());
        jobj.put("address", this.getAddress());
        jobj.put("email", this.getEmail());
        

        retval = jobj.toJSONString();
        
        return retval;
    }
    
    public JSONObject getJSONObject()
    {
        JSONObject retval = new JSONObject();
        
        
        retval.put("firstname", this.getFirstname());
        retval.put("password", this.getPassword());
        retval.put("contact", this.getContact());
        retval.put("address", this.getAddress());
        retval.put("email", this.getEmail());
        

        return retval;
    }
}











