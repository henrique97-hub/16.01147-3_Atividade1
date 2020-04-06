package com.company;

import java.sql.SQLOutput;

public class Conta {
    public int id;
    public String titular;
    public double saldo;

    public Conta () {
        Conta c1, c2, c3;

        c1 = new Conta(id = 111);
        c2 = new Conta(id = 222);
        c3 = new Conta(id = 333);

    }

     void versaldo(){
         System.out.println("O saldo da conta é: "this.saldo);
    }
}
