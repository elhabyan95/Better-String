package lambdatest;

import java.util.function.BiPredicate;

public class Lambda {

    public static void main(String[] args) {
       
        //First way  
        Inter i1 = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        };
        System.out.println(i1.betterString("sherif", "mamdouh"));

        //Second way
        BiPredicate<String, String> i2 = (s3, s4) -> {
            if (s3.length() > s4.length()) {
                return true;
            } 
            else {
                return false;
            }
        };
        System.out.println(i2.test("bigger", "small"));
        
        
        
        //Third way 
        
        StringTest test1 = new StringTest();
        String str1 = "first";
        String str2 = "second";
        System.out.println(test1.betterString(str1, str2,(string1,string2)->str1.length()>str2.length()));
    }

}
