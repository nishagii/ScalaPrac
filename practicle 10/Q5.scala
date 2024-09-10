object LetterCounter {

  def countLetterOccurrences(words: List[String]): Int = {
   
    val wordLengths = words.map(_.length)
    
    wordLengths.reduce((a, b) => a + b)
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalOccurrences = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalOccurrences")
  }
}
