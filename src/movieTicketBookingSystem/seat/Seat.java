package movieTicketBookingSystem.seat;

public class Seat {
    private final String id;//fixed
    private final int row;//fixed
    private final int column;//fixed
    private final SeatType type;//fixed
    private final double price;//fixed
    private SeatStatus status;// will change with time so can't declare final

    public Seat(String id, int row, int column, SeatType type, double price, SeatStatus status) {
        this.id = id;
        this.row = row;
        this.column = column;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public SeatType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public SeatStatus getStatus() {
        return status;
    }
}
