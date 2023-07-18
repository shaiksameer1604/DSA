import java.util.HashMap;
import java.util.Map;
public class inbuildHashMethod {
    public static void main(String[] args){
        Map<Integer, String> dataMap = new HashMap<>();

        String name = "Sameer";
        int hashCode = name.hashCode();

        // Key => hashCode
        dataMap.put(hashCode, name);
        String outputName = dataMap.get(hashCode);  
        System.out.println("Name:" +name+ "\nHashcode:" +hashCode); 
        System.out.println("Name: " + outputName);
    }
}
