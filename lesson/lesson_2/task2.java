package lesson_2;
import org.json.simple.JSONObject;
class Main {
  public static void main(String[] args) {

    JSONObject jsonFIle = new JSONObject();
    jsonFIle.put("name","Vlad");
    jsonFIle.put("age",1245);
    jsonFIle.put("city","Moscow");
    System.out.println(jsonFIle.toString());
    
    System.out.println(jsonFIle.get("name"));

    
  }
}