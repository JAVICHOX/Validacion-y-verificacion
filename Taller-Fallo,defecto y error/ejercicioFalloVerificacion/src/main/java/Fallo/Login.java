
package Fallo;

import java.util.Scanner;

/**
 *
 * @author Javier Proaño
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner credencial=new Scanner(System.in);
        String usuario,password;
        // TODO code application logic here
        System.out.println("\t-----LOGIN-------\t");
        System.out.println("Usuario:");
        usuario=credencial.next();
        System.out.println("Contraseña:");
        password=credencial.next();
        validarCredenciales(usuario,password);
    }
    
    public static void validarCredenciales(String usuario, String password){
        if(usuario.equals("Juanito") && password=="1234"){
            System.out.println("Accedió al sistema correctamente!!");
        }else{
            System.out.println("Acceso denegado. Credenciales Incorrectas");
        }
    }
    
    
}
