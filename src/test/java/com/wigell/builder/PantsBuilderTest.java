package com.wigell.builder;

import com.wigell.BusinessObjects.Pants;
import org.junit.jupiter.api.Test;

import java.beans.PropertyChangeListener;

import static org.junit.jupiter.api.Assertions.*;

class PantsBuilderTest {

    @Test
    void testFullBuild() {
        Pants pants = new PantsBuilder()
                .addId(1)
                .addName("Jeans")
                .addSize("Medium")
                .addPrice(599)
                .addMaterial("Cotton")
                .addColor("Blue")
                .addFit("Slim")
                .addLenght("Long")
                .build();

        assertNotNull(pants);
        assertEquals(1, pants.getId());
        assertEquals("Jeans", pants.getName());
        assertEquals("Medium", pants.getSize());
        assertEquals(599, pants.getPrice());
        assertEquals("Cotton", pants.getMaterial());
        assertEquals("Blue", pants.getColor());
        assertEquals("Slim", pants.getFit());
        assertEquals("Long", pants.getLenght());
    }

    @Test
    void testMissingSizeThrowsException() {
        PantsBuilder builder = new PantsBuilder()
                .addId(1)
                .addName("Jeans")
                .addPrice(599)
                .addMaterial("Denim")
                .addColor("Blue")
                .addFit("Slim")
                .addLenght("Long");

        Exception exception = assertThrows(RuntimeException.class, builder::build);
        assertEquals("Size missing", exception.getMessage());
    }

    @Test
    void testMissingMaterialThrowsException() {
        PantsBuilder builder = new PantsBuilder()
                .addId(1)
                .addName("Jeans")
                .addSize("M")
                .addPrice(599)
                .addColor("Blue")
                .addFit("Slim")
                .addLenght("Long");

        Exception exception = assertThrows(RuntimeException.class, builder::build);
        assertEquals("Material missing", exception.getMessage());
    }

    @Test
    void testMissingColorThrowsException() {
        PantsBuilder builder = new PantsBuilder()
                .addId(1)
                .addName("Jeans")
                .addSize("Medium")
                .addPrice(599)
                .addMaterial("Linen")
                .addFit("Slim")
                .addLenght("Long");

        Exception exception = assertThrows(RuntimeException.class, builder::build);
        assertEquals("Color missing", exception.getMessage());
    }
}