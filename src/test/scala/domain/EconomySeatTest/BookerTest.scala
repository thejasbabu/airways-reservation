package domain.EconomySeatTest

import domain.AircraftTypes.BoeingTripleSeven
import domain.{Booker, Flight, Itinerary}
import org.scalatest.{FlatSpec, Matchers}

class BookerTest extends FlatSpec with Matchers {
  "Booker" should "return None when there are no matching flights" in {
    val bngToHyd = Itinerary("BNG", "HYD", "08:20", "11:00")
    val flights = List[Flight](Flight(bngToHyd, BoeingTripleSeven(null)))
    val booker = Booker(flights)

    val bngToChn = Itinerary("BNG", "CHN", "16:45", "19:30")
    val matchingFlights = booker.search(bngToChn)
    matchingFlights shouldBe None
  }

  "Booker" should "returns a list of matching flight when there are matches" in {
    val bngToHyd = Itinerary("BNG", "HYD", "08:20", "11:00")
    val puneToHyd = Itinerary("PNY", "HYD", "12:20", "14:30")
    val flights = List[Flight](Flight(bngToHyd, BoeingTripleSeven(null)), Flight(puneToHyd, BoeingTripleSeven(null)))
    val booker = Booker(flights)

    val matchingFlights = booker.search(bngToHyd)
    matchingFlights.isDefined shouldBe true
    val matchingFlight = matchingFlights.get
    matchingFlight.size shouldBe 1
    matchingFlight.head shouldBe BoeingTripleSeven(null)
  }
}
