package com.br.service;

import com.br.domain.Worker;

public class WorkerService {
    public long validate(Worker worker) {
        if (worker.isHomeOffice()) {
            worker.setSalary(worker.getSalary() + worker.getSalary() / 2);
            return worker.getSalary();
        }
        return worker.getSalary();
    }
}
