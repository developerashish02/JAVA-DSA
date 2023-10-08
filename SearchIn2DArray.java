  class SearchIn2DArray {
  public static void main (String [] args) {
    int [][] arr = {
      {1,2,4,8} ,
      {2,6,7,11} ,
      {19,23,44,66}
    } ; 

    int target = 44 ; 

   int [] ans =  searchIn2DArray(arr , target) ;
    System.out.println(Arrays.toString(ans)) ; 
  }

  // search In 2D Array 

  static int [] searchIn2DArray (int [][] arr, int target)   {

     for (int row = 0 ; row < arr.length ; row++) {
       for (int col = 0 ; col < arr[row].length ; col++) {
         if (arr[row][col] == target) {
           return new int [] {row , col} ; 
         }
       }
     }

    return new int [] {-1,-1} ; 
    
  }
  
}