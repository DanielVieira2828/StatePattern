# Padrão de Design State em Java

Este repositório contém um exemplo simples de como utilizar o padrão de design **State** em Java. Além disso, inclui uma implementação alternativa sem o uso desse padrão para comparar as duas abordagens.

## O que é o Padrão State?

O padrão de design **State** é um dos padrões de comportamento do GoF (Gang of Four). Ele é usado para permitir que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá mudar de classe. Esse padrão é particularmente útil quando o comportamento de um objeto depende de seu estado e deve ser alterado dinamicamente durante o tempo de execução.

### Para que o Padrão State é Usado?

- **Modularidade e Organização:** O padrão State permite que você organize o código em várias classes pequenas, cada uma responsável por um estado específico. Isso torna o código mais modular e mais fácil de manter.
- **Facilidade de Extensão:** É fácil adicionar novos estados sem modificar o código existente. Basta criar uma nova classe que implemente a interface `State`.
- **Redução de Condicionais:** Evita o uso excessivo de instruções `if-else` ou `switch-case` para determinar o comportamento com base no estado.

## Como o Código Funciona

### Implementação com o Padrão State

No exemplo fornecido, criamos uma **máquina de venda automática** que pode estar em três estados diferentes:
- **Sem Moeda** (`SemMoeda`)
- **Com Moeda** (`ComMoeda`)
- **Produto Dispensado** (`ProdutoDispensado`)

Cada estado implementa uma interface `State` que define os métodos `inserirMoeda()`, `ejetarMoeda()`, `selecionarProduto()`, e `dispensarProduto()`. Dependendo do estado atual da máquina, o comportamento desses métodos mudará.

#### Estrutura de Classes

- **`State` Interface:** Define os métodos para todos os estados.
- **`SemMoeda` Class:** Implementa o comportamento quando a máquina está sem moeda.
- **`ComMoeda` Class:** Implementa o comportamento quando uma moeda é inserida.
- **`ProdutoDispensado` Class:** Implementa o comportamento quando um produto foi dispensado.
- **`MaquinaDeVenda` Class:** Classe de contexto que mantém uma referência ao estado atual e delega ações ao estado atual.

### Implementação Sem o Padrão State

Também foi fornecida uma implementação alternativa sem o uso do padrão State para fins de comparação. Nesta versão, usamos condicionais (`switch-case`) para alterar o comportamento da máquina de acordo com o estado atual.

#### Estrutura de Classes

- **`MaquinaDeVendaSemState` Class:** Implementa diretamente todo o comportamento usando um `enum` para definir os estados e `switch-case` para gerenciar a lógica.

### Comparação entre as Abordagens

1. **Com o Padrão State:**
   - Código mais modular e organizado.
   - Fácil adicionar novos estados.
   - Menos dependência de condicionais.

2. **Sem o Padrão State:**
   - Código mais compacto, mas menos organizado.
   - Dificuldade para adicionar novos estados, pois pode envolver modificações em várias partes do código.
   - Uso intensivo de condicionais (`switch-case`), o que pode tornar o código difícil de manter e entender.

