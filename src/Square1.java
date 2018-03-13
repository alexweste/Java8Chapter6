/* Programma vychislyaet koren kvadratniy vo vneshnem metode square.
Ishodnye dannye v metod square peredayutsya iz etoy programmy
 */

class Square1 {

    //int square(int i){
      //  return i * i;


    public static void main(String[] args) {
        int x, y;
        SquareI sq1 = new SquareI();
        SquareI sq2 = new SquareI();
        x = sq1.square(4);
        System.out.println("x1= " + x);
        x = sq1.square(44);
        System.out.println("x2= " + x);
        y = 6;
        x = sq2.square(y);
        System.out.println("x3= " + x);
    }

}
