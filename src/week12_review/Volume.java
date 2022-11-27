package week12_review;

public interface Volume {

    boolean HAS_VOLUME = true;  // static & final

    double calc_volume();

     static void shapesWithVolume(){
        System.out.println("ONLY the three dimensional shapes has volume ");
    }

    default void method1(){
        System.out.println("instance method of the child classes");
    }

}
