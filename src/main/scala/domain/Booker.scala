package domain

case class Booker(flights: List[Flight]) {

  def search(itinerary: Itinerary): Option[List[Aircraft]] = {
    val aircrafts = flights.filter(_.itenary.equals(itinerary)).map(_.aircraft)
    if (aircrafts.isEmpty) None else Some(aircrafts)
  }
}
