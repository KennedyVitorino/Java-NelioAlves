# Declaração de variáveis em JAVA ☕

Sintaxe:
 `<tipo> <nome>` = `<valor inicial>;`
sendo o `valor inicial`

## Exemplos

`int idade = 25;` Inteiro

`double altura = 1.68;` Ponto Flutuante

`char sexo = 'F';` Caractere

### Uma variável possui

- Nome (ou identificardor)
- Tipo
- Valor
- Endereço

| Descrição | Tipo | Tamanho | Valores | Valor Padrão|
|:-----:|:-----:|:-----:|:-----:|:-----:|
| tipos numéricos inteiros | **byte** | 8 bits | -128 a 127 | 0 |
| tipos numéricos inteiros | **short** | 16 bits | -32768 a 32767 | 0 |
| tipos numéricos inteiros | **int** | 32 bits | -2147483648 a 2147483648 | 0 |
| tipos numéricos inteiros |  **long** | 64 bits | -9223372036854770000 a 9223372036854770000 | 0L |
| tipos numéricos com ponto flutuante | float | 32bits | -1,4024E-37 a 3,4028E+38 | 0.0f |
| tipos numéricos com ponto flutuante | **double** | 64 bits | -4,94E-307 a 1,79E+308 | 0.0 |
| um caractere Unicode | **char** | 16 bits | '\u0000' a '\uFFFF' | '\u0000' |
| valor verdade | 1 bit | **boolean** | {false, true} | false |

### String

Significado: cadeia de caracteres *(palavras ou textos)*

### Para concatenar vários elementos em um mesmo comando de escrita

Regra geral para **printf**:

``` java
"TEXTO1 *%f* TEXTO2 *%f* TEXTO3", variavel1, variavel2
```

%f = ponto flutuante

%d = inteiro

%s = texto

%n = quebra de linha

``` java
String name = "Kennedy";
int age = 28;
double income = 1212.0;

System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, age, income);
```

---

## Métodos printf, print e println em Java

Nesta lição iremos estudar os métodos printf, println e print em Java, métodos muito utilizados que servem para exibir os resultados do processamento de um programa no console.

## Objeto System.out

O objeto `System.out` representa a saída padrão, permitindo exibir dados no console quando executamos uma aplicação em Java.

O `System.out` possui diversos métodos para gerar as saídas, sendo os mais utilizados os métodos `println`, `printf` e `print`, que estudamos nesta lição

## Método println

O método `System.out.println()` gera uma string de texto, cria uma nova linha abaixo da atual e então posiciona o cursor nesta linha.

Abaixo temos um exemplo do método sendo empregado para exibir duas mensagens no console:

``` Java
System.out.println("Hello, world!");
System.out.println("Hello Java ☕");
```

## Método print

O método `System.out.printf` mostra os dados na saída formatados. Abaixo temos um exemplo do método sendo empregado para exibir a mensagem “Olá pessoal!, aqui é o Fábio” (em duas linhas), e uma terceira mensagem logo abaixo:

``` java
System.out.printf("%s%n%s","Hello world", "Olá, jovem padawan!");
System.out.printf("%n%d\n%d",15,20);
System.out.printf("%n%s%n%s%d%s","Java é hard?","Agora são ", 12, " horas e 24 minutos");
```

O primeiro argumento do método printf é uma *string* de formatação, que consiste de texto fixo e especificadores de formato. Os especificadores de formato são códigos que indicam onde e que tipo de dado será mostrado na saída a ser mostrada.

Um especificador de formato se inicia com o símbolo **%**, seguido por um caractere que representa o tipos de dado. No exemplo, **%s** representa uma **string**.

## Método printf – especificadores de formato

Na tabela abaixo temos alguns dos especificadores de formato mais comuns empregados pelo método printf():

| Especificador | Formato |
|:------:|:------|
| %s | String de caracteres |
| %d | Número de inteiro decimal |
| %u | Número inteiro decimal sem inal |
| %x, %X | Número inteiro hexadecimal, sem sinal, minúsculo ou maiúsculo |
| %f | Float |
| %2f | Double |
| %e, %E| Número real, em notação científica, minúsculo ou maiúsculo |
| %b | Boolean |
| %c | Caractere (char) |

## Método printf – Caracteres de escape

Abaixo temos alguns dos caracteres de escape mais comuns empregados pelo método printf() (e outros métodos):

| Caractere | Representa |
|:------:|:------|
| \t | Tabulação |
| \b | Backspace |
| \n | Nova linha |
| \r | Retorno de carro |
| \' | Aspa simples |
| \" | Aspa dupla  |
| \\\ | Barra invertida |

### Específico para o printf

| Caractere | Representa |
|:------:|:------|
| %% | Símbolo de porcentagem |

---

## Entrada de dados

### Scanner

Para fazer entrada de dados, nós vamos criar um objeto do tipo
"Scanner" da seguinte forma:

``` java
Scanner sc = new Scanner(System.in);
```

- *import java.util.Scanner;*
- faça *sc.close()* quando não precisar mais do objeto *sc*

### Para ler uma palavra (texto sem espaços)

Suponha uma variável tipo String declarada:

``` java
String x;
x = sc.next();
```

### Para ler um número inteiro

Suponha uma variável tipo int declarada:

``` java
int x;
x = sc.nextInt();
```

### Para ler um número com ponto flutuante

Suponha uma variável tipo double declarada:

``` java
double x;
x = sc.nextDouble();
```

#### ⚠️🛑ATENÇÃO🛑⚠️

Para considerar o separador de decimais como ponto, **ANTES** da declaração do Scanner, faça:

