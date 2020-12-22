package controlselection.accents;

public class WithoutAccents {

    private String accentedChars ="áéíóöőüű";

    public char withoutAccent(char c){
        if (accentedChars.indexOf(c)>=0){
            switch (c){
                case 'á':
                    return 'a';
                case 'é':
                    return 'e';
                case 'í':
                    return 'i';
                case 'ó':
                case 'ö':
                case 'ő':
                    return 'o';
                case 'ú':
                case 'ü':
                case 'ű':
                    return 'u';
            }
        } return c;
    }

}
