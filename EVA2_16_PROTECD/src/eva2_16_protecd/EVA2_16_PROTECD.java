/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_protecd;

/**
 *
 * @author hp
 */
public class EVA2_16_PROTECD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Protected -----------> tener visiblilidad entre clases relacionada por herencia atributos y metodos
        SuperClase objSuper = new SuperClase();
        
    }
    
}
class SuperClase {
   protected int dato;
}
class SubClase extends SuperClase {
    public void imprimirDatos(){
        System.out.println("El Valor de datos es: "+ dato);
        
    }
}
//Protected ---> tener visibilidad entre clases relacionadas por herencia
//Atributos y métodos
//Funciona como default(a nivel de paquete es visible)
//Permite acceso a las subclases

//public, default, protected, private