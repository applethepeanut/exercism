class School {
  type DB = Map[Int, Seq[String]]

  private var data: DB = Map.empty

  def add(name: String, g: Int) {
    val students = data.getOrElse(g, Seq.empty[String]) ++ Seq(name)
    data = data.updated(g, students)
  }

  def db: DB = data

  def grade(g: Int): Seq[String] = ???

  def sorted: DB = ???
}
