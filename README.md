<div align="center">

# ☕ Java com IA — Bootcamp Itaú × DIO

Meus estudos, anotações e exercícios resolvidos no<br>
**[Bootcamp Itaú | Java com Inteligência Artificial](https://www.dio.me/bootcamp/itau-java-com-inteligencia-artificial)**, da DIO.

![Java](https://img.shields.io/badge/Java-25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![DIO](https://img.shields.io/badge/DIO-Bootcamp-E4105D?style=for-the-badge)
![Status](https://img.shields.io/badge/status-em_andamento-F2C94C?style=for-the-badge)
![Licença](https://img.shields.io/github/license/Caiquest/dio-itau-java?style=for-the-badge)

</div>

---

## 📌 Sobre

Este repositório registra minha evolução no bootcamp, do primeiro `Hello World` até APIs com Spring. Cada aula e cada desafio virou um projeto pequeno e independente, com comentários no código sobre o que aprendi em cada etapa, inclusive nas soluções que deram mais trabalho.

## 🗺️ Progresso

| # | Módulo | Pasta | Status |
|:-:|--------|-------|:------:|
| 1 | Potencializando sua jornada com IA e agentes | [`01-fundamentos-ia`](01-fundamentos-ia) | ✅ Concluído |
| 2 | Fundamentos para começar a programar em Java | [`02-fundamentos-java`](02-fundamentos-java) | ✅ Concluído |
| 3 | Programando o mundo real com Orientação a Objetos | [`03-orientacao-objetos`](03-orientacao-objetos) | 🚧 Em andamento |
| 4 | Fundamentos da Web e boas práticas com Java | [`04-boas-praticas-e-web`](04-boas-praticas-e-web) | ⏳ Planejado |
| 5 | APIs modernas no ecossistema Spring (Boot, Data, Security, Cloud e AI) | [`05-ecossistema-spring`](05-ecossistema-spring) | ⏳ Planejado |

Desafios de projeto previstos no bootcamp: **Design Patterns com Java** (padrões GoF e seu uso no Spring) e uma **API com Spring Boot que reconhece fala**.

## ☕ Módulo 2 — Fundamentos de Java

### 📘 Aulas

| # | Projeto | O que pratiquei |
|:-:|---------|-----------------|
| 01 | [Primeiro programa](02-fundamentos-java/01-primeiro-programa-dio/src/Program.java) | `Hello World` e argumentos de linha de comando (`args[]`) |
| 02 | [Padrões de desenvolvimento](02-fundamentos-java/02-padroes-de-desenvolvimento/src/Program.java) | `Scanner`, constantes (`static final`) e inferência de tipo com `var` |
| 03 | [Tipos primitivos e keywords](02-fundamentos-java/03-tipos-primitivos-keywords/src/Program.java) | `boolean`, `byte`, `int`, `long`, `float`, `char` e `String` |
| 04 | [Operadores lógicos e de atribuição](02-fundamentos-java/04-operadores-logicos-atribuicao/src/Program.java) | `&&`, `\|\|` e comparações — “posso dirigir?” |
| 05 | [Operadores aritméticos](02-fundamentos-java/05-operadores-aritmeticos/src/Program.java) | Operações básicas, `Math.sqrt`, `Math.pow`, incremento e decremento |
| 06 | [Operadores bitwise](02-fundamentos-java/06-operadores-bitwise/src/Program.java) | `&`, `\|`, `^`, `~`, `<<`, `>>` e `Integer.toBinaryString` |
| 07 | [Estruturas condicionais](02-fundamentos-java/07-estruturas-condicionais/src/Program.java) | `if` / `else if` / `else` e operador ternário |
| 08 | [Switch case](02-fundamentos-java/08-estrutura-switch-case/src/Program.java) | `switch` clássico × *switch expression* com `->` e `yield` |
| 09 | [Laço `for`](02-fundamentos-java/09-estrutura-de-repeticao/src/Program.java) | `for` com `continue` — números pares de 0 a 100 |
| 10 | [Laços `while` e `do-while`](02-fundamentos-java/10-estrutura-de-repeticao-while/src/Main.java) | Percorrendo os argumentos do programa com `while` e `do-while` |

### 🧩 Exercícios

| Exercício | Desafio | Conceitos |
|-----------|---------|-----------|
| [fundamentos-ex01](02-fundamentos-java/fundamentos-ex01/src/Program.java) | Recebe nome e data de nascimento e informa a idade | `LocalDate`, `Period`, `DateTimeFormatter` |
| [fundamento-ex02](02-fundamentos-java/fundamento-ex02/src/Program.java) | Calcula a área de um quadrado | `Scanner`, `double`, `printf` |
| [fundamento-ex03](02-fundamentos-java/fundamento-ex03/src/Program.java) | Calcula a área de um retângulo | `Scanner`, operadores aritméticos |
| [fundamento-ex04](02-fundamentos-java/fundamento-ex04/src/Program.java) | Diferença de idade entre duas pessoas | `Math.abs` (resolvido sem usar `if`) |
| [estruturas-controle-ex01](02-fundamentos-java/estruturas-controle-ex01/src/Main.java) | Tabuada de 1 a 10 de um número | `for` |
| [estruturas-controle-ex02](02-fundamentos-java/estruturas-controle-ex02/src/Main.java) | Calculadora de IMC com classificação do resultado | `if` / `else if` encadeado |
| [estruturas-controle-ex03](02-fundamentos-java/estruturas-controle-ex03/src/Main.java) | Pares ou ímpares de um intervalo, em ordem decrescente | `while` para validar a entrada, `for` decrescente |
| [estruturas-controle-ex04](02-fundamentos-java/estruturas-controle-ex04/src/Main.java) | Lê números até encontrar um que não seja divisível pelo inicial | `while (true)`, `continue` e `break` |

## 💡 O que mais marcou até aqui

- **Switch expressions com `yield`** — não conhecia: com `->` não precisa de `break`, e o `yield` devolve um valor de dentro de um `case` com bloco.
- **Datas com `java.time`** — a idade é calculada com `LocalDate` e `Period` a partir da data completa, e não só subtraindo os anos.
- **Validar a entrada do usuário** — um `while` que só deixa o programa seguir quando o valor digitado é válido.
- **`continue` e `break` no lugar certo** — foram eles que deixaram simples um laço `while (true)` que estava ficando confuso.

## ▶️ Como executar

**Pré-requisito:** JDK 25 (os projetos foram criados com o Azul Zulu 25; qualquer JDK 17 ou mais recente roda os exemplos).

Cada aula e exercício é um projeto independente do IntelliJ, com o código em `src/`.

**Pelo IntelliJ IDEA**

1. `File` → `Open` e selecione a pasta do projeto, por exemplo `02-fundamentos-java/estruturas-controle-ex03`.
2. Abra `src/Main.java` (ou `src/Program.java`) e clique em ▶️ **Run**.

**Pelo terminal** — sem compilar antes, usando o modo de arquivo único do Java:

```bash
cd 02-fundamentos-java/estruturas-controle-ex02/src
java Main.java
```

Dois projetos leem argumentos da linha de comando:

```bash
# 01-primeiro-programa-dio
java Program.java Java pausa

# 10-estrutura-de-repeticao-while
java Main.java Java Spring IA
```

## 🗂️ Estrutura

```text
dio-itau-java/
├── 01-fundamentos-ia/        # Módulo 1 — IA e agentes
├── 02-fundamentos-java/      # Módulo 2 — aulas e exercícios
│   ├── 01-primeiro-programa-dio/
│   │   └── src/Program.java
│   ├── ...
│   ├── 10-estrutura-de-repeticao-while/
│   ├── fundamentos-ex01/ … fundamento-ex04/
│   └── estruturas-controle-ex01/ … estruturas-controle-ex04/
├── 03-orientacao-objetos/    # Módulo 3
├── 04-boas-praticas-e-web/   # Módulo 4
└── 05-ecossistema-spring/    # Módulo 5
```

## 👤 Autor

**Caique Moraes** — estudante de Análise e Desenvolvimento de Sistemas, em transição para o desenvolvimento Java.

[![GitHub](https://img.shields.io/badge/GitHub-Caiquest-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Caiquest)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge)](https://www.linkedin.com/in/caique-moraes-4214782a3)

## 📄 Licença

Distribuído sob a licença MIT. Veja o arquivo [LICENSE](LICENSE).
