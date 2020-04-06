package com.company;

import java.util.Random;

public class Transações {
    public double saldo;

    private static int getRandomNumberInRange (int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

    }


    boolean transferir(double valor) {
        if (valor > this.saldo)
            return false;
        else {
            this.saldo = this.saldo - valor;
        }
    }

    void depositar(double valor) {
        this.saldo += valor;
    }


    boolean transferirDinheiro(Conta destino, double valor) {
        if (transferir(valor)) {
            destino.depositar(valor);
            return true;
        }
    } else
    {return false;
    }

     public String gerarQR(){
        String qrCode = String.format("%s;%s;%s;%s", id, Usuario, valor, getRandomNumberInRange(1000, 9999));
        return gerarQR();
    }



}





