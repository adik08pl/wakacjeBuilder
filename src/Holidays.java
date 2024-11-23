public class Holidays {
    String location;
    int days;
    String hotel;
    String transport;
    String optionalTrips;
    boolean insurance;

    private Holidays(Builder builder) {
        this.location = builder.location;
        this.days = builder.days;
        this.hotel = builder.hotel;
        this.transport = builder.transport;
        this.optionalTrips = builder.optionalTrips;
        this.insurance = builder.insurance;
    }
    public static class Builder{
        String location;
        int days;
        String hotel;
        String transport;
        String optionalTrips;
        boolean insurance = false;
        public Builder(String location,int days){
            this.location = location;
            this.days = days;
        }
        public Builder withHotel(String hotel){
            this.hotel = hotel;
            return this;
        }
        public Builder withTransport(String transport){
            this.transport = transport;
            return this;
        }
        public Builder withOptionalTrips(String optionalTrips){
            this.optionalTrips = optionalTrips;
            return this;
        }
        public Builder withInsurance(){
            this.insurance = true;
            return this;
        }
        public Holidays build(){
            return new Holidays(this);
        }
    }
}
