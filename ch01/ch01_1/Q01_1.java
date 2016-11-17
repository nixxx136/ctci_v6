/**
 * 
 * @author Penghuan Ni
 */
public class IsUnique {
    
    /**
     * ch01.1 Is Unique: 
     * Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures.
     * @param str
     * @return if a string only have unique char or not
     */
    
    public static boolean isUniqueString(String str){
        Set strSet = new HashSet();
        for(int i=0; i<str.length(); i++){
            if(!strSet.contains(str.charAt(i))){
                strSet.add(str.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String test1 = "word";
        String test2 = "happy";
        
        System.out.println(isUniqueString(test1));
        System.out.println(isUniqueString(test2));
    }
}