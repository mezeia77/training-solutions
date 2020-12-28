package introexception;

public class Patient {

    final int MIN_YEAR=1900;

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient (String name, String socialSecurityNumber, int yearOfBirth){
        if (name.isEmpty()){
            throw new IllegalArgumentException("Name is empty!");
        }

        if (yearOfBirth<=MIN_YEAR){
            throw new IllegalArgumentException(yearOfBirth + " is too old!");
        }


        if (socialSecurityNumber.length() != 9 || !SsnValidator.isValidSsn(socialSecurityNumber)) {
                throw new IllegalArgumentException(socialSecurityNumber + " not valid SSN number!");
        }



        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
