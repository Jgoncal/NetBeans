/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.*; 
import java.util.*; 
import java.io.*; 
public class EchoRequest extends GenericServlet 
{ 
   public String getServletInfo()
   { return "Echo Request Servlet";}
public void service(ServletRequest peticion, ServletResponse respuesta) throws ServletException, IOException { 
respuesta.setContentType("text/plain"); 
PrintStream outputStream = new PrintStream(respuesta.getOutputStream()); 
outputStream.print("Servidor: " + peticion.getServerName() + ":"); 
outputStream.println (peticion.getServerPort()); 
outputStream.print("Cliente: " + peticion.getRemoteHost() + " "); 
outputStream.println(peticion.getRemoteAddr()); 
outputStream.println("Protocolo: " + peticion.getProtocol()); 
Enumeration params = peticion.getParameterNames(); 
 if (params !=null){
while (params.hasMoreElements()) { 
String parametro = (String) params.nextElement(); 
String valor = peticion.getParameter(parametro); 
outputStream.println(parametro + " = " + valor); 
     }
   }
  }
}
