import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorTest {

    @BeforeEach
    void setUp() {
    }

 @Test
    void rps() {
        //assign
        String expectedResult = "TIE";
        //act
        String actionResult = RockPaperScissor.rps("rock", "rock");
        //assert
        assertEquals(expectedResult, actionResult);
    }
}