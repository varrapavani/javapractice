package com.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void literToGallon() {
        Volume volume = Volume.fromLiter(3.78);
        Volume gallon = Volume.fromGallon(1);

        assert(volume.compare(gallon));
    }
}