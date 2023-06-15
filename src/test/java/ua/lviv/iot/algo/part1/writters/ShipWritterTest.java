package ua.lviv.iot.algo.part1.writters;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import ua.lviv.iot.algo.part1.AbstractTestUtils;
import ua.lviv.iot.algo.part1.models.Ship;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipWritterTest {
    private static final String EXPECTED_FILENAME = "expected.csv";
    private static final String RESULT_FILENAME = "result.csv";
    private List<Ship> ships;
    private ShipWriter writer;
    private File actualFile;
    private File expectedFile = new File(RESULT_FILENAME);

    @Test
    public void testWritter() {
        ShipWriter writer = new ShipWriter();
        List<Ship> testShips = AbstractTestUtils.getTestShips();
        actualFile = new File(RESULT_FILENAME);
        writer.writeToFile(testShips);
        assertEquals(expectedFile, actualFile);
    }
    void testWriteToFileWithEmptyList() throws IOException {



    }

    @Test

    public void testWriteListOfTransport() throws IOException {

        ShipWriter writer = new ShipWriter();
        writer.writeToFile(AbstractTestUtils.getTestShips());
        Path expected = new File(RESULT_FILENAME).toPath();

        Path actual = new File(EXPECTED_FILENAME).toPath();

        assertEquals(-1L, Files.mismatch(expected, actual));
    }
}
