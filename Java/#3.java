public class Main {
    public static void main(String[] args) {
        Main[] A = {7, 1};
        Main[] B = {10, 8};
        Main[] C = {1, 10};
        Main[] D = {(B[0] + C[0]) / 2, (B[1] + C[1]) / 2};
        Main[] E = {(A[0] + C[0]) / 2, (A[1] + C[1]) / 2};
        Main[] F = {(A[0] + B[0]) / 2, (A[1] + B[1]) / 2};
        Main[] bary = {(D[0] + E[0] + F[0]) / 3, (D[1] + E[1] + F[1]) / 3};
        System.out.printf("{%.4f, %.4f}", bary[0], bary[1]);
    }
}