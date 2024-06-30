package DynamicBinding;

import Delegate.CarController;
import Delegate.MazdaCar;
import Delegate.ToyotaCar;

public class Main
    {
        public static void main(String[] args)
            {
             Animal animal = new Animal();
             Animal dog = new Dog();
             Animal cat = new Cat();
             Dog shibuInu = new ShibaInu();
             Cat british = new British();

             animal.poop();
             dog.poop();
             cat.poop();
             shibuInu.poop();
             british.poop();
            }
    }
