import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        List<String> palavras = new ArrayList<>();

        int qtdeExecuções = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtdeExecuções; i++) {
            String texto = input.nextLine();

            int length = texto.length();
            StringBuilder textoCorrigido = new StringBuilder(length);


            for (int k = length / 2 - 1; k >= 0; k--) {
                textoCorrigido.append(texto.charAt(k));
            }

            
            for (int k = length - 1; k >= length / 2; k--) {
                textoCorrigido.append(texto.charAt(k));
            }

            palavras.add(textoCorrigido.toString());
        }

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
