public class Main{
    public static void main(String[] args) {
        Feeder f = new Feeder();
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        System.out.println(Math.random());
        int random = (int)(Math.random() * 10 + 1);
        System.out.println(random);
        System.out.println(Math.random() < 0.05);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
    }
}