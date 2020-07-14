package Common;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Patient.Patient;
import Patient.PatientDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vasudev
 */
@WebServlet(urlPatterns = {"/AddPatientToDB"})
public class AddPatientToDB extends HttpServlet {

    PatientDAOImpl pdao = new PatientDAOImpl();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddPatientToDB</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>YOUR ACCOUNT IS CREATED<br></h1>");
            out.println("</body>");
            out.println("<a href='index.jsp'> <h3 align='center'>HOME</a>");
            
            String params[] = request.getParameterValues("psignup");
            
            Patient p = new Patient();
            
            for( int i = 0 ; i <  params.length ; i++ )
            {
                switch( i )
                {
                        
                    case 0: p.setFirstname(params[i]);break;
                    case 1: p.setPassword(params[i]);break;
                    
                    case 3: p.setContact(params[i]);break;
                    case 4: p.setAddress(params[i]);break;
                    case 5: p.setEmail(params[i]);break;
                }
                
                
            }
            
            System.out.println( p );
            
            pdao.addPatient(p);
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
