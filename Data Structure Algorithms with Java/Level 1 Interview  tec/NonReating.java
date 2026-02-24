//  give a string find the first non repeating char in it if it is exist  retuen  -1;

import java.util.*;

public class NonReating {

    public static char firstnon(String str){
        HashMap<Character , Integer> map = new HashMap<>();

        // count the frequency of each char in the string
        for(char ch : str.toCharArray() ){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        // find the first non repeating char
        for( char ch : str.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }

        return '-';
    }
     public static void main(String[] args){

        System.out.println(firstnon("aabbccdeff"));
         System.out.println(firstnon("aabbcc"));

     }
}