import scala.io.StdIn._

object StudentRecordManager {
  
  def calculatePercentageAndGrade(marks: Int, totalMarks: Int): (Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    (percentage, grade)
  }


  def printStudentRecord(studentInfo: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = studentInfo
    println(s"Student Name: $name")
    println(s"Marks: $marks / $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }


  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || totalMarks <= 0 || marks > totalMarks) {
      (false, Some("Marks must be positive integers and cannot exceed total marks."))
    } else {
      (true, None)
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')
    
    while (!isValid) {
      println("Enter student's name:")
      val name = readLine().trim
      
      println("Enter student's marks:")
      val marks = readInt()
      
      println("Enter total possible marks:")
      val totalMarks = readInt()
      
      val (valid, errorMessage) = validateInput(name, marks, totalMarks)
      
      if (valid) {
        val (percentage, grade) = calculatePercentageAndGrade(marks, totalMarks)
        studentInfo = (name, marks, totalMarks, percentage, grade)
        isValid = true
      } else {
        println(errorMessage.get)
      }
    }
    
    studentInfo
  }

  def main(args: Array[String]): Unit = {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }
}
