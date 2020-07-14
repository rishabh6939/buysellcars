/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geeks;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author jatin
 */
@WebServlet(name = "cloud", urlPatterns = {"/cloud"})
@MultipartConfig(fileSizeThreshold = 1024*1024*2, maxFileSize = 1024*1024*10,maxRequestSize = 1024*1024*50)
public class cloud extends HttpServlet {

    
    
    third third1=new third();
    
    
    public static final String SAVE_DIR = "upload_files";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cloud</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</h3 align='center'>YOUR CAR DETAILS SUCCESSFULY UPLOADED ON BUY CAR PAGE");

                    String value[]=request.getParameterValues("car");

        String SAVE_DIR="img";
        String appPath = request .getServletContext().getRealPath("");
        
        out.println( appPath );
        
        String savePath = appPath + File.separator + SAVE_DIR;
        
        File fileSaveDir = new File(savePath);
        
        if( !fileSaveDir.exists() )
        {
            fileSaveDir.mkdir();
        }
        
        System.out.println( savePath + File.separator + "sample.jpg" );
        
        File f = new File( savePath + File.separator + "sample.jpg" );
      
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        Part part = request.getPart("image");
        {
            
            String filename = "sample.jpg";
            
            byte b[] = new byte[part.getInputStream().available()];
            
            part.getInputStream().read(b);
            
            bos.write(b);
            
        }
        bos.close();
        fos.close();
        
//byte[] b = new byte[ part.getInputStream().available() ];
        
        //part.getInputStream();
        
        //System.out.println( b );

        
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
  "cloud_name", "dsxerntwp",
        "api_key","391371132939316",
                "api_secret","Q1WFEvhO3VooyGrRknrNceL9oY8" 
        ));
//        File toUpload = new FileInputStream( part.getInputStream() );
        Map uploadResult = cloudinary.uploader().upload( f , ObjectUtils.emptyMap());
        
        out.println("upload Result : " + uploadResult );
        
        System.out.println(uploadResult.get("secure_url"));
        
        



            for( int i = 0 ; i <  value.length ; i++ )
            {
                switch( i )
                {
                        
                    case 0: third1.setModel(value[i]); System.out.println( value[i] ); break;
                    case 1: third1.setVariant(value[i]);break;
                    case 2: third1.setRegistrationyear(value[i]);break;
                    case 3: third1.setColor(value[i]);break;
                    case 4: third1.setKilometerdrive(value[i]);break;
                    case 5: third1.setOwnership(value[i]);break;
                    case 6: third1.setCity(value[i]);break;
                    case 7: third1.setLocality(value[i]);break;
                    case 8: third1.setSellingprice(value[i]);break;
                    case 9: third1.setOwnername(value[i]);break;
                    case 10: third1.setEmail(value[i]);break;
                    case 11: third1.setMobileno(value[i]);break;
                }
                
                out.println("<h1>"+value[i]+"</h1>");
            }

        third1.setImage_path(uploadResult.get("secure_url").toString());

                thirdInterImpl impl =new thirdInterImpl();
                impl.userCarDta(third1);

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
//         String params [] = request.getParameterValues("products");
//        
//        for( String s : params )
//            System.out.println( s );




    
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
