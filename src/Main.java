public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Using a class that implements Functional Interface
        Casio c1 = new Casio();
        System.out.println(c1.add(10,20));


        //Using Anonymous Class that implements Functional Interface
        Calculator Orpat = new Calculator() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        };
        System.out.println(Orpat.add(15, 20));


        //Using Lambda Expression
        Calculator newCasio = (x, y)-> (x+y);
        System.out.println(newCasio.add(10, 30));

    }
}