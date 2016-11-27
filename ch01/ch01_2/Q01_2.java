// # Check Permutation
// Given two strings, write a method to decide if one is a permutation of the other.

// Hints: #1, #83, #121, #130
import java.util.*;
import java.lang.*;
class Main {
    public static boolean isPermutation(String s1, String s2){
	HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
	for(char ch : s1.toCharArray()) {
	    if(!mp.containsKey(ch)) {
		mp.put(ch, 1);
	    } else {
		mp.put(ch, mp.get(ch)+1); 
	    }
	}
	for(char ch : s2.toCharArray()) {
	    if(mp.containsKey(ch)) {
		mp.put(ch, mp.get(ch)-1);
		if (mp.get(ch) == 0){
		    mp.remove(ch);
		}
	    } else{
		return false;
	    }
	}
	if (mp.isEmpty()) {
	    return true; 
	} else {
	    return false;
	}
    }
    public static void main(String[] args) {
	System.out.println(isPermutation("", ""));
	System.out.println(isPermutation("aba", "bab"));
	System.out.println(isPermutation("abf", "fab"));
	System.out.println(isPermutation("asfdewf", "wefdsaf"));
    }
}