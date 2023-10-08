class FindMin {
  public static void main (String [] args) {
    int [] arr = {-2,11,8,4,9} ; 

    int ans = findMin(arr) ; 
    System.out.println(ans) ; 
  }

  // finding the minimum element in the array 

  // assume array in not empty 
  static int findMin(int [] arr) {
    int minEl = arr[0] ; 

    for (int i = 1 ; i < arr.length ; i++) {
      // checking current element is min then minEl 
      if (arr[i] < minEl) {
        minEl = arr[i] ; 
      }
    }

    return minEl ; 
  }
}