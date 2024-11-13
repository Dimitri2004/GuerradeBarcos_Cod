import java.awt.datatransfer.SystemFlavorMap;

public class Practicas_recursividad {
    public static void main(String[] args){

      recursiva(0,1);
    }

    static void recursiva(int a,int b) {

        int sum=a+b;
        System.out.println(sum);
        a=b;
        b=sum;
        if (sum<10){
            recursiva(a,b);
        }
    }
}
