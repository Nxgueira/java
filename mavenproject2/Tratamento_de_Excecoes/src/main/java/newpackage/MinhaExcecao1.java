/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;


/**
 *
 * @author Admin
 */
public class MinhaExcecao1 extends Exception {
    public MinhaExcecao1(String message) {
        super(message);
    }

    public void geraExcecao() throws MinhaExcecao1 {
        throw new MinhaExcecao1("Exceção 1 ocorreu!");
    }
}