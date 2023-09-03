import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    public static void main(String[] args){
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "One");
//        map.put(2, "Two");
//        This will override the previous value of key "1"
//        map.put(1, "Three");

//        String[] array = new String[2];
//        array[0] = "One";

//        int[] letterFrequency = new int[26];
//        char letter ='h';
//        int index = letter - 'a'; //8
//        ccsdz
//        System.out.println('c' - 'a');
//        letterFrequency[index]++;

//        System.out.println(map.get(1));
//        System.out.println(map.get(2));
//        It will print null for the key "3" doesn't exist
//        System.out.println(map.get(3));

        String input = "mznadhgftrujdhs33fdsryhabsbvs5wfwdgdsjfdsfflajjwj";
        Map<Character, Integer> letterCount= countLetters(input);
        System.out.println(letterCount);


    }

    public static Map<Character, Integer> countLetters(String input){
        Map<Character, Integer> result = new HashMap<>();
        for(int i=0; i < input.length(); i++){
            char letter = input.charAt(i);
            if(result.containsKey(letter)){
                int oldValue = result.get(letter);
                result.put(letter, oldValue +1);
            } else {
                result.put(letter, 1);
            }
        }
        return result;
    }

}
