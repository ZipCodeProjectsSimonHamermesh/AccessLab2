/**
 * Created by simonhamermesh on 1/29/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class SpecWax {

    Wax wax = WaxManager.pickWax("firm", 32);

    @Test

    public void testWax_getColor(){

        assertTrue(wax.getColor() instanceof java.lang.String );
    }

}
