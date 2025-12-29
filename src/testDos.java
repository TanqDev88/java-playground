import java.util.Scanner;

public class testDos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el numero");
        int numero = entrada.nextInt();
        System.out.println("Número ingresado: " + numero);

        int i = 0;
        while (i<=12){
            System.out.println(i);
            i++;
        }
        for (int e=0; i<=10;i++){
            System.out.println(e);
        }
        Scanner sn = new Scanner(System.in);
        int numeroDos;
        do{
            System.out.println("Escribi un numero");
            numeroDos = sn.nextInt();
        }while (!(numeroDos>=1 && numeroDos<=10) );

        System.out.println("Escribiste el "+ numeroDos);
    }
}