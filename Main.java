public class Main{
    public static void main(String[] args) {
        Feeder a = new Feeder(1000);
        a.simulateOneDay(22);
        System.out.println(a);
        Feeder b = new Feeder(500);
        b.simulateOneDay(12);
        System.out.println(b);
        Feeder d = new Feeder(100);
        d.simulateOneDay(5);
        System.out.println(d);
        Feeder p = new Feeder(250);
        System.out.println(p.simulateManyDays(10,5));
        Feeder k = new Feeder(0);
        System.out.println(k.simulateManyDays(5,10));
        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));
    }
}