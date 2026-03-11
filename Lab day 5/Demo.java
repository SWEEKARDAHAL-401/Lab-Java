// Illustrate the execution of constructors in multi-level inheritance with three
// Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
// where box inherits from plate and woodbox inherits from box class. Each class has constructor where
// dimensions are taken from user.

class Plate{
    int lenght,width;
    Plate(int l, int w) {
        this.lenght = l;
        this.width = w;
        System.out.println("Length = "+lenght+" Width = "+width);
    }
}
class Box extends Plate {
        int heigth;
        Box(int l, int w, int h) {
        super(l, w);
        heigth = h;
        System.out.println("Height =" +heigth);
    }
}
    

public class Demo {
    public static void main(String [] args) {
        Box b = new Box(10,20,30);
    }
}


 