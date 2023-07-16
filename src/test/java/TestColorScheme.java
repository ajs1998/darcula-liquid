import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * This is just for me to visually test the color scheme while I edit it.
 */
public class TestColorScheme<Tasd> {

    private static final Logger log = LogManager.getLogger(TestColorScheme.class);

    private final Object param1;
    private final Integer param2 = 2109876543;
    private final boolean param3;

    /**
     * Javadocs!
     *
     * @param param1 foo
     * @param param2 bar
     * @param param3 baz
     */
    public TestColorScheme(Object param1, Tasd param2, boolean param3) {
        this.param1 = param1;
        this.param2 = param2; // A problem (and a comment)
        this.param3 = param3;
    }

    @Test
    void test() {
        log.info("Hello, here's a string\r\n\j");
    }

    // TODO: This is a todo
    public Integer doSomething() {
        return 1;
    }
}
