import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleRead
{
     public static void main(String... s)
	 {
		 JSONParser p=new JSONParser();
	 try{
		 
		 Object obj=p.parse(new FileReader("D:\\JSON\\file123.json"));
		 JSONObject jsonObject=(JSONObject)obj;
		 
		 String name=(String) jsonObject.get("name");
		 System.out.println(name);
		 
		 long age=(Long) jsonObject.get("age");
		 System.out.println(age);
		 
		 JSONArray msg=(JSONArray)jsonObject.get("message");
		 Iterator<String> iterator=msg.iterator();
		 while(iterator.hasNext())
		 {
			 System.out.println(iterator.next());
		 }
	 }
	 catch(FileNotFoundException e)
	 {
		 e.printStackTrace();
	 }catch(IOException e)
	 {
		 e.printStackTrace();
	 }catch(ParseException e)
	 {
		 e.printStackTrace();
	 }
   }
}

/*
E:\Advance_java\J2EE\JSON_TYPE>javac JsonSimpleRead.java
Note: JsonSimpleRead.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\Advance_java\J2EE\JSON_TYPE>java JsonSimpleRead
ram
10
msg1
msg2
msg3
*/	 