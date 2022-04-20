public class OOPfirst {
    public static void main(String[] args) {
        car bmw = new car();
        car holden = new car();

        bmw.setModel("X1");
        System.out.println("Model is "+ bmw.getModel());

        holden.setModel("Commodore");
        System.out.println("Model is "+ holden.getModel());
    }
}

