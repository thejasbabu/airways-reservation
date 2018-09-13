package domain

case class FirstClassSeat(passenger: Option[Passenger]) extends FlightSeat(passenger) {
}
