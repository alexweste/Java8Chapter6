// V etoy programme primenyaetsa metod, vvedenniy v klass Box
class BoxDemo3 {
    public static void main(String[] args){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double i;

        // prisvaivaem znacheniya peremennym ekzemplyara mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // [rosvaovaem znacheniya peremennym ekzemplyara mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // vyzyvaem metod volume iz klassa Box dlya vyvoda obyema pervogo parallelepipeda
        mybox1.volume();

        // vyzyvaem metod volume iz klassa Box dlua vyvoda obyema vtorogo parallelepipeda
        mybox2.volume();

        i =  mybox1.width +  mybox2.width;
        System.out.println("i = " + i);
    }
}
