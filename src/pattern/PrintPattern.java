package pattern;

public class PrintPattern {
    public void printPyramid(int n){
        for(int i=0 ; i<n ; i++){
            int a = n-1-i;  // initial star in each row.
            for(int j=0 ; j<n+i ;j++){
                if(j == a){
                    System.out.print("*");
                    a+=2;  // for consequent stars.
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void rightTriangle(int n){
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n ; j++){
                if(j<=i){
                    System.out.print("*");
                    if(j==i){
                        break;
                    }
                }
            }
            System.out.println();
        }
    }

    public void leftTriangle(int n){
        for (int i = n-1 ; i>=0 ; i--){
            for (int j = 0 ; j<n ; j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void diamondShape(int n){
        int k=1;
        for(int i=0 ;i<n*2 ; i++){
            int temp = i;
            if(i>=n){
                int b = i-n;
                i = i-b-k;
                k++;
            }
            int a = i+n-1;
            for (int j=0 ; j<=a ; j++){
                if (j>=a-(i*2)){
                    System.out.print("*");
                    if(j==a){
                        break;
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            i=temp;
            System.out.println();
        }
    }

    public void rightPascalTriangle(int n){
        int k=2;
        for(int i=0; i<n*2 ; i++){
            int temp = i;
            if(i>=n){
                int b = i-n;
                i = i-b-k;
                k++;
            }
            for(int j=0; j<n ; j++){
                if(j<=i){
                    System.out.print("*");
                    if(j==i){
                        break;
                    }
                }
            }
            System.out.println();
            i = temp;
        }
    }

}
