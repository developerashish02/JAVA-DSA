class Main {
  public static void main(String[] args) {
    int [] arr = {1,2,4,5,6,11,-1} ; 
    int target = 2 ; 

    int ans = linearSearch2(arr , target) ; 

    System.out.println(ans); 
  }

  static int linearSearch(int [] arr , int target) {
    // check arr is empty 
    if (arr.length == 0) {
      return -1 ; 
    }

    for (int i = 0 ; i < arr.length ; i++) {
      int element = arr[i] ; 
      // findout the target now return the index 
      if (element == target) {
        return i ; 
      }
    }

    // this line is executed when the target element is not found 

    return -1 ; 
    
  }


  // now return the element it self 

    static int linearSearch2(int [] arr , int target) {
    // check arr is empty 
    if (arr.length == 0) {
      return -111111111 ; 
    }

    for (int i = 0 ; i < arr.length ; i++) {
      int element = arr[i] ; 
      // findout the target now return the index 
      if (element == target) {
        return element ; 
      }
    }

    // this line is executed when the target element is not found 

    return -111111111 ; 
    
  }

      static int linearSearch2(int [] arr , int target) {
    // check arr is empty 
    if (arr.length == 0) {
      return -111111111 ; 
    }

    for (int i = 0 ; i < arr.length ; i++) {
      int element = arr[i] ; 
      // findout the target now return the index 
      if (element == target) {
        return element ; 
      }
    }

    // this line is executed when the target element is not found 

    return -111111111 ; 
    
  }
}