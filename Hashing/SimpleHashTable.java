import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class SimpleHashTable {
    public static void main(String[] args){
        Map<Integer,String> studentData=new Hashtable<>();
        studentData.put(1,"Sameer");
        studentData.put(2,"Samad");
        studentData.put(3,"Shahid");
        studentData.put(4,"Touhid");
        studentData.put(5,"Tameem");
        int searchIndex;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index:");
        searchIndex=sc.nextInt();
        String outputName = studentData.get(searchIndex);
        System.out.println(outputName);
        sc.close();
    }
}
