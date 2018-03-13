// Analog klassa Box, zdes primenyaetsya metod s parametrami
public class Box3 {
    double width;
    double height;
    double depth;

    //raschityvaem i vozvraschaem obyem
    double volume() {
        return width * height * depth;
    }

    //prinimaem zadavaemye razmery parallelepipeda
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
