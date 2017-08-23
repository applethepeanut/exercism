object Pangrams {
  def isPangram(input: String): Boolean = ('a' to 'z').forall(c => input.toLowerCase.contains(c))
}

