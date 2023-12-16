package com.br.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Worker {
    private String name;
    private long salary;
    private String email;
    private boolean isHomeOffice;
}
