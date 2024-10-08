/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinhaExcecao1;

import newpackage.MinhaExcecao1;
import newpackage.MinhaExcecao2;
/**
 *
 * @author Admin
 */
public class Teste_Excecoes {
    public static void main(String[] args) {
        MinhaExcecao1 excecao1 = new MinhaExcecao1("Teste 1");
        MinhaExcecao2 excecao2 = new MinhaExcecao2("Teste 2");

        try {
            excecao1.geraExcecao();
        } catch (MinhaExcecao1 e) {
            System.out.println("Capturada: " + e.getMessage());
        }

        try {
            excecao2.geraExcecao();
        } catch (MinhaExcecao2 e) {
            System.out.println("Capturada: " + e.getMessage());
        }
    }
}
