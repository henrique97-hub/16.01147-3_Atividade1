// Henrique Silva Godoy
// Atividade 1 - RA: 16.01147-3

package com.company;


public class Main {

    public static void main(String[] args) {
        Conta c1, c2, c3;
        c1 = new Conta();
        c2 = new Conta();
        c3 = new Conta();
        Usuario u1,u2,u3;
        u1 = new Usuario();
        u2 = new Usuario();
        u3 = new Usuario();

        // acesso a conta
        c1.titular = "usuario1";
        System.out.println("Titular: " + c1.titular);
        System.out.println("Senha usuario1: " + u1.senha1);
        c1.titular = "usuario2";
        System.out.println("Titular: " + c2.titular);
        System.out.println("Senha usuario2: " + u2.senha2);
        c3.titular = "usuario3";
        System.out.println("Titular: " + c3.titular);
        System.out.println("senha usuario3: "u3.senha3);
        //testes
        c1.saldo = 1000;
        c2.saldo = 250;
        c3.saldo = 3000;
        u1.gerarQR(250);
        u2.transferirDinheiro(250);





    }
}
