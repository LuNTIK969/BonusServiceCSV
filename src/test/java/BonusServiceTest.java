import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")

    public void BonusServiceTest(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}