//Maquina que da tres elecciones que son :cafe te chocolate y  preguntando si quieres o no azucar,empezando por el dinero que mete el cliente por consola y devuelve el dinero si no es suficiente o se pasa del precio el cambio

public class SS {
    public static void main(String[] args) {
        System.out.println("Qué Opcion: 0(cafe) , 1(Te) , 2(Chocolate))");
        String[] opciones = {"cafe", "te", "chocolate"};
        int opcion = 1;
        int azucar;
        double[] precio=new double[]{80F,90F,100F};

        System.out.println("El precio de "+ opciones[opcion] +" es: "+precio[opcion]);
        double dinero = 120F;
        System.out.println("Pagaste con:"+dinero);
       do{
            if(dinero<precio[opcion]){
                System.out.println("Dinero insuficiente, te falta: " + (precio[opcion] - dinero));
                return;
            }else if(dinero>precio[opcion]){
                System.out.println("Cambio: "+(dinero-precio[opcion]));
            }
        if (dinero>=precio[opcion]){
            colocarvaso();
            boolean opcion_azucar=true;

            if(opcion_azucar){
                azucar=1;
                colocarAzucar(azucar);
            }
            colocolocarproducto(opcion);
        }
           return;
       }while(dinero<precio[opcion]);
    }
    static void colocarvaso(){
        System.out.println("Colocando Vaso");

    }

    static void colocarAzucar(int azucar){
        if(azucar==1){
            System.out.println("Colocando Azúcar");
        }else{
            System.out.println("No se coloca Azúcar");
        }
    }

    static void colocolocarproducto(int opcion){
        switch(opcion){
            case 0:
                System.out.println("Colocando Cafe");

                break;
            case 1:
                System.out.println("Colocando Te");
                break;
            case 2:
                System.out.println("Colocando Chocolate");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }


}
