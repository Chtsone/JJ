package Delegate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
    {
        private static final String RIDER = "Sania";
        public static void main(String[] args)
            {
                CarController controller = new CarController(new MazdaCar());
                CarController controller1 = new CarController(new ToyotaCar());
                controller.ride(RIDER);
                controller1.ride(RIDER);

            }
    }