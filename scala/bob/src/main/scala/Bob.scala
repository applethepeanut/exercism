object Bob {
  def response(statement: String): String = {
    val stm = statement.trim

    if (stm.isEmpty) "Fine. Be that way!"
    else if (statement.toUpperCase == statement && statement.toLowerCase != statement) "Whoa, chill out!"
    else if (stm.endsWith("?")) "Sure."
    else "Whatever."
  }
}
