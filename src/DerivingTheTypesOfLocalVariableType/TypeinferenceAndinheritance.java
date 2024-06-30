package DerivingTheTypesOfLocalVariableType;

public class TypeinferenceAndinheritance
    {
        //вернуть некоторый тип объекта MyClass
        static Myclass getObj(int which)
            {
                switch (which)
                    {
                        case 0:
                            return new Myclass();
                        case 1:
                            return new FirstDerivedClass();
                        default:
                            return new SecondDerivedClass();
                    }
            }

        public static void main(String[] args)
            {
                // Несмотря на то что getObj () возвращает различные типы
                // объектов в иерархии наследования MyClass , объявленным
                // типом возвращаемого значения является MyClass .
                // В результате во всех трех показанных здесь случаях
                // предполагается, что типом переменных является MyClass,
                // хотя получаются разные производные типы объектов .
                var mc = getObj(0);
                var mc2 = getObj(1);
                var mc3 = getObj(2);

            }
    }
