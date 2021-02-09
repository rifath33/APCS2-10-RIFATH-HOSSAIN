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
      
      return sqrtHelper(n/2, n);
      
    }
    
    public static double sqrtHelper(double guess, double target){
      
      if( 
        
        Math.abs(
        (double) ( ( Math.pow(guess,2) - target ) / target )
        )
        
        <= 0.001
   
        )
      return guess;
      else{
        return sqrtHelper( ((target/guess + guess) / 2), target);
      }


    }
    
    /*
    *@param length how long the words must be
    *param word the variable to store the partial solution (should start at "")
    *@return the number of words that have no adjacent matching letters using the letters a-z.
    *Repetition allowed except when letters are adjacent.
    */
    public static long countNoDoubleLetterWords(int length,String word){
      
      char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      
      int size = word.length();
      
      if(length == 0){
          return 0;
      }
      else{
          
          for(int i = 0; i < letters.length; i++){
            
              if(size==0 || word.charAt(size -1) != letters[i] ){
                  return 1 + countNoDoubleLetterWords(length-1, word);
              }
              
          }
         return countNoDoubleLetterWords(length-1, word); 
      }
        
      //Hint: not a wrapper method, but you must call it starting with "" as your word.
    }
    
    
    
}