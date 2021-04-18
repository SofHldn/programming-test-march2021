package se.iths.expleotests.problemone;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    void testAnagramDetector() {
        Anagram anagram = new Anagram();
        assertTrue(anagram.detectAnagram("MaRy", "army"));
        assertEquals(false, anagram.detectAnagram("Mary", "armys"));
    }


}
