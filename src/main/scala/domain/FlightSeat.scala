package domain

abstract class FlightSeat(passenger: Option[Passenger]) {
  def isEmpty: Boolean = this.passenger.isEmpty
}
