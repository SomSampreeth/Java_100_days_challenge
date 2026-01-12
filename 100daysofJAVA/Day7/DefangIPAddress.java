// Day 7 - Defanging IP Address

package Day7;

public class DefangIPAddress {
    public static String defangIPaadr(String address){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    
    } 

    public static void main(String[] args){
        String address = "1.1.1.1";
        String result = defangIPaadr(address);
        System.out.println(result);
   }
}


