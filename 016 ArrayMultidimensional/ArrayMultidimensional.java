/**
 * Mostrando os conceitos de Array Multidimensional
 * @author Danilo Trindade de Castro
 */
public class ArrayMultidimensional {

    public static void main(String[] args) {
        
        // Relembrando array simples (de uma dimensão)
        String[] uma = {"Danilo", "Sandra"};
        System.out.println( uma[0] );
        // Output:
        // uma[0] = Danilo
        // uma[1] = Sandra

        // Array multidimensional (de duas dimensões)
        String[][] duas = { 
            {"Giovani", "M", "SP"},           // PRIMIMEIRA DIMENSAO (posição 0 do array 'duas')
            {"Sandra", "F", "MG", "12345678"} // SEGUNDA DIMENSAO    (posição 1 do array 'duas')
        };
        System.out.println( duas[1][3] );
        // Output:
        // duas[0][0] = Giovani (primeiro elemento da primeira dimensão)
        // duas[0][1] = M       (segundo  elemento da primeira dimensão)
        // duas[0][2] = SP      (terceiro elemento da primeira dimensão)
        // -------------------------------------------------------------
        // duas[1][0] = Sandra  (primeiro elemento da segunda dimensão)
        // duas[1][1] = F       (segundo  elemento da segunda dimensão)
        // duas[1][2] = MG      (terceiro elemento da segunda dimensão)

        // Descobrindo tamanho e quantidade de elementos
        System.out.println( duas.length );    // o tamanho do array é a quantidade de dimensões
        System.out.println( duas[0].length ); // quantos elementos tem na primeira dimensão? 3
        System.out.println( duas[1].length ); // quantos elementos tem na segunda dimensão? 4

        // Alterando elemento do array multidimensional
        String arrayAlterado = duas[0][0] = "GIOVANI";
        System.out.println( arrayAlterado );
    }
}