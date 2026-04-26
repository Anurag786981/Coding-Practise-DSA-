package org.example.arrays;

public class SquareAndTriangle {

    public static void square(){
        for (int i =1;i<=4;i++){
            for (int j =1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void traiangle(){
        for (int i =1; i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
    public static void invertedTriangle(){
        System.out.println("inside loop");
        for (int i =4; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pyramid(){
        int n =4;
        for (int i=1; i<=n;i++){
            //space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }

    }
    public static void diamond(){
        int n =4;
        for (int i=1; i<=n;i++){
            //space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        //Lower Pyramid
        for (int i=n-1;i>=1;i-- ){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }

    }
    public static void starC(){
        int n=4;
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (i==1||i==n||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void digonalSquare(){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1||i==n||j==n || j==1|| i==j || i+j==n+1){

                        System.out.print("* ");

                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    public static void hollowTriangle(){
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i==1||i==n||i==j || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

}
