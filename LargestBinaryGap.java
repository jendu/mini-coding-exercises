import java.util.*;

public class LargestBinaryGap{

  public static void getLargestBinaryGap(int number) {
    String binary=Integer.toBinaryString(number);
    char[] num=binary.toCharArray();

    int longestGap=0;
    int gap=0;
    Character c;

    for(int i=0;i<num.length;i++){
      c=num[i];
      if(c.equals('0')){
        gap++;
      }
      if(gap>longestGap){
        longestGap=gap;
      }
      if(c.equals('1')){
        gap=0;
      }
    }
    System.out.printf("Decimal: %d\nBinary: %s\nLongest binary gap: %d\n\n",number,binary,longestGap);
  }

  public static void main(String args[]){

    //output:
    //Decimal: 20
    //Binary: 10100
    //Longest binary gap: 2
    getLargestBinaryGap(20);

    //output:
    //Decimal: 1082
    //Binary: 10000111010
    //Longest binary gap: 4
    getLargestBinaryGap(1082);

  }

}
