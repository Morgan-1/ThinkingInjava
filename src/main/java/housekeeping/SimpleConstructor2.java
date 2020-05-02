package housekeeping;

/**
 * @ClassName: SimpleConstructor2
 * @description: SimpleConstructor2
 * @author: huangyunhui
 * @create: 2020-04-30 11:44
 **/

class Rock2 {
    Rock2(int i) {
        System.out.println("Rock  " + i + "  ");
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args ) {
        for (int i = 0; i< 8; i++) {
            new Rock2(i);
        }
    }
}
