import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce tu nombre de usuario: ");
        String name = scanner.nextLine();
        System.out.print("Por favor, introduce tu contraseña: ");
        String secret = scanner.nextLine();

        String username = "marimpuri";
        String password = "Avemaria123!";
        
        if(username.equals(name) && password.equals(secret)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }

        scanner.close();
    }
}
