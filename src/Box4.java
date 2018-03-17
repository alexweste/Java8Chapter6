// ispolzuem konstruktor Box4
class Box4 {
    double width;
    double height;
    double depth;

    // sozdaem konstruktor Box4
    Box4(){
        System.out.println("Konstruirovanie obyekta Box4");
        width = 10;
        height =10;
        depth = 10;
    }
    // raschityvaem i vozvraschaem obyem parallelepipeda
    double volume(){
        return width * height * depth;
    }
}
