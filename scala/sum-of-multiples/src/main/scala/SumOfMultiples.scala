import scala.annotation.tailrec

object SumOfMultiples {

  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {

    @tailrec
    def s(l: Int, acc: Int): Int =
      if (l == limit) acc
      else if (factors.exists(l % _ == 0)) s(l + 1, acc + l)
      else s(l + 1, acc)

    s(1, 0)
  }
}

