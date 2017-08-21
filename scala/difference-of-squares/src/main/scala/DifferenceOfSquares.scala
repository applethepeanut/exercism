object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = (1 to n).map(i => i * i).sum

  def squareOfSum(n: Int): Int = {
    val p = (1 to n).sum
    p * p
  }

  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)
}
