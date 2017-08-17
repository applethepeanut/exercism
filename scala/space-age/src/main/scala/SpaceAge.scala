import scala.math.BigDecimal
import scala.math.BigDecimal.RoundingMode

case class SpaceAge(seconds: Long) {

  private def rounded(d: Double, r: BigDecimal.RoundingMode.Value) = BigDecimal(d).setScale(2, r).toDouble

  val onEarth = rounded(seconds / 31557600.00, RoundingMode.HALF_UP)
  val onMercury = rounded(onEarth / 0.2408467, RoundingMode.HALF_UP)
  val onVenus = rounded(onEarth / 0.61519726, RoundingMode.FLOOR)
  val onMars = rounded(onEarth / 1.8808158, RoundingMode.HALF_UP)
  val onJupiter = rounded(onEarth / 11.862615, RoundingMode.HALF_UP)
  val onSaturn = rounded(onEarth / 29.447498, RoundingMode.HALF_UP)
  val onUranus = rounded(onEarth / 84.016846, RoundingMode.HALF_UP)
  val onNeptune = rounded(onEarth / 164.79132, RoundingMode.HALF_UP)
}
