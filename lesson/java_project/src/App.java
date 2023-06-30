import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App {
    public static void main(String[] args) throws Exception {
        
        JSONObject jsonFile = new JSONObject();
        JSONObject jsonAddress = new JSONObject();
        jsonAddress.put("coutry", "Rus");
        jsonAddress.put("city", "Moskow");


        jsonFile.put("name", "Vlad");
        jsonFile.put("age", 12);
        jsonFile.put("address", jsonAddress);
        System.out.println(jsonFile.toJSONString());
        
        System.out.println(jsonFile.get("name"));
        JSONArray ar = new JSONArray();
        ar.add("Home");
        ar.add("Car");       
        ar.add(1234);       


        jsonFile.put("item", ar);

        System.out.println(jsonFile.toJSONString());
        // JSONArray ja = jsonFile.get("item");
        // System.out.println(jsonFile.get("item"));

        // System.out.println(ja.get(0));

        String json = "{paramsArray: [\"first\" 100]," 
                + "paramsObj: {\"one\" \"two\", \"three\" \"four\"}," 
                + "paramsStr: \"some string\"}"; 
        JSONParser parser = new JSONParser();
        Object qs = (JSONObject)parser.parse(json);
        JSONObject ps = (JSONObject) qs;
        System.out.println(ps.get("paramsStr").toString());

        JSONObject jb = (JSONObject)ps.get("paramsObj");
        System.out.println(jb.get("three").toString());

        JSONArray ja = (JSONArray)ps.get("paramsArray");
        System.out.println(ja.get(1).toString());



    }   
}
