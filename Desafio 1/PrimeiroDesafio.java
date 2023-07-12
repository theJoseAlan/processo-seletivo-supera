import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<Integer>();
        List<Integer> listaNumerosPares = new ArrayList<Integer>();
        List<Integer> listaNumerosImpares = new ArrayList<Integer>();

        int quantidadeNumeros = input.nextInt();
        input.nextLine();

        for(int i = 0; i < quantidadeNumeros; i++){
            int numero = input.nextInt();
            listaNumeros.add(numero);
        }

        for(int numeros : listaNumeros){
            if(numeros%2==0){
                listaNumerosPares.add(numeros);
            }
        }

        for(int numeros : listaNumeros){
            if(numeros%2!=0){
                listaNumerosImpares.add(numeros);
            }
        }

        System.out.println(listaNumeros);

        Collections.sort(listaNumerosPares);
        System.out.println(listaNumerosPares);

        Collections.sort(listaNumerosImpares);
        Collections.reverse(listaNumerosImpares);
        System.out.println(listaNumerosImpares);


        for(int numeros : listaNumerosPares){
            System.out.println(numeros);
        }

        for(int numeros : listaNumerosImpares){
            System.out.println(numeros);
        }

    }
}
