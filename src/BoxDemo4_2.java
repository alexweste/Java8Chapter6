// Metod volume() vozvraschaet obyem parallelepipeda
// metod volume() berem iz klassa Box2
// V dannoy programme otsutstvuet peremennaya vol
class BoxDemo4_2 {
    public static void main(String[] args){
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        //double vol;

        //prisvaiem znacheniya peremennym ekzemplyara mybox1
        mybox1.width =10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //prisvaivaem znacheniya peremennym ekzemplyara mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //poluchaem obyem pervogo parallelepipeda
        //vol = mybox1.volume();
        System.out.println("Obyem 1 obyekta raven " + mybox1.volume());

        //poluchaem obyem vtorogo parallelepipeda
        //vol = mybox2.volume();
        System.out.println("Obyem 2 obyekta raven " + mybox2.volume());
    }
}
