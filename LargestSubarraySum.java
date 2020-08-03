public class LargestSubarraySum {

  public static void maxSubarraySum(int a[]){
    int max=Integer.MIN_VALUE;
    int sub=0;

    for(int i=0;i<a.length;i++){
      sub+=a[i];
      if(sub>max){
        max=sub;
      }
      if(sub<0){
        sub=0;
      }
    }

    System.out.println("Max sum of a subarray: "+max+"\n");
  }

  public static void main(String[] args) {

    //output:
    //Max sum of a subarray is: 12
    maxSubarraySum(new int[]{4,-3,2,8,-9,10});

    //output:
    //Max sum of a subarray is: 20
    maxSubarraySum(new int[]{-1,-5,20});

    //output:
    //Max sum of a subarray is: -1
    maxSubarraySum(new int[]{-5,-1});

  }
}
