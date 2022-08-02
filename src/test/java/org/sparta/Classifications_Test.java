package org.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classifications_Test {

    @Test
    @DisplayName("Given the ageOfViewer is 15, return U, PG, 12 & 15 films are available")
    void givenTheAgeOfViewerIs15() {
        Assertions.assertEquals("U, PG, 12 & 15 films are available", FilmClassifications.availableClassifications(15));
    }

    @Test
    @DisplayName("Given the ageOfViewer is 12, return U, PG, 12 & 15 films are available")
    void givenTheAgeOfViewerIs12() {
        Assertions.assertEquals("U, PG, 12 films are available.", FilmClassifications.availableClassifications(12));
    }
}
