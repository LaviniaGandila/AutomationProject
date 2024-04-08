package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void metodaTest() {
        Elev laura = new Elev("Laura", "Laura2");
        laura.prezentare();

        Elev marius = new Elev("Marius", "Marius 2");
        marius.prezentare();
    }
}
