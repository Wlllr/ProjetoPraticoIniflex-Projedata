import com.wllr.Funcionario;
import com.wllr.FuncionarioService;


public static void main(String[] args) {
    FuncionarioService service = new FuncionarioService();
    BigDecimal salarioMinimo = new BigDecimal("1212.00");

    // 3.1 e 3.3 - Carga de funcionarios respeitando o item 3.3
    List<Funcionario> lista = cargaFuncionarios();
    header("3.1 - Lista de funcionarios por ordem de inserçao:");
    service.imprimirLista(lista);

    // 3.2 - Remove o funcionario Joao da lista e imprime a lista atualizada
    service.removerJoao(lista);
    header("\n3.2 - Lista atualizada (Sem Joao):");
    service.imprimirLista(lista);

    // 3.4 - Lista de funcionarios com acrescimo de 10% do salario
    service.aplicarAumento(lista, new BigDecimal("0.10"));
    header("\n3.4 - Lista de funcionarios com salario acrescido em 10%: ");
    service.imprimirLista(lista);

    // 3.5 e 3.6 - Agrupa e imprime a lista de funcionaros por funcao
    header("\n3.5 e 3.6 - Imprime a lista de funcionarios por funcao:");
    Map<String, List<Funcionario>> agrupados = service.agruparPorFuncao(lista);
    agrupados.forEach((funcao, funcList) -> {
        System.out.println("\nFunção - " + funcao + " : ");
        service.imprimirLista(funcList);
    });
    formatadorEspaco();

    // 3.8 - Imprime os aniversariantes dos meses 10 e 12
    header("\n3.8 - Aniversariantes de Outubro (10) e Dezembro (12):");
    service.imprimirAniversariantesMes10e12(lista);


    // 3.9 - Imprime o funcionario com maior senioridade da empresa ;)
    header("\n3.9 - Funcionário com a maior idade:");
    service.imprimirMaisVelho(lista);


    // 3.10 - Imprime a lista de funcionarios em ordem alfabetica
    header("\n3.10 - Lista em ordem alfabética:");
    service.imprimirOrdemAlfabetica(lista);


    // 3.11 - imprime o somatorio total dos funcionarios
    header("\n3.11 - Total de Salários:");
    service.imprimirTotalSalarios(lista);


    // 3.12 - Salários mínimos
    header("3.12 - Quantidade de salários mínimos por funcionário:");
    service.imprimirQtdSalariosMinimos(lista, salarioMinimo);
}

// Funcao criada para colocar headers com titulos personalizados para cada uma da funcionalidades
private static void header(String textoParaHeader) {
    System.out.println(textoParaHeader);
}

// Carga de funcionarios fornecido para o projeto
private static List<Funcionario> cargaFuncionarios() {
    List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(
            new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"),
            new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"),
            new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"),
            new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"),
            new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"),
            new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"),
            new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"),
            new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"),
            new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"),
            new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente")
    ));
    return funcionarios;
}

