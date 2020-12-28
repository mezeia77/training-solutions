package introexception;

public class SsnValidator {

    public static boolean isValidSsn(String ssn){

        int a1 = ssn.charAt(0)-'0';
        int a2 = ssn.charAt(1)-'0';
        int a3 = ssn.charAt(2)-'0';
        int a4 = ssn.charAt(3)-'0';
        int a5 = ssn.charAt(4)-'0';
        int a6 = ssn.charAt(5)-'0';
        int a7 = ssn.charAt(6)-'0';
        int a8 = ssn.charAt(7)-'0';
        int a9 = ssn.charAt(8)-'0';

        int sum = (a1+a3+a5+a7)*3+(a2+a4+a6+a8)*7;
        return sum%10==a9;
    }

    public static void main(String[] args) {
        System.out.println(SsnValidator.isValidSsn("123456788"));
        System.out.println(SsnValidator.isValidSsn("123456789"));
    }

}
