package com.wllr;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class FuncionarioService {

    public void imprimirLista(List<Funcionario> funcionarios) {
        funcionarios.forEach(System.out::println);
    }

    public void removerJoao(List<Funcionario> funcionarios) {
        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase("João"));
    }

    public void aplicarAumento(List<Funcionario> funcionarios, BigDecimal percentual) {
        BigDecimal fator = BigDecimal.ONE.add(percentual);
        funcionarios.forEach(f -> f.setSalario(f.getSalario().multiply(fator)));
    }

    public Map<String, List<Funcionario>> agruparPorFuncao(List<Funcionario> funcionarios) {
        return funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getFuncao));
    }

    public void imprimirAniversariantesMes10e12(List<Funcionario> funcionarios) {
        funcionarios.stream()
                .filter(f -> f.getDataNascimento().getMonthValue() == 10 || f.getDataNascimento().getMonthValue() == 12)
                .forEach(System.out::println);
    }

    public void imprimirMaisVelho(List<Funcionario> funcionarios) {
        Funcionario maisVelho = Collections.min(funcionarios, Comparator.comparing(Funcionario::getDataNascimento));
        long idade = Period.between(maisVelho.getDataNascimento(), LocalDate.now()).getYears();
        System.out.println("Nome: " + maisVelho.getNome() + " | Idade: " + idade);
    }

    public void imprimirOrdemAlfabetica(List<Funcionario> funcionarios) {
        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                .forEach(System.out::println);
    }

    public void imprimirTotalSalarios(List<Funcionario> funcionarios) {
        BigDecimal total = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total dos salários: R$ " + total.setScale(2, RoundingMode.HALF_UP));
    }

    public void imprimirQtdSalariosMinimos(List<Funcionario> funcionarios, BigDecimal valorMinimo) {
        funcionarios.forEach(f -> {
            BigDecimal qtd = f.getSalario().divide(valorMinimo, 2, RoundingMode.HALF_UP);
            System.out.println(f.getNome() + " ganha " + qtd + " salários mínimos.");
        });
    }
}
