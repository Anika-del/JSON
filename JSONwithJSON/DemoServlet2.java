import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.ContainerFactory;

public class DemoServlet2 extends GenericServlet
{
    public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String path=req.getServletContext().getRealPath("/");
		String s=req.getParameter("data");
		//out.println(s);
		
		FileWriter fw=new FileWriter(path+"\\"+"file123.json");
		fw.write(s);
		fw.close();
		
	try{
		FileInputStream fr=new FileInputStream(path+"\\"+"file123.json");
		byte b[]=new byte[fr.available()];
		fr.read(b);
		String data=new String(b);
		  JSONParser parser=new JSONParser();
		  
		  Object obj=parser.parse(data);
		  JSONArray array=(JSONArray)obj;
		  
		  
		  Iterator<JSONObject> iterator=array.iterator();
		  while(iterator.hasNext())
		  {
			  //System.out.println(iterator.next());
			  JSONObject jo=(JSONObject)iterator.next();
			  Set s1=jo.entrySet();
			  Iterator i=s1.iterator();
			  while(i.hasNext())
			  {
				  Map.Entry e=(Map.Entry)i.next();
				  
				  out.println(e.getKey()+"="+e.getValue());
				  out.println("<br>");
			  }
			  out.println("<br>"+"next");
		  }
	}catch(Exception e)
	{
		System.out.println(e);
	}	
	out.println("</body></html>");
	}
}
