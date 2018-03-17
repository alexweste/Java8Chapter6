// v klasse Box5 primenyaem parametrizovanniy konstruktor
class Box5 {
    double width;
    double height;
    double depth;

    // sozdaem konstruktor klassa Box5
    Box5(double w, double h, double d) {
        width = w;
        height = h;
        depth= d;
    }

    // rasschityvaem i vozvraschaem obyem
    double volume(){
        return width * height * depth;

    }
}
