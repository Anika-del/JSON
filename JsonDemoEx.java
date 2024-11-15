
import org.json.simple.JSONObject;
import java.io.*;

class JsonDemoEx
{
	
public static void main(String... s)throws Exception
{
	JSONObject obj=new JSONObject();
	obj.put("name","ram");
	obj.put("num",new Integer(100));
	obj.put("balance",new Double(100.21));
	obj.put("is_vip",new Boolean(true));
	
	StringWriter out=new StringWriter();
	obj.writeJSONString(out);
	
	String jsonText=out.toString();
	System.out.println(jsonText);
}
}

/*
E:\Advance_java\J2EE\JSON TYPE>javac JsonDemoEx.java
Note: JsonDemoEx.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\Advance_java\J2EE\JSON TYPE>java JsonDemoEx
{"balance":100.21,"is_vip":true,"num":100,"name":"ram"}
*/

