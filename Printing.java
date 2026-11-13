public class Printing {
    public static void main(String[] args) {
        // System.out.println("Printing a solid square:");
        // System.out.println("-------------------------");
        // System.out.println();
        // SolidSquare obj = new SolidSquare();
        // obj.square(5);

        //  System.out.println("------------ rectangle -------------");

        //  RectangleSquareStar obj = new RectangleSquareStar();
        //  obj.rectangle(3);

        //  System.out.println("------------ Triangle -------------");
        //  TriangleStar obj = new TriangleStar();
        //  obj.Triangle(5);

        //  System.out.println("------------ base Triangle -------------");
        //  BaseTriangleStar obj = new BaseTriangleStar();
        //  obj.baseTriangle(5);


        //  System.out.println("------------ Mirrored Rhombus Star  -------------");
        //  MirroredRhombus obj = new MirroredRhombus();
        //  obj.mirroredRhombus(5);

        //  System.out.println("------------ Pyramid Star  -------------");
        //  PyramidStar obj = new PyramidStar();
        //  obj.pyramid(5);

        // System.out.println("------------ Inverted Pyramid Star  -------------");
        // InvertedPyramid obj = new InvertedPyramid();
        // obj.invertedPyramid(5);

            // System.out.println("------------ Hollow Reactangle Star  -------------");
            // HollowReactangle obj = new HollowReactangle();
            // obj.hollowReactangle(5);

            // System.out.println("------------ Hollow Triangle Star  -------------");
            // HollowTriangle obj = new HollowTriangle();
            // obj.hollowTriangle(5);

            // System.out.println("------------ Hollow Space Pyramid Star  -------------");
            // HollowSpacePryamid obj = new HollowSpacePryamid();
            // obj.SpacePryamid(5);

            DiamondStar obj = new DiamondStar();
            obj.diamond(5);
    }
}

class SolidSquare {
    public void square(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class RectangleSquareStar {
 public void rectangle(int n){
    for(int row = 1; row <= n; row++){
        for(int col = 1; col<= n + 2; col++){
            System.out.print("* ");
        }
        System.out.println();
    }
 }
}

class TriangleStar{
    public void Triangle(int n){
        for(int row =1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

class BaseTriangleStar{
    public void baseTriangle(int n){
        for(int row=1; row<=n; row++){
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class MirroredRhombus{
    public void mirroredRhombus(int n){
        for(int row =1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class PyramidStar{
    public void pyramid(int n){
        for(int row = 1; row <= n; row++){
            for(int space = 1; space <= n -row; space++){
                System.out.print(" ");
            }
            for(int col =1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class InvertedPyramid{
    public void invertedPyramid(int n){
        for(int row =1; row<=n; row++){
            //space
            for(int spc=1; spc<=row; spc++){
                System.out.print(" ");
            }

            // Inverted
            for(int col=1; col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class HollowReactangle {
    public void hollowReactangle(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n+2; col++){
                if(row==1 || row==n || col==1 || col==n+2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class HollowTriangle {
    public void hollowTriangle(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                if(row==n || col==1 || col==row){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class HollowSpacePryamid {
    public void SpacePryamid(int n) {
        for(int row=1; row<=n; row++){
            // after space
            for(int spe=1; spe<=n-row; spe++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                if (col==1 || col==row || row==n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class DiamondStar {
    public void diamond(int n) {
        // upar 
        for(int row=1; row<=n; row++){
            // after space
            for(int spe=1; spe<=n-row; spe++){
                System.out.print(" ");
            }

            for(int col=1; col<=row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }

        // neeche
        for(int row = 1; row<=n-1; row++){
            // spac 
            for(int spe=1; spe<=row; spe++){
                System.out.print(" ");
            }

            for(int col=1; col<=n-row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

