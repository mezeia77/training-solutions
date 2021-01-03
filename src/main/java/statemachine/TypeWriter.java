package statemachine;

public enum TypeWriter {

    UPPERCASE{
        TypeWriter next(){
            return TypeWriter.LOWERCASE;
        }
    },
    LOWERCASE{
        TypeWriter next(){
            return TypeWriter.UPPERCASE;
        }
    };

    abstract TypeWriter next();

}
