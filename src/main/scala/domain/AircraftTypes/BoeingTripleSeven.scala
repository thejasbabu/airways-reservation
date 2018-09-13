package domain.AircraftTypes

import domain.{Aircraft, FlightSeatLayout}

case class BoeingTripleSeven(override val seatLayout: FlightSeatLayout) extends Aircraft{}
