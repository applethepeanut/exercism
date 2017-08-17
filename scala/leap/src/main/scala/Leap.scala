object Leap {
  def leapYear(year: Int): Boolean = {

    val divisibleBy4 = year % 4 == 0
    val divisibleBy100 = year % 100 == 0
    val divisibleBy400 = year % 400 == 0

    if(divisibleBy4) {
      if(divisibleBy100 && !divisibleBy400) false
      else true
    } else false
  }
}
