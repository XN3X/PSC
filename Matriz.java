package aula_08;

public class Matriz {
    public static void main(String[] args) {
        int[][] mA = {{3, 6, 9,
                       6, 4, 5,
                       9, 5, 1}};
        Matriz matriz = new Matriz();
        System.out.println(matriz.ehSimetrica(mA));

    }
    public boolean ehSimetrica(int[][] m){
        boolean simetrica = true;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                simetrica = simetrica &&
                        m[i][j] == m[j][i];
            }
        }
        return simetrica;
    }
}


