/*Codeland Username Validation
HIDE QUESTION
Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules:

1. The username is between 4 and 25 characters.
2. It must start with a letter.
3. It can only contain letters, numbers, and the underscore character.
4. It cannot end with an underscore character.

If the username is valid then your program should return the string true, otherwise return the string false*/
import java.util.*; 
import java.io.*;

class ValidUserName {

  public static String CodelandUsernameValidation(String str) {
    int n = str.length();
    if(n<4 || n>25 ){
      return "false";
    }
    if(str.charAt(n-1)=='_'){
      return "false";
    }
    if(!Character.isLetter(str.charAt(0))){
      return "false";
    }
    for(int i=0;i<n;i++){
       char c = str.charAt(i);
       if(!Character.isLetterOrDigit(c) && c!='_'){
         return "false";
       }
    }
    return "true";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}
