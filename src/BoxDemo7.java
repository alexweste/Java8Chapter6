// sozdaem programmu po raschetu obyema parallelepipedov, sozdannyh s pomoschyu klassa Box5
// s parametrizovannym konstruktorom;
// zdes primenena inicializaciya razmerov
public class BoxDemo7 {
    public static void main(String[] args){
        //obyavlyaem, vydelyaem pamat i inicializiruem obyekty tipa Box5
        Box5 mybox1 = new Box5(3, 4, 6);
        Box5 mybox2 = new Box5(4, 5, 23);
        Box5 mybox3 = new Box5(32, 40, 34);

        //vyvodim obyem pervogo parallelepipeda
        System.out.println("Obyem 1 raven: " + mybox1.volume());

        //vyvodim obyem vtorogo parallelepipeda
        System.out.println("Obyem 2 raven: " + mybox2.volume());

        //vyvodim obyem tretego parallelepipeda
        System.out.println("Obyem 3 raven: " + mybox3.volume());
    }

}
