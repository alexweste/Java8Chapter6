/* Programma vychislyaet koren kvadratniy vo vneshnem metode square.
Ishodnye dannye v metod square peredayutsya iz etoy programmy
 */

class Square1 {

    //int square(int i){
      //  return i * i;


    public static void main(String[] args) {
        int x, y;
        SquareI sq1 = new SquareI();

        x = sq1.square(4); // peredayom metodu square argument 4
        System.out.println("x1= " + x);
        x = sq1.square(44); // peredayom metodu square argument 44
        System.out.println("x2= " + x);
        y = 6;
        x = sq1.square(y); // peredayom metodu square argument y
        System.out.println("x3= " + x);
    }

}
