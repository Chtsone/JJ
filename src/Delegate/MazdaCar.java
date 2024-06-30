package Delegate;

public class MazdaCar implements Car
    {
        @Override
        public void ride(String name)
            {
                System.out.println(name + " rides in Mazda");
            }
    }
