// V etoy programme obyavlyayutsa dva obyekta klassa Box
class BoxDemo2 {
    public static void main(String[] args){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // prisvaivaem znacheniya peremennym ekzemplyara mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // prisvaivaem znacheniya peremennym ekzemplyara mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // raschityvaem obyem pervogo parallepipeda
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Obyem1 raven " + vol);

        // raschityvaem obyem vtorogo parallepipeda
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Obyem2 raven " + vol);
    }
}
