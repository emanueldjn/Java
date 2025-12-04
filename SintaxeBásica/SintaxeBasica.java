package SintaxeBásica;

public class SintaxeBasica {
    public static void main(String[] args) {

        // VARIÁVEIS
        /*
         Uma variável é como uma "caixa" que guarda um valor para ser usado no código.
         Toda variável tem:
           • um tipo (int, String, boolean...)
           • um nome (idade, nome, numero)
           • um valor que pode mudar durante o programa
        */

        int idade = 21;
        String nome = "Emanuel";

        // Tipos primitivos

        byte numPequeno = 127;              // -128 a 127 | 1 byte
        short numCurto = 32000;             // -32.768 a 32.767 | 2 bytes
        int numero = 100000;                // Inteiros gerais | 4 bytes
        long numeroGrande = 1000000000L;    // Inteiros grandes | 8 bytes

        float numeroDecimal = 3.14f;        // Decimais menores | 4 bytes
        double numeroGrandeDecimal = 3.1415926535; // Decimais precisos | 8 bytes

        char letra = 'A';                   // 1 caractere | 2 bytes
        boolean ligado = true;              // true/false | 1 bit


        // ========================================================
// Variáveis e Tipos de Dados
// ========================================================

// Lógicos
// boolean -> true / false (1 bit)
// Ex: boolean ativo = true;

// Literais
// char   -> 'a'      (2 bytes - caractere Unicode)
// Ex: char letra = 'A';
// String -> "texto"  (tamanho variável)
// Ex: String nome = "Emanuel";

// Inteiros
// byte  -> 1 byte  | -128 a 127
// Ex: byte idade = 127;
//
// short -> 2 bytes | -32.768 a 32.767
// Ex: short ano = 2025;
//
// int   -> 4 bytes | -2.147.483.648 a 2.147.483.647
// Ex: int populacao = 500000;
//
// long  -> 8 bytes | números muito grandes
// Ex: long distancia = 9999999999L;

// Reais
// float  -> 4 bytes | usa 'f' no final
// Ex: float altura = 1.75f;
//
// double -> 8 bytes | maior precisão
// Ex: double preco = 199.99;


// ========================================================
// Operadores Lógicos
// ========================================================

// AND lógico
// && -> true somente se ambos forem true
// Ex: true && false → false

// OR lógico
// || -> true se pelo menos um for true
// Ex: true || false → true

// NOT lógico
// ! -> inverte o valor
// Ex: !true → false

// XOR lógico
// ^ -> true somente se forem diferentes
// Ex: true ^ false → true
// Ex: true ^ true → false


    }
}
