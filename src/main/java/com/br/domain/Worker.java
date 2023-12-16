package com.br.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Worker {
    private String name;
    private int salary;
    private String email;
    private boolean isHomeOffice;

    int promotion(int bonus) {
        return salary + bonus;
    }
}
