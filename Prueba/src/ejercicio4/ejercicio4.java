/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import modelo.funcionario;


/**
 *
 * @author marcos
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       funcionario funcionario= new funcionario ("12", "marcos", "proboste", "pisagua",250);
        System.out.println(funcionario.getApellido());
       
        
    }
    
}
