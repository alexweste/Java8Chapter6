// V dannoy programme sozdaetsya obyekt mybox (parallelipiped) i vychislyaetsa ego obyem
class MyBox {
    public static void main(String[] args){
        Box mybox = new Box();
        double vol; // zadaem peremennuyu, v kotoruyu budet pomeschatsa resultat vychisleniya
                    // obyema parallelipipeda

        // zadaem znacheniya dlya peremennyh ekzemplyara(obyekta) mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth =15;

        //raschityvaem obyem parallelipipeda
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Obyem raven " + vol);
    }
}
