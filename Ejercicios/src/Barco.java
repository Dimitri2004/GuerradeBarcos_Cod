public class Barco {
    public static void main(String[] args) {

        int[][] tablero;

        //coordenadas de los barcos, donde hay un uno hay un trozo de barco
        tablero = new int[][]{
                {4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,0,0,2},
                {0,0,1,0,0}
        };

        recorrerTablero(tablero);
        System.out.println("...");
        /*
        Muestra lass corder
        //coordenadas de la cuadrícula donde están los barcos
    int i = 0;
    int j = 0;

    //te enseña todas las coordenadas por pantalla
    do{
        do{
            System.out.println(tablero[i][j]);
            j++;
        }while(j<5);
        i++;
        j=0;
    }while(i<5);

*/

    }
    private static void recorrerTablero(int[][] aux_tablero) {
        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                if(aux_tablero[i][j]>=0){
                        switch (aux_tablero[i][j]){

                            case 1:
                                    System.out.println("Avion");
                                    System.out.print("Posicion: "+i+" "+j);
                                    System.out.print("\n");
                                    break;
                            case 2:
                                    System.out.println("Buque");
                                    System.out.print("Posicion: "+i+" "+j);
                                    System.out.print("\n");
                                    break;
                            case 4:
                                    System.out.println("Portaaviones");
                                    System.out.print("Posicion: "+i+" "+j);
                                    System.out.println("\n");
                                    break;
                        }
                }

            }
        }

    }
}
