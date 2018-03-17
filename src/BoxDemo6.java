// sozdaem obyekty mybox1 i mybox2, i raschityvaem ih obyemy
class BoxDemo6 {
    public static void main(String[] args){
        //inicializiruem obyekty tipa Box4
        Box4 mybox1 = new Box4();
        Box4 myboz2 = new Box4();

       // double vol;

        // poluchaem obyem pervogo parallelepipeda
        System.out.println("Obyem 1 raven:" + mybox1.volume());

        // poluchaem obyem vtorogo parallelepipeda
        System.out.println("Obyem 2 raven:" + mybox1.volume());
    }
}
