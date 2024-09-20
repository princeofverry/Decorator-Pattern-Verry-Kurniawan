// Interface dasar untuk tiket bioskop
interface MovieTicket {
    String getDescription();
    double getCost();
}

// Kelas dasar untuk tiket bioskop tanpa tambahan
class BasicMovieTicket implements MovieTicket {

    @Override
    public String getDescription() {
        return "Basic Movie Ticket";
    }

    @Override
    public double getCost() {
        return 10.0; // Harga dasar tiket
    }
}

// Dekorator dasar yang mengimplementasikan MovieTicket dan memiliki referensi ke objek MovieTicket
class TicketDecorator implements MovieTicket {
    protected MovieTicket decoratedTicket;

    public TicketDecorator(MovieTicket ticket) {
        this.decoratedTicket = ticket;
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedTicket.getCost();
    }
}

// Dekorator untuk menambahkan popcorn
class PopcornDecorator extends TicketDecorator {

    public PopcornDecorator(MovieTicket ticket) {
        super(ticket);
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription() + ", Popcorn";
    }

    @Override
    public double getCost() {
        return decoratedTicket.getCost() + 5.0; // Tambahan harga untuk popcorn
    }
}

// Dekorator untuk menambahkan minuman
class DrinkDecorator extends TicketDecorator {

    public DrinkDecorator(MovieTicket ticket) {
        super(ticket);
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription() + ", Drink";
    }

    @Override
    public double getCost() {
        return decoratedTicket.getCost() + 3.0; // Tambahan harga untuk minuman
    }
}

// Dekorator untuk menambahkan snack (makanan ringan)
class SnackDecorator extends TicketDecorator {

    public SnackDecorator(MovieTicket ticket) {
        super(ticket);
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription() + ", Snack";
    }

    @Override
    public double getCost() {
        return decoratedTicket.getCost() + 4.0; // Tambahan harga untuk snack
    }
}

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membeli tiket bioskop biasa
        MovieTicket ticket = new BasicMovieTicket();
        System.out.println(ticket.getDescription() + " $" + ticket.getCost());

        // Menambahkan popcorn ke tiket bioskop
        ticket = new PopcornDecorator(ticket);
        System.out.println(ticket.getDescription() + " $" + ticket.getCost());

        // Menambahkan minuman ke tiket bioskop yang sudah ada popcorn
        ticket = new DrinkDecorator(ticket);
        System.out.println(ticket.getDescription() + " $" + ticket.getCost());

        // Menambahkan snack ke tiket bioskop yang sudah ada popcorn dan minuman
        ticket = new SnackDecorator(ticket);
        System.out.println(ticket.getDescription() + " $" + ticket.getCost());
    }
}
