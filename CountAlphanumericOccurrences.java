import java.util.*;
/* counts occurrences of alphanumerics in a string
 * outputted in the following order:
 * numerics < uppercase < lowercase
 * through comparing against fixed arrays
 */
public class CountAlphanumericOccurrences{

  public static void count(String line){
    char nums[]={'0','1','2','3','4','5','6','7','8','9'};
    char charsUpper[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
                       'S','T','U','V','W','X','Y','Z'};
    char charsLower[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
                       's','t','u','v','w','x','y','z'};

    System.out.println("The string \""+line+"\" has the following occurrences:");
    System.out.println("Numerics:   "+compare(line,nums));
    System.out.println("Upper case: "+compare(line,charsUpper));
    System.out.println("Lower case: "+compare(line,charsLower)+"\n\n");
  }

  public static String compare(String line,char[] chars){
    int count=0;
    Character c;
    String result="";

    for(int i=0;i<chars.length;i++){
      for(int j=0;j<line.length();j++){
        c=line.charAt(j);
        if(c.equals(chars[i])){
          count++;
        }
      }
      if(count!=0){
        result+=" "+chars[i]+": "+count+",";
      }
      count=0;
    }

    if(result!=""){
      return result.substring(1,result.length()-1);
    }
    return result;
  }

  public static void main(String args[]){
    //output:
    //Numerics:   0: 2, 1: 1
    //Upper case: I: 1
    //Lower case: a: 2, c: 1, e: 1, h: 1, s: 1, t: 1, v: 1
    count("I have 100 cats");

    //output:
    //Numerics:   0: 1, 5: 1
    //Upper case: none
    //Lower case: g: 1, k: 1
    count("50kg");

    //output:
    //Numerics:   1: 1, 9: 1
    //Upper case: A: 1, Z: 1
    //Lower case: a: 1, z: 1
    count("9ZaAz1");
  }

}
