public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15789;
        System.out.println("Цена билета" + ticketPrice);
        int oneMili = 20;
        int bonusMiles = (ticketPrice / oneMili);
        System.out.println("Итого бонусных милей" + bonusMiles);

    }
}