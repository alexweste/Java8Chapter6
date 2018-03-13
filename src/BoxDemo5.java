// V etoy programme ekzemplyaru Box3 peredayutsya argumenty width, height, depth v vide
// chislovyh znacheniy
class BoxDemo5 {
    public static void main(String[] args){
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        // inicializiruem oba ekzemplyara klassa Box3
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(4, 5, 2);

        // poluchaem i vyvodim obyem pervogo parallelepipeda
        System.out.println("Obyem 1 raven " + mybox1.volume());

        // poluchaem i vyvodim obyem vtorogo parallelepipeda
        System.out.println("Obyem 2 raven " + mybox2.volume());
    }
}
