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
      
      return sqrtHelper(n/2);
      
    }
    
    public static double sqrtHelper(double guess){
      
      if( 
        
        ( (Math.round( Math.pow(guess,2) * 100,000 ) ) / 100,000 ) // roundedGuess
        == 
        ( (Math.round( Math.pow(n) * 100,000 ) ) / 100,000 ) //roundedN
        
        )
      return guess;
      


    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*     public static void countNoDoubleLetterWords(int length, char[] letters){

    char[] characters = {};
    print countNoDoubleLetterWords(length,"", characters);

    } */
    
    
    
}