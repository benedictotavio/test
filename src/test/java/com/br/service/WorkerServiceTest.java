package com.br.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.br.domain.Worker;

public class WorkerServiceTest {

    private WorkerService workerService = new WorkerService();

    private Worker jean;
    private Worker mason;

    @BeforeEach
    public void setup() {
        mason = new Worker("Mason Parker", 2000, "mason.parker@email.com.br", false);
        jean = new Worker("Jean Paul", 3600, "jean_paul@email.com.br", true);
    }

    @Test
    @DisplayName("Should return salary value for humo office")
    void validate_ReturnSalaryForHomeOffice() {
        long salary = 500;
        Assertions.assertTrue(workerService.validate(jean) > salary);
    }

    @Test
    @DisplayName("Should return salary")
    void validate_ReturnSalary() {
        Assertions.assertEquals(mason.getSalary(),2000);
    }
}
