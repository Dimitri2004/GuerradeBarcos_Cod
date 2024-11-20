import java.util.Scanner;

/**Maquina de cafe,te,chocolate pidiendo si quiere o no azuccar,empezando por el dinero que inserta el cliente
 *
 *
 **/

public class Maquina_de_cafe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dinero;
        boolean azucar;
        boolean te;
        boolean chocolate;
        boolean cafe;

        System.out.println("¿Cuánto dinero insertas?");
        dinero = sc.nextInt();

       System.out.println("¿Quieres café? (Si/No)");
       cafe= sc.nextBoolean();

        System.out.println("¿Quieres té? (Si/No)");
        te = sc.nextBoolean();

        System.out.println("¿Quieres chocolate? (Si/No)");
        chocolate = sc.nextBoolean();

        System.out.println("¿Quieres azúcar? (Si/No)");
        azucar = sc.nextBoolean();
        // Comprobar si hay suficiente dinero
        if(dinero < 5){
            System.out.println("No tienes suficiente dinero.");
        } else {
            // Calcular el cambio
            int cambio = dinero - 5;
            System.out.println("Cambio: " + cambio);

            // Mostrar los productos elegidos
            System.out.println("Productos elegidos:");
            if(cafe) System.out.println("Café");
            if(te) System.out.println("Té");
            if(chocolate) System.out.println("Chocolate");
            if(azucar) System.out.println("Azúcar");
        }

        sc.close();
    }
}
