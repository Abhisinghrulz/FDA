import org.json.JSONArray;
import org.json.JSONObject;

public class ABCD {
    public static void main(String[] args) {

        JSONObject main = new JSONObject();
        JSONArray restaurantArray = new JSONArray();

        JSONObject restaurant1 = new JSONObject();
        restaurant1.put("name","Agra");
        restaurant1.put("B","D");
        restaurantArray.put(restaurant1);

        JSONObject resat =new JSONObject();
        resat.put("name","Punjab");
        restaurantArray.put(resat);
/*




        JSONObject js2 = new JSONObject();
        js2.put("name","Delhi");
        js2.put("B","D");

        restaurantArray.put(js2);

*/
        main.put("Restaurant",restaurantArray);


        System.out.println(main.toString());
    }
}
