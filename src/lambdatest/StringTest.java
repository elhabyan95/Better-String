
package lambdatest;
import java.util.function.BiPredicate;
public class StringTest {
    
    public String betterString(String s1 , String s2, BiPredicate <String , String> predicate){
        
       if (predicate.test(s1, s2)){return s1;}
       else return s2;
    
    }
  
}