``` java
Locale.setDefault(Locale.US);
```

### Para ler um caracter

Suponha uma variável tipo char declarada:

``` java
char x;
x = sc.next().charAt(0);
```

### Para ler vários dados na mesma linha

``` java
String x;
int y;
double z;
x = sc.next();
y = sc.nextInt();
z = sc.nextDouble();
```

### Para ler um texto ATÉ A QUEBRA DE LINHA

``` java
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s1, s2, s3;

    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    sc.close();
  }
}
```

### ⚠️🛑ATENÇÃO🛑⚠️ quebra de linha pendente

Quando você usa um comando de
leitura diferente do **nextLine()** e
dá alguma quebra de linha, essa
quebra de linha fica "pendente"
na entrada padrão.
Se você então fizer um **nextLine()**,
aquela quebra de linha pendente
será absorvida pelo **nextLine()**.

``` java
int x;
String s1, s2, s3;

x = sc.nextInt();
s1 = sc.nextLine();
s2 = sc.nextLine();
s3 = sc.nextLine();

System.out.println("DADOS DIGITADOS:");
System.out.println(x);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
```

Solução:
Faça um **nextLine()** extra antes de
fazer o **nextLine()** de seu
interesse.

## Funções matemáticas em Java ☕

Algumas funções matemáticas em Java ☕

| Exemplo | Significado |
|:-----:|:-----:|
| A = Math.sqrt(x); | Variável A recebe a raiz quadrada de x |
| A = Math.pow(x, y); | Variável A recebe o resultado de x elevado a y |
|A = Math.abs(x); | Variável A recebe o valor absoluto de x |

### Exemplo

``` java
public class Main {

  public static void main(String[] args) {

    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;

    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(25.0);
    System.out.println("Raiz quadrada de " + x + " = " + A);
    System.out.println("Raiz quadrada de " + y + " = " + B);
    System.out.println("Raiz quadrada de 25 = " + C);

    A = Math.pow(x, y);
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);
    System.out.println(x + " elevado a " + y + " = " + A);
    System.out.println(x + " elevado ao quadrado = " + B);
    System.out.println("5 elevado ao quadrado = " + C);

    A = Math.abs(y);
    B = Math.abs(z);
    System.out.println("Valor absoluto de " + y + " = " + A);
    System.out.println("Valor absoluto de " + z + " = " + B);
  }
}
```

### Operadores de atribuição cumulativa

| a += b; | a = a + b; |
|:----|:----:|
| a -= b; | a = a - b; |
| a *= b; | a = a * b; |
| a /= b; | a = a / b; |
| a %= b; | a = a % b; |

> Exemplo:

``` java
import java.util.Locale;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  try (Scanner sc = new Scanner(System.in)) {

   Locale.setDefault(Locale.US);

   int minutos = sc.nextInt();

   double conta = 50.0;

   if (minutos > 100) {
    conta += (minutos - 100) * 2.0;         
   }
   System.out.printf("Valor da conta: R$ %.2f%n", conta);

  }
 }
}
```

### Expressão condicional ternária

Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
condição.

**Sintaxe:**

`(condição) ? valor_se_verdadeiro : valor_se_falso`

**Exemplos:**

`(2 > 4) ? 50 : 80` -> 80

`(10 != 3) ? "Maria" : "Alex"` -> "Maria"

**Demonstração:**

``` Java
double preco = 34.5;
double desconto;

if (preco < 20.0) {
  desconto = preco * 0.1;
}
else {
  desconto = preco * 0.05;
}
```

``` Java
double preco = 34.5;
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
```

### Escopo e inicialização

Checklist:

- Escopo de uma variável: é a região do programa onde a variável é
válida, ou seja, onde ela pode ser referenciada.

- Uma variável não pode ser usada se não for iniciada.

- Falaremos de escopo de métodos no Capítulo 5.

``` Java
double price = sc.nextDouble();

if (price > 100.0) {
  double discount = price * 0.1;
}
System.out.println(discount);
```

### Como utilizar o Debug no Eclipse (execução passo a passo)

- Para marcar uma linha de breakpoint:
  - Run -> toggle

- Para iniciar o debug:
  - Botão direito na classe -> Debug as -> Java Application

- Para executar uma linha:
  - F6
- Para interromper o debug:

    ![parar debug](https://user-images.githubusercontent.com/82242582/184365884-fda33737-d84f-4c2f-ba19-c8b696ae1ca1.png)

### Código de Exemplo

``` Java
import java.util.Locale;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
  
  Locale.setDefault(Locale.US);
  Scanner sc = new Scanner(System.in);

  double largura = sc.nextDouble();
  double comprimento = sc.nextDouble();
  double metroQuadrado = sc.nextDouble();

  double area = largura * comprimento;
  double preco = area * metroQuadrado;

  System.out.printf("AREA = %.2f%n", area);
  System.out.printf("PRECO = %.2f%n", preco);
  sc.close();

  }
}
```

### Operadores bitwise

| Operador | significado |
|:-----:|:-----:|
| & | Operação "E" bit a bit |
| &#124; | Operação "OU" bit a bit |
| ^ | Operação "OU-exclusivo" bit a bit |

| C1 | C2 | C1 E C2|
|:---:|:---:|:---:|
| F | F | F |
| F | V | F |
| V | F | F |
| V | V | V |

| C1 | C2 | C1 OU C2|
|:---:|:---:|:---:|
| F | F | F |
| F | V | V |
| V | F | V |
| V | V | V |

| C1 | C2 | C1 XOR C2|
|:---:|:---:|:---:|
| F | F | F |
| F | V | V |
| V | F | V |
| V | V | F |
