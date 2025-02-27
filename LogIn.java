import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, 
        //si son iguales a los datos dados imprimirá en terminal: Acceso concedido, 
        //si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, 
        //es decir, que no haga un salto de línea.
        Scanner scanner = new Scanner(System.in); //Escribe un programa que pida al usuario que ingrese la temperatura en celcius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:
        System.out.print("Introduce usuario y contraseña: ");
        String username = scanner.next();
        String password = scanner.next();
        System.out.println("Username: "+username+" and password: "+password+".");
        
        if(username.equals("kat") && password.equals("test")){
        System.out.println("Acceso concedido.");
        }
        else{
        System.out.println("Nombre de usuario o contraseña incorrecta.");
        }
        scanner.close();
    }
}
