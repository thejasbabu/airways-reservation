package domain

trait Seat {
  def isEmpty: Boolean
}

abstract class FlightSeat extends Seat {
  var passenger: Option[Passenger]

  def Seat(passenger: Option[Passenger]): Unit = this.passenger = passenger

  def isEmpty: Boolean = this.passenger.isEmpty
}
