package at.ac.fhstp.gof.prototype;

public class App {
    public static void main(String[] args) {
        try {
            String moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(moviePrototype);

            String albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumPrototype);

            String showPrototype = PrototypeFactory.getInstance(ModelType.SHOW).toString();
            System.out.println(showPrototype);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
