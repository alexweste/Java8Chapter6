// analog klassa Box, tolko vmesto pechati obyema vozvraschaet ego znachenie nazad v vyzyvayuschuyu
// programmu
class Box2 {
    double width;
    double height;
    double depth;

    //raschitat i vozvratit obyem
    double volume() {
        return width * height * depth;
    }
}
