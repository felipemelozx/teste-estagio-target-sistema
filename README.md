
# Estágio em Desenvolvimento - Ribeirão Preto

####  1 questão 
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

Resposta: [questão 1](src/question1.java)

#### 2 questão 
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

Resposta: [questão 2](src/question2.java)

#### 3 questão
Observe o trecho de código abaixo:
```
int INDICE = 12, SOMA = 0, K = 1; 
enquanto K < INDICE faça { 
    K = K + 1; SOMA = SOMA + K; 
    } imprimir(SOMA);
```
Ao final do processamento, qual será o valor da variável SOMA?

Considerando o código descrito ele começará a interação de k incrementando ele com 1 a cada interação fazendo assim ele ter os seguintes valores. 
[1,2,3,4,5,6,7,8,9,10,11,12] ele não vai até 13 por conta que ele não entra mais no loop.

Já na parte de soma ele vai em toda interação somar seu próprio valor atual com o valor de k naquela interação fazendo assim ela ter os seguintes valores [1,3,6,10,15,21,28,36,45,55,66,78] onde o valor exibido no final é **78**.
#### 4 questão

Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2,10, 12, 16, 17, 18, 19, ____






### Respostas:
A

 - A sequência a ser seguida é e somar mais 2 no último número:

 - exemplos:  
   1 + 2 = 3  
   3 + 2 = 5  
   5 + 2 = 7

 - com isso os próximos 4 numero são: **9, 11, 13, 15**



B
 - a sequência logica é múltiplos de 2. 

 - exemplos:  
    2 x 1 = 2  
    2 x 2  = 4   
    2 x 4  = 8

 -  com isso os próximos 4 numero são: **128, 256, 512, 1024**
C
  - A sequência a ser seguida é de potência de 2:

  - exemplos:    
     0² = 0  
     1² = 1  
     2² = 4

  -  com isso os próximos 4 numero são: **49, 64, 81, 100**
  
D
  - A sequência a ser seguida é de potência de 2, mas só com os números pares:

   - exemplos:    
     2² = 4  
     4² = 16  
     6² = 36

   -  com isso os próximos 4 numero são: **64, 100, 144, 196**

E 

   - A sequência a ser seguida é a de Fibonacci:

     - exemplos:    
     0 + 1 = 1  
     1 + 1 = 2  
     1 + 2 = 3
  
   -  com isso os próximos 4 numero são: **13, 21, 34, 55**

F
 - A sequência a ser seguida é a que número comece com uma das sílabas Do, De :

 - exemplos:    
     2 = **Do**is  
     10 = **De**z  
     12 = **Do**ze 

-  com isso os próximos  4  numero são: **200, 201, 202, 204**

#### 5 questão
 Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 

- Não conseguir pensar em nenhuma resposta.
