package domain

case class EconomySeat(passenger: Option[Passenger]) extends FlightSeat(passenger) {
}
