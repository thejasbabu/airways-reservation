package domain.EconomySeatTest

import domain.{EconomySeat, Passenger}
import org.scalatest.{FlatSpec, Matchers}

class EconomySeatTest extends FlatSpec with Matchers {
  "EconomySeat" should "not be empty if there is a Passenger" in {
    val seat = EconomySeat(Some(Passenger("Test", 25, "M", null)))
    seat.isEmpty shouldBe false
  }

  "EconomySeat" should "be empty if there is no Passenger" in {
    val seat = EconomySeat(None)
    seat.isEmpty shouldBe true
  }
}
