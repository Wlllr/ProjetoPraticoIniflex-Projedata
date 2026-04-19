classDiagram
    class Pessoa {
        -String nome
        -LocalDate dataNascimento
        +getNome() String
        +getDataNascimento() LocalDate
    }

    class Funcionario {
        -BigDecimal salario
        -String funcao
        +getSalario() BigDecimal
        +setSalario(BigDecimal) void
        +getFuncao() String
        +toString() String
    }

    Pessoa <|-- Funcionario : Herança
