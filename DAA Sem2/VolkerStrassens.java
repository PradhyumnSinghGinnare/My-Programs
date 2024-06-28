public class VolkerStrassens {
    public static void main(String[] args) {
        int A[][] = {{1,2},{3,4},{5,6},{7,8}};
        int B[][] = {{1,2},{3,4},{5,6},{7,8}};
        int n = 2;
        int[][] C = new int[n][n];

        int P = (A[0][0] + A[1][1]) * (B[0][0] + B[1][1]);
        int Q = (A[1][0] + A[1][1]) * (B[0][0]);
        int R = (A[0][0]) * (B[0][1] - B[1][1]);
        int S = (A[1][1]) * (B[1][0] - B[0][0]);
        int T = (A[0][0] + A[0][1]) * (B[1][1]);
        int U = (A[1][0] - A[0][0]) * (B[0][0] + B[0][1]);
        int V = (A[0][1] - A[1][1]) * (B[1][0] + B[1][1]);
        C[0][0] = P + S - T + V;
        C[0][1] = R + T;
        C[1][0] = Q + S;
        C[1][1] = P + R - Q + U;

        for(int i=0; i<C.length; i++){
            for(int j=0; j<C[0].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
