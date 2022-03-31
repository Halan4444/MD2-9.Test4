import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void phanLoaiTamGiac() {
        String check = Triangle.phanLoaiTamGiac(2,3,2);
        String expected = "tamgiaccan";
        assertEquals(expected,check);
    }
}