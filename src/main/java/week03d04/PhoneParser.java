package week03d04;

public class PhoneParser {

    public Phone parse(String text){
      String prefix = text.substring(0, text.indexOf("-"));
      String number = text.substring(text.indexOf("-")+1);
      return new Phone(prefix, number);
    }

}
