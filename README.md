**Teste Prático: Gerenciamento de Funcionários (Indústria)** 🏭

Este projeto consiste em um sistema de gerenciamento de funcionários desenvolvido como parte de um processo seletivo para a vaga de Desenvolvedor Java Jr. O objetivo é demonstrar o domínio de conceitos fundamentais da Programação Orientada a Objetos (POO), manipulação de coleções de dados e boas práticas de desenvolvimento.
🛠️ Tecnologias Utilizadas

    Linguagem: Java 

    API de Datas: java.time (LocalDate)

    Cálculos Financeiros: java.math.BigDecimal

    Paradigma: Orientação a Objetos e Programação Funcional (Java Streams & Lambda)

    Arquitetura: Separação de responsabilidades (Model, Service e Main)

📐 **Modelagem e Arquitetura**

O projeto foi estruturado utilizando o princípio de Herança, onde a classe Funcionario estende a classe Pessoa, herdando atributos básicos e adicionando particularidades do contexto laboral (salário e função).
Diagrama de Classes

Para a visualização da estrutura, foi elaborado o seguinte diagrama UML (criado via draw.io):

<img width="201" height="494" alt="Diagrama de classes Teste Iniflex drawio" src="https://github.com/user-attachments/assets/95baf4bc-4f0c-4428-a56c-694bad06e0cf" />

    Nota: O diagrama detalha a visibilidade dos atributos (private) e métodos (public), além da relação de extensão entre as entidades.

🚀 **Funcionalidades Implementadas**

O sistema executa uma série de operações em conformidade com os requisitos do teste:

    Carga de Dados: Inserção automática da lista de funcionários.

    Remoção: Exclusão dinâmica de registros específicos.

    Formatação Customizada: Datas em padrão brasileiro (dd/MM/yyyy) e valores monetários com separadores de milhar e decimal.

    Aumento Salarial: Atualização em lote de 10% nos salários.

    Agrupamento: Organização de funcionários por cargo utilizando Map.

    Filtragem Temporal: Identificação de aniversariantes em meses específicos (Outubro e Dezembro).

    Cálculos de Idade: Identificação do funcionário mais velho e cálculo de idade em tempo real.

    Ordenação: Exibição da lista por ordem alfabética.

    Relatórios Financeiros: Somatório total da folha de pagamento e cálculo de equivalência em salários mínimos (R$ 1.212,00).

📂 **Como Executar o Projeto**

    Certifique-se de ter o JDK 17 ou superior instalado.

    Clone o repositório ou baixe os arquivos fonte.

    Compile as classes dentro da pasta src.

    Execute a classe Principal.java para visualizar o output formatado no console.

Desenvolvido por: Weller de Souza Pereira

Local: Campina Grande - PB
