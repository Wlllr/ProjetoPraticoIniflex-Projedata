package com.wllr;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario(
                "Weller",
                LocalDate.of(1998, 7, 5),
                new BigDecimal("1645.00"),
                "Auxiliar de Ti"
        );

        System.out.println(novoFuncionario);
    }
}
