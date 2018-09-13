package domain

case class FirstClassSeat(override var passenger: Option[Passenger]) extends FlightSeat {
}
