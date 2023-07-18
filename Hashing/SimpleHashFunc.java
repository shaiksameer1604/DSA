public class SimpleHashFunc{
    public static int customHashFunction(String input){
        int hashcode=0;
        for(int i=0;i<input.length();i++){
            hashcode+=input.charAt(i);
        }
        return hashcode;
    }
    public static void main(String[] args){
        String name="Sameer";
        int hashcode=customHashFunction(name);
        System.out.println("Input:"+name);
        System.out.println("Hashcode:"+hashcode);
    }
}