class hw2 {
  public static void main(String[] args) {
    /*PART II:

(1) Define a method named m1 that  receives an array of integers and returns the sum of all those elements in the array whose value exceeds their index and is a multiple of 9.
      */
    int[] arr = {1,9,18,20,5,6,7,8,9,81};
    System.out.println(m1(arr));
    System.out.println(1%9);
  }
  public static int m1(int[] arr){
    int sum=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i] > i && arr[i]%9==0)
        sum += arr[i];
    }
    return sum;
  }
}

