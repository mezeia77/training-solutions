package stringbuilder;

public class Palindrome {



    public boolean isPalindrome (String text){

        StringBuilder sb = new StringBuilder(text);

        if (isEmpty(text)){
           throw new IllegalArgumentException("Must not be empty");
       }
       text = text.trim();


       return text.equalsIgnoreCase(sb.reverse().toString());
    }

    public boolean isEmpty (String str){
        return (str == null || "".equalsIgnoreCase(str.trim()));
    }

}
