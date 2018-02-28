package teampalooza;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest {
    @Test
    public void aTest() {
        int i = 1;
        assertThat(i, is(1));
    }

}
