import java.util.Random;
import java.util.Scanner;
public class ShipGameBoard {
    public static void spawnF(int a[][], int b1,int c, int n){
        for(int x = 0;x<b1;x++){
            while(true){
                Random rand = new Random();
                int n1 = rand.nextInt(n);
                int n2 = rand.nextInt(n);
                int r = rand.nextInt(100);
                if(n1+c<=n-2 && r < 50) {
                    boolean b = true;
                    for (int i = n1;i<n1+c;i++){
                        if(a[i][n2]==1){
                            b = false;
                            break;
                        }
                        if(n2>0 && a[i][n2-1]==1){
                            b = false;
                            break;
                        }
                        if(n2<n-1 && a[i][n2+1]==1){
                            b = false;
                            break;
                        }
                    }
                    if(n1>0 && (a[n1-1][n2]==1 || n2>0 && a[n1-1][n2-1]==1 ||n2<n-1 && a[n1-1][n2+1]==1)){
                        b = false;
                    }
                    if(n1<n-2-c && (a[n1+c][n2]==1 || n2>0 && a[n1+c][n2-1]==1 ||n2<n-1 && a[n1+c][n2+1]==1)){
                        b = false;
                    }
                    if(b) {
                        for (int i = n1;i<n1+c;i++){
                            a[i][n2] = 1;

                        }
                        break;
                    }


                }else if(n2+c<=n-2){
                    boolean b = true;
                    for (int i = n2;i<n2+c;i++){
                        if(a[n1][i]==1){
                            b = false;
                            break;
                        }
                        if(n1>0 && a[n1-1][i]==1){
                            b = false;
                            break;
                        }
                        if(n1<n-1 && a[n1+1][i]==1){
                            b = false;
                            break;
                        }
                    }
                    if(n2>0 && (a[n1][n2-1]==1 || n1>0 && a[n1-1][n2-1]==1 ||n1<n-1 && a[n1+1][n2-1]==1)){
                        b = false;
                    }
                    if(n2<n-2-c && (a[n1][n2+c]==1 || n1>0 && a[n1-1][n2+c]==1 ||n1<n-1 && a[n1+1][n2+c]==1)){
                        b = false;
                    }
                    if(b) {
                        for (int i = n2;i<n2+c;i++){
                            a[n1][i] = 1;

                        }
                        break;
                    }
                }
            }
        }
    }
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int a[][] = new int[10][10];
        spawnF(a,1,4,10);
        spawnF(a,2,3,10);
        spawnF(a,3,2,10);
        spawnF(a,4,1,10);
        for (int i = 0;i<10;i++){
            for (int j = 0;j<10;j++){
                System.out.print(a[i][j]==1?"0":"=");
            }
            System.out.println();
        }
    }
}
