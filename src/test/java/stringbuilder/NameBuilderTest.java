package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NameBuilderTest {

    @Test
    public void westernStyleNameConcatenation() {

        assertEquals(new NameBuilder().concatNameWesternStyle("Smith", "G", "John", Title.MR), "Mr. John G Smith");
        assertEquals(new NameBuilder().concatNameWesternStyle("Smith", "G", "John", null),  "John G Smith");
        assertEquals(new NameBuilder().concatNameWesternStyle("Smith", "", "John", Title.MR),  "Mr. John Smith");
        assertEquals(new NameBuilder().concatNameWesternStyle("Smith", "", "John", Title.MR),  "Mr. John Smith");
    }

    @Test
    public void hungarianStyleNameConcatenation() {

        assertEquals(new NameBuilder().concatNameHungarianStyle("Smith", "G", "John", Title.MR),  "Mr. Smith G John");
        assertEquals(new NameBuilder().concatNameHungarianStyle("Smith", "G", "John", null),  "Smith G John");
        assertEquals(new NameBuilder().concatNameHungarianStyle("Smith", "", "John", Title.MR),  "Mr. Smith John");
        assertEquals(new NameBuilder().concatNameHungarianStyle("Smith", "", "John", Title.MR),  "Mr. Smith John");
    }

    @Test
    public void insertTitle() {
        //Given
        String name = "Dr. John G Smith";
        //Then
        assertEquals(new NameBuilder().insertTitle(name, Title.PROF, " "),  "Dr. Prof. John G Smith");
    }

    @Test
    public void deleteNamePart() {

        assertEquals(new NameBuilder().deleteNamePart("Dr. Prof. John G Smith", "Prof. "),  "Dr. John G Smith");
    }

}
