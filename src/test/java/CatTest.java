import atos.cat.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    public void test_getName(){
        Cat testCat = new Cat();
        testCat.setName("Officer Tiddles");
        assertEquals("Officer Tiddles",testCat.getName(),"The names of the cat were not as expected");
    }

}
