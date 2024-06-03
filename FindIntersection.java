/*Find Intersection
HIDE QUESTION
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: 
the first element will represent a list of comma-separated numbers sorted in ascending order, 
the second element will represent a second list of comma-separated numbers (also sorted). 
Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.
*/
import java.util.*; 
import java.io.*;

class FindIntersection {

  public static String FindIntersection(String[] strArr) {
    // code goes here
    String s = strArr[0];
    String k = strArr[1];
    int[] arr1 = Arrays.stream(s.split(","))
                       .map(String::trim)
                       .mapToInt(Integer::parseInt)
                       .toArray();
    int []arr2 = Arrays.stream(k.split(","))
                       .map(String::trim)
                       .mapToInt(Integer::parseInt)
                       .toArray();
    int n1=arr1.length;
    int n2 = arr2.length;
    int i=0,j=0;
    ArrayList<Integer> al = new ArrayList<>();
    while(i<n1 && j<n2){
      if(arr1[i]==arr2[j]){
        al.add(arr1[i]);
        i++;
        j++;
      }
      else if(arr1[i]<arr2[j]){
        i++;
      }
      else{
        j++;
      }
    }
    if(al.isEmpty()){
      return "false";
    }
     else{
        StringBuilder sb = new StringBuilder();
        for (int num : al) {
        sb.append(num).append(",");
       }
       sb.deleteCharAt(sb.length()-1);
      return sb.toString();
     }
     
     
  }
  

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
