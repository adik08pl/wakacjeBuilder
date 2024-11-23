public class Main {
    public static void main(String[] args) {
        Holidays vacation = new Holidays.Builder("Grecja", 7)
                .withHotel("Hotel Athens")
                .withTransport("Samolot")
                .withInsurance()
                .withOptionalTrips("Wycieczka do ruin")
                .build();
    }
}