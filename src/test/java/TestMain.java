import com.example.demo1.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    @Test
    public void testGreetings() {
        String expected = "hello sergei";
        String actual = Main.greetings("sergei");

        assertEquals(expected, actual);
    }
}
