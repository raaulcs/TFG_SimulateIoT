package dashboard2;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;


@WebServlet("/TopicLecture")
public class TopicLecture extends HttpServlet {
	
	public static int getPortTopic(String topicname){
		BufferedReader reader;
		String topic="";
		boolean encontrado=false;
		int port=4000;
		
		try {
			reader = new BufferedReader(new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream("/topicports.txt"))));

			String line;
	    
			for (int i = 0; !encontrado && ((line = reader.readLine()) != null); i++)
			{
			  if(line.equals(topicname)) {
				  encontrado=true;
			  }
			  if(line.length()>2 && line.substring(0, 2).equals("40")) {
				  port = port + 1;
			  }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
	    return port;
	}
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h3>Hello World!</h3>");
        
		//logger.info("Atendiendo GET Bienvenida");
		System.out.println("Atendiendo get Bienvenida");
		HttpSession session = request.getSession();
		System.out.println("Session id: "+session.getId());
		
		System.out.println("*****"+getPortTopic(request.getParameter("top")));
	    URL urlForGetRequest = new URL("http://192.168.99.100:" + getPortTopic(request.getParameter("top")) + "/api/" + request.getParameter("top"));
	    String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
	    conection.setRequestMethod("GET");
	    conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
	    int responseCode = conection.getResponseCode();
	    Object obj = null;
	    JSONObject jsonobject = null;
        List<JSONObject> ldata = new ArrayList<JSONObject>();
        String result = "";
       
	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(conection.getInputStream()));
	        StringBuffer responsee = new StringBuffer();
	        
	        for (int i = 0; (readLine = in .readLine()) != null; i++) {
	        	//jsonobject = new JSONObject(readLine);
	    	    //ldata.add(jsonobject);
	            responsee.append(readLine);
	        } in .close();
	        // print result
	        result = responsee.toString();
	        result = result.substring(1, result.length()-1);
	        String[] ldatastring = result.split("},");
	        for (int i = 1; i < ldatastring.length; i++) {
	        	jsonobject = new JSONObject(ldatastring[i] + "}");
	        	ldata.add(jsonobject);
	        }
//	        ldata.get(0).get("value");
//	        System.out.println("JSON String Result " + ldata.size() + " " + ldata.get(0).getString("value").toString());
		    request.setAttribute("ldata", ldata);
		    request.setAttribute("size", ldata.size());
		    //ldata = (List<JSONObject>) request.getAttribute("ldata");
	//	    System.out.println(ldata.size());
	        //GetAndPost.POSTRequest(response.toString());

	    } else {
	        System.out.println("GET NOT WORKED");
	    }
				
		//logger.info("Session new? "+session.isNew());
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/topicLecture.jsp");
		view.forward(request,response);
    }
}
