/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author Kim Vammen
 */
public class Array3 {

    public static void main(String[] args) {

        int[][] tabel = new int[12][];

        for (int x = 0; x < tabel.length; x++) {
            tabel[x] = new int[x + 1];
        }

        for (int x = 0; x < tabel.length; x++) {
            for (int y = 0; y < tabel[x].length; y++) {
                tabel[x][y] = y + 1;
            }
        }
        for (int x = 0; x < tabel.length; x++) {
            for (int y = 0; y < tabel[x].length; y++) {
                System.out.print(tabel[x][y]);
            }

            System.out.println("");
        }

        for (int x = 0; x < tabel.length; x++) {

            int sum = 0;
            for (int y = 0; y < tabel[x].length; y++) {

                sum += tabel[x][y];

            }
            System.out.print("Summen af tallene på række " + tabel[x].length + " er " + sum);
            System.out.println("");
        }
    }
}
