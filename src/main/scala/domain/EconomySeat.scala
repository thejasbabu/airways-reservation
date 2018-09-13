package domain

case class EconomySeat(override var passenger: Option[Passenger]) extends FlightSeat {
}
