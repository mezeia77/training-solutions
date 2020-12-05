package stringbuilder;

public class NameBuilder {

    public boolean isEmpty(String str){
        return (str == null || "".equalsIgnoreCase(str.trim()));
    }

    StringBuilder nameResult = new StringBuilder("");



    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){
        if (isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Family name & given name must be filled");
        }

        if (title!=null){
            nameResult.append(title.getTitleString()).append(" ").append(givenName).append(" ");
        } else {
            nameResult.append(givenName).append(" ");
        }

        if (middleName.isEmpty()!=true){
            nameResult.append(middleName).append(" ");
        }
        nameResult.append(familyName);

        return nameResult.toString();

    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){

        if (isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Family name & given name must be filled");
        }

        if (title!=null){
            nameResult.append(title.getTitleString()).append(" ").append(familyName).append(" ");
        } else {
            nameResult.append(familyName).append(" ");
        }

        if (middleName.isEmpty()!=true){
            nameResult.append(middleName).append(" ");
        }
        nameResult.append(givenName);

        return nameResult.toString();
    }

    public String insertTitle(String name, Title title, String where){

        StringBuilder stringBuilder = new StringBuilder(name);
        int i = stringBuilder.indexOf(where);
        stringBuilder.insert(i+1, title.getTitleString() + " ");
        return stringBuilder.toString();


    }

    public String deleteNamePart(String name, String delete){

        StringBuilder stringBuilder = new StringBuilder(name);
        int i = stringBuilder.indexOf(delete);
        stringBuilder.delete(i, i+delete.length());
        return stringBuilder.toString();

    }


}
