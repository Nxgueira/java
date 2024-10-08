/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;


/**
 *
 * @author Admin
 */
public class MinhaExcecao2 extends Exception {
    public MinhaExcecao2(String message) {
        super(message);
    }

    public void geraExcecao() throws MinhaExcecao2 {
        throw new MinhaExcecao2("Exceção 2 ocorreu!");
    }
}
