package p02;

public class BeginnerExcersice {
        public static void main (String[] args){
            // 1. Declara una variable de tipo String y asígnale tu nombre.
            String myName = "Violeta";
            System.out.println(myName);
            // 2. Crea una variable de tipo int y asígnale tu edad.
            int myAge = 30;
            System.out.println(myAge);
            // 3. Crea una variable double con tu altura en metros.
            double myHeight = 1.59;
            System.out.println(myHeight);
            // 4. Declara una variable de tipo boolean que indique si te gusta programar.
            boolean coding = true;
            System.out.println(coding);
            // 5. Declara una constante con tu email.
            final String myEmail = "marcarv@gmail.com";
            System.out.println(myEmail);
            // 6. Crea una variable de tipo char y guárdale tu inicial.
            char myInitial = 'V';
            System.out.println(myInitial);
            // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
            String myTown = "Dúrcal";
            System.out.println(myTown);
            myTown = "Churriana";
            System.out.println(myTown);
            // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
            int a = 2;
            int b = 3;
            int c = a + b;
            System.out.println(c);
            // 9. Imprime el tipo de dos variables creadas anteriormente.
            System.out.println(myEmail.getClass().getSimpleName());
            System.out.println(myTown.getClass().getSimpleName());
            // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
            int firstInt;
            firstInt = 10;
            System.out.println(firstInt);
        }
}
