
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public Boolean twoOccurrences(String stringa, String stringb){
        int firstIndex = stringb.indexOf(stringa);
        int secondIndex = stringb.indexOf(stringa, firstIndex + stringa.length());
        while (firstIndex != -1){
           if (secondIndex == -1){
               return false;
            }else{
                return true;
           }
        }
        return false;
   }
   public void testing(){
       String a = "an";
       String b= "banana";
       System.out.println("stringa is " + a);
       System.out.println("stringb is " + b);
       Boolean result = twoOccurrences(a, b);
       System.out.println("result is " + result);
       //
       a = "ana";
       b= "banana";
       System.out.println("stringa is " + a);
       System.out.println("stringb is " + b);
       result = twoOccurrences(a, b);
       System.out.println("result is " + result);
    }
    public String lastPart(String stringa, String stringb){
        int startIndex =  stringb.indexOf(stringa);
        if (startIndex != -1){
            return stringb.substring(startIndex + stringa.length(), stringb.length());
        }else{
            return stringb;
        }
    }
    public void testinglastPart(){
        String result = lastPart("an", "banana");
        System.out.println("The part of the string after an in banana is " + result);
        //
        result = lastPart("zoo", "forest");
        System.out.println("The part of the string after zoo in forest is " + result);
    }
}
