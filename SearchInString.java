class SearchInString {
  public static void main (String [] args) {
    String name = "Ashish" ; 
    char target = 'o' ; 

   boolean ans =  searchInString(name , target) ; 
   System.out.println(ans + "Hello bachho") ; 
  }

  // finding the character is present in string or not 
  static boolean searchInString (String name , char target) {
    System.out.println(name) ; 
    if (name.length() == 0) {
      return false ; 
    } 

    for (int i = 0 ; i < name.length() ; i++) {
      char ch = name.charAt(i) ; 
      System.out.println(ch) ; 
      if (ch == target) {
        return true ; 
      }
    }
  // this line is exicuted means we dont have the char present 
  return false ; 
  }

}