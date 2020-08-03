import java.util.*;

public class SingleOccurrences{

  public static void findSingle(int[] list){
    ArrayList<Integer> singles=new ArrayList<Integer>();
    HashSet<Integer> set=new HashSet<Integer>();
    Arrays.sort(list);

    for(int i=0;i<list.length;i+=2){
      if(i==list.length-1){
        singles.add(list[i]);
      } else if(list[i+1]!=list[i]){
        singles.add(list[i]);
      }
    }

    System.out.println("Single numbers are: "+singles+"\n");
  }

  public static void main(String[] args) {
    //output:
    //Single numbers are: [10]
    findSingle(new int[]{2,2,10,5,4,6,7,5,8,8,6,4,7});

    //output:
    //Single numbers are: [8, 9, 12]
    findSingle(new int[]{5,3,2,2,3,5,4,6,9,6,4,12,8,9,12});
  }

}
