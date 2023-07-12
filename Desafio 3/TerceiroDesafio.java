import java.util.*;

public class TerceiroDesafio {
    public static int quantidadeDePares(ArrayList<Integer> lista, int alvo) {
        Map<Integer, Integer> numeros = new HashMap<>();

        
        for (int num : lista) {
            numeros.put(num, numeros.getOrDefault(num, 0) + 1);
        }

        int quantidade = 0;
        
        for (int num : lista) {
            int complemento = num + alvo;

            if (numeros.containsKey(complemento)) {
                quantidade += numeros.get(complemento);
            }
        }

        return quantidade;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanhoArray;
        int alvo;
        int numero;

        List<Integer> lista = new ArrayList<>();

        tamanhoArray = input.nextInt();
        input.nextLine();

        alvo = input.nextInt();
        input.nextLine();

        for(int i = 0; i<tamanhoArray; i++){
            numero = input.nextInt();
            input.nextLine();

            lista.add(numero);
        }


        System.out.println(quantidadeDePares((ArrayList<Integer>) lista, alvo));

    }
}