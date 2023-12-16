package com.br.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WorkerTest {

    Worker worker1;

    Worker worker2;

    @BeforeEach
    void setup() {
        worker1 = new Worker("Worker1", 1000, "work1@email.com", false);
        worker2 = new Worker();
    }

    @Test
    @DisplayName("should return new salary worker")
    void validate_NewSalaryWithBonus(){
        int bonusFebruary = 350;
        assertEquals(1350,worker1.promotion(bonusFebruary));
    }
}
