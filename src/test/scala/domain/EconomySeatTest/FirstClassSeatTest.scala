package domain.EconomySeatTest

import domain.{FirstClassSeat, Passenger}
import org.scalatest.{FlatSpec, Matchers}

class FirstClassSeatTest extends FlatSpec with Matchers {
  "FirstClassSeat" should "not be empty if there is a Passenger" in {
    val seat = FirstClassSeat(Some(Passenger("Test", 25, "M", null)))
    seat.isEmpty shouldBe false
  }

  "FirstClassSeat" should "be empty if there is no Passenger" in {
    val seat = FirstClassSeat(None)
    seat.isEmpty shouldBe true
  }

}
