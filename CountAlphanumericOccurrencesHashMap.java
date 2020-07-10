import java.util.*;
/* counts occurrences of alphanumerics in a string
 * outputted in the following order:
 * numerics < uppercase < lowercase
 * through the use of a HashMap
 */
public class CountAlphanumericOccurrencesHashMap{

  public static void count(String str){
    String s=str.replaceAll("[^a-zA-Z0-9]","");
    char[] chars=s.toCharArray();
    HashMap<Character,Integer> countOccurrences = new HashMap<Character,Integer>();

    for(int i=0;i<chars.length;i++){
        if(!countOccurrences.containsKey(chars[i])){
          countOccurrences.put(chars[i],1);
        }else{
          Integer value=countOccurrences.get(chars[i])+1;
          countOccurrences.put(chars[i],value);
        }
    }

    Set<Character> keys=countOccurrences.keySet();
    List<Character> sorted=new ArrayList<>(keys);
    Collections.sort(sorted);
    String result="";

    for(Character a:sorted){
      result+=" "+a+": "+countOccurrences.get(a)+",";
    }
    if(result!=""){
      result=result.substring(1,result.length()-1)+"\n";
    }

    System.out.println("The string \""+str+"\" has the following occurrences:\n"+result);
  }

  public static void main(String args[]){

    //output:
    //0: 2, 1: 1, I: 1, a: 2, c: 1, e: 1, h: 1, s: 1, t: 1, v: 1
    count("I have 100 cats");

    //output:
    //0: 1, 5: 1, g: 1, k: 1
    count("50kg");

    //output:
    //1: 1, 9: 1, A: 1, Z: 1, a: 1, z: 1
    count("9ZaAz1");
  }

}
