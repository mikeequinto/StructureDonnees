package exo3;

import java.util.Arrays;

public class Matrice {

    int[][] mat;

    public Matrice(int m, int n){
        createMatrice(m, n);
    }

    public void createMatrice(int m, int n){
        mat = new int[m][n];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = i + j;
            }
        }
    }

    public void afficherMatrice(){
        for(int i = 0; i < mat.length; i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }

}
