Recursividade em Java – Cálculo do Máximo Divisor Comum (MDC)

Enunciado
Criar uma aplicação em Java com uma função recursiva que receba dois números inteiros positivos e apresente o **Máximo Divisor Comum (MDC)** desses números.

O cálculo deve seguir a definição recursiva:
* `MDC(x, y) = MDC(x − y, y)`, se `x > y`
* `MDC(x, y) = MDC(y, x)`, se `x < y`
* `MDC(x, x) = x`

O programa deve ser testado com diferentes pares de números, incluindo casos em que os números sejam iguais, múltiplos, ou primos entre si.

Objetivo

O objetivo deste exercício é praticar:
* Recursividade em Java
* Raciocínio lógico aplicado à redução de problemas
* Implementação de condições de parada em funções recursivas
* Compreensão da operação de MDC sem necessidade de fatoração manual
* Organização de chamadas recursivas para garantir que o problema seja resolvido corretamente


Requisitos

O programa deve:
1. Receber dois números inteiros positivos como entrada.
2. Calcular o MDC utilizando **apenas recursão**.
3. Seguir corretamente as condições do enunciado para troca e subtração dos números.
4. Garantir que a função pare quando os dois números forem iguais.
5. Testar a aplicação com diferentes casos, incluindo:

   * Números iguais
   * Um número múltiplo do outro
   * Números primos entre si
   * Números grandes


Tecnologias

* Oracle Java
* Programação Orientada a Objetos (POO)
* Recursividade


Observações

Este exercício faz parte dos estudos de **Introdução às Estruturas de Dados**, com foco no desenvolvimento do raciocínio lógico, na compreensão de técnicas recursivas e na redução gradual do problema até atingir a solução final, aproximando os valores dos números até encontrar o MDC.
