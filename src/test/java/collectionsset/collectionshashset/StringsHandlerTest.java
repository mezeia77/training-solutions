package collectionsset.collectionshashset;

import collectionsset.RandomStringGenerator;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StringsHandlerTest {

    @Test
    public void checkNumberOfElementsInSet() {
        Collection<String> testCollection = new RandomStringGenerator().createStrings(4, 500_000);
        Set<String> strings = new StringsHandler().filterUniqueStrings(testCollection);
        assertTrue(strings.size() < testCollection.size());
    }

    @Test
    public void checkNumberOfIdenticalElementsInSets() {
        Set<String> strings = new HashSet<>(new RandomStringGenerator().createStrings(4, 500_000));
        Set<String> anotherStrings = new HashSet<>(new RandomStringGenerator().createStrings(4, 500_000));
        int a = strings.size();
        int b = anotherStrings.size();

        strings = new StringsHandler().selectIdenticalStrings(strings, anotherStrings);

        assertTrue(strings.size() < a );
    }

}