package JavaPattern;


public class Main {

    public static void main(String[] args) {
        StarHalfPyramid star = new StarHalfPyramid(10);
        star.display();

    }
}

class StarHalfPyramid {
    int row ;
    StarHalfPyramid(int row){
        this.row = row;
    }
    void display(){
        for (int row = 0; row <= this.row; row++) {
            
            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class FullPyramid{
    int row ;
    FullPyramid(int row){
        this.row = row;
    }
    void display(){
        for (int row = 0; row <= this.row; row++) {
            
           
        }
    }
}