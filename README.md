# Padrão de Design State em Java

Este repositório contém um exemplo simples de como utilizar o padrão de design **State** em Java. Além disso, inclui uma implementação alternativa sem o uso desse padrão para comparar as duas abordagens e demonstrar as vantagens de usar o padrão **State**.

## O que é o Padrão State?

O padrão de design **State** é um dos padrões de comportamento definidos pelo livro *"Design Patterns: Elements of Reusable Object-Oriented Software"* do GoF (Gang of Four). Ele foi criado para resolver problemas de código que dependem de múltiplos estados internos, oferecendo uma maneira organizada e escalável de gerenciar esses estados. O padrão permite que um objeto altere seu comportamento quando seu estado interno muda, fazendo com que o objeto "pareça" mudar de classe. Essa mudança é feita sem a necessidade de utilizar condicionais complexos ou modificar o código existente.

### Por que o Padrão State foi Criado?

O padrão **State** foi criado para:

- **Aumentar a Manutenibilidade:** Em sistemas onde o comportamento de um objeto muda de acordo com seu estado interno, a lógica tende a ficar cheia de condicionais `if-else` ou `switch-case`. Isso pode tornar o código difícil de entender e manter. O padrão **State** organiza essa lógica em classes separadas para cada estado, simplificando a manutenção.
  
- **Facilitar a Extensibilidade:** Em vez de modificar uma grande estrutura de controle para adicionar um novo estado, basta adicionar uma nova classe que implementa o novo comportamento. Isso facilita a extensão do sistema sem comprometer a integridade do código existente.
  
- **Melhorar a Clareza e Organização do Código:** Ao encapsular os comportamentos específicos dos estados em classes distintas, o padrão **State** torna o código mais modular e mais fácil de entender. Cada classe tem uma única responsabilidade, o que segue o princípio de responsabilidade única da programação orientada a objetos.

### Para que o Padrão State é Usado?

- **Modularidade e Organização:** Permite que você divida o comportamento de um objeto em várias classes pequenas, cada uma representando um estado específico, o que facilita o entendimento e a manutenção.
- **Facilidade de Extensão:** Novos estados podem ser adicionados sem necessidade de modificar o código existente, apenas criando uma nova classe que implementa a interface `State`.
- **Redução de Condicionais:** Evita o uso excessivo de instruções `if-else` ou `switch-case`, reduzindo a complexidade e o risco de erros no código.

## Como o Código Funciona

### Implementação com o Padrão State

No exemplo fornecido, criamos uma **máquina de venda automática** que pode estar em três estados diferentes:

- **Sem Moeda** (`SemMoeda`)
- **Com Moeda** (`ComMoeda`)
- **Produto Dispensado** (`ProdutoDispensado`)

Cada estado é implementado como uma classe que implementa a interface `State`. A interface `State` define métodos como `inserirMoeda()`, `ejetarMoeda()`, `selecionarProduto()`, e `dispensarProduto()`. Dependendo do estado atual da máquina, o comportamento desses métodos varia, permitindo uma troca de comportamento dinâmica e fácil de gerenciar.

#### Estrutura de Classes

- **`State` Interface:** Define os métodos que todos os estados devem implementar.
- **`SemMoeda` Class:** Implementa o comportamento da máquina quando não há moeda inserida.
- **`ComMoeda` Class:** Implementa o comportamento quando uma moeda é inserida e a máquina está pronta para selecionar um produto.
- **`ProdutoDispensado` Class:** Implementa o comportamento quando um produto foi selecionado e está sendo dispensado.
- **`MaquinaDeVenda` Class:** Classe de contexto que mantém uma referência ao estado atual e delega ações ao estado apropriado.

### Implementação Sem o Padrão State

Para fins de comparação, também foi fornecida uma implementação alternativa sem o uso do padrão **State**. Nesta versão, a classe `MaquinaDeVendaSemState` usa condicionais (`switch-case`) para definir o comportamento da máquina com base no estado atual.

#### Estrutura de Classes

- **`MaquinaDeVendaSemState` Class:** Contém toda a lógica de estados diretamente na classe usando um `enum` para definir os estados e `switch-case` para determinar o comportamento da máquina.

### Comparação entre as Abordagens

1. **Com o Padrão State:**
   - Código mais modular e organizado.
   - Facilmente extensível para novos estados.
   - Menor dependência de condicionais complexas.

2. **Sem o Padrão State:**
   - Código mais compacto em uma única classe, mas menos organizado.
   - Adicionar novos estados é mais complexo e propenso a erros, pois requer modificações em múltiplas partes do código.
   - Uso intensivo de condicionais (`switch-case`), que pode tornar o código difícil de manter e entender.
