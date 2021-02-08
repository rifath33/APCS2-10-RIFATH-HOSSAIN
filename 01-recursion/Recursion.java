public class Recursion{
    
    /*
    *@param s any string
    *@return a string that is the reversed version of s, do NOT use built in methods to do so,
      use recursion.
    */
    public static String reverse(String s){
        
        if(s.length() <= 1)
        return s;
        else{
            
            return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
            
        }
        
    }
    
    
    /*
    *@param n any non-negative value you want to take the sqrt of
    *@return the approximate sqrt of n within a tolerance of 0.001%
    */
    public static double sqrt(double n){
      //Hint: This is a wrapper method.
      
      return n;
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*     public static void countNoDoubleLetterWords(int length, char[] letters){

    char[] characters = {};
    print countNoDoubleLetterWords(length,"", characters);

    } */
    
    
    
}