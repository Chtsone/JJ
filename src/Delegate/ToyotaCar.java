package Delegate;

public class ToyotaCar implements Car
    {
        @Override
        public void ride(String name)
            {
                System.out.println(name + " rides in Toyota");
            }
    }
