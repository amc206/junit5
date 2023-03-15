import names.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTests
{
    @Test
    public void constructorTest()
    {
        Person testMe = new Person("John", "Smith");

        assertAll(
                () -> assertEquals("John", testMe.getFirst()),
                () -> assertEquals("Smith", testMe.getLast()),
                () -> assertNull(testMe.getTitle()),
                () -> assertSame('\u0000', testMe.getMiddle())
        );
    }
}
