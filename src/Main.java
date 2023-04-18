public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15689;
        System.out.println(" Цена билета " + ticketPrice + " рублей ");
        int oneMili = 20;
        int bonusMiles = (ticketPrice / oneMili);
        System.out.println(" Итого бонусных милей " + bonusMiles);
    }
}