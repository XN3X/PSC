package aula_08;

public class M013 {
    public static void main(String[] args) {
        int[] vA = {6, 9, 3};
        int numero = 3;

        int[] vM = new int [vA.length];

        for (int pos = 0;pos < vA.length;pos++){
            vM[pos] = vA[pos] * numero;
            System.out.printf("vM[%d] = %d\n", pos, vM[pos]);
        }
    }
}