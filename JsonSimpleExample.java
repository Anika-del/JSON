import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleExample
{
     public static void main(String... s)
	 {
		 JSONObject obj=new JSONObject();
		 obj.put("name","ram");
		 obj.put("age",new Integer(10));
		 
		 JSONArray list=new JSONArray();
		 list.add("msg1");
		 list.add("msg2");
		 list.add("msg3");
		 
		 obj.put("message",list);
		 try{
			 FileWriter file=new FileWriter("E:\\Advance_java\\J2EE\\JSON_TYPE\\file123.json");
			 file.write(obj.toString());
			 file.flush();
			 file.close();
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println(obj);
	 }
}

/*
E:\Advance_java\J2EE\JSON_TYPE>java JsonSimpleExample
{"name":"ram","message":["msg1","msg2","msg3"],"age":10}
*/