public class AdvancePatterns {
    public static void main(String[] args) {
        //Hollow Rectangle function call
        HollowRectangle(4, 5);

        //Inverted and Rotated Half-Pyramid Function call
        HalfPyramid(5);

        //Inverted Half-Pyramid with Numbers Function call
        InvertedHalfPyramid(5);

        //Floyd's Triangle Function call
        FloydTriangle(5);

        //0-1 Triangle Function call
        Zero_One_Triangle(5);

        //Butterfly Pattern Function call
        Butterfly(5);

        //Solid Rhombus Function
        SolidRhombus(5);

        //Hollow Rhombus Function
        HollowRhombus(5);

        //Diamond Pattern
        Diamond(4);
    }

    //Hollow Rectangle Function
    public static void HollowRectangle(int totRows, int totCols){
        //outer loop
        for(int i=1; i<=totRows; i++){
            //inner loop
            for(int j=1; j<=totCols; j++){
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Inverted and Rotated Half-Pyramid Function
    public static void HalfPyramid(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                //Spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                //Stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Inverted Half-Pyramid with Numbers Function
    public static void InvertedHalfPyramid(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Floyd's Triangle Function
    public static void FloydTriangle(int totRows){
        int count = 1;
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    //0-1 Triangle Function
    public static void Zero_One_Triangle(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    //Butterfly Pattern Function
    public static void Butterfly(int totRows){
        //1st half
        for(int i=1; i<=totRows; i++){
            //Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces - 2*(n-i)
            for(int j=1; j<=2*(totRows-i); j++){
                System.out.print(" ");
            }
            //Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=totRows; i>=1; i--){
            //Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces - 2*(n-i)
            for(int j=1; j<=2*(totRows-i); j++){
                System.out.print(" ");
            }
            //Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Solid Rhombus Function
    public static void SolidRhombus(int totRows){
        for(int i=1; i<=totRows; i++){
            //Spaces - n-i
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            //Stars - n
            for(int j=1; j<=totRows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Hollow Rhombus Function
    public static void HollowRhombus(int totRows){
        for(int i=1; i<=totRows; i++){
            //Spaces - n-i
            for(int j=1; j<=(totRows-i); j++){
                System.out.print(" ");
            }

            //Stars - Hollow Rectangle
            for(int j=1; j<=totRows; j++){
                if(i==1 || i==totRows || j==1 || j==totRows){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Diamond Pattern
    public static void Diamond(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //Spaces - n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars - 2i-1
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //Spaces - n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars - 2i-1
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
