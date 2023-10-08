class SearchInRange {
  public static void main (String [] args) {

    int [] arr = {1,11,5,9,10} ; 
    int target = 1 ; 

    boolean ans = searchInRange(arr , target , 1 , 4) ; 
    System.out.println(ans) ; 
  }

  static boolean searchInRange(int [] arr , int target , int start , int end ) {

    if (arr.length == 0) {
      return false ; 
    }

    for (int i = start ; i <= end ; i++) {
      int element = arr[i] ; 

      if (element == target) {
        return true ; 
      }
    }

    return false ; 
  }
}