def translate(input: String): Array[String] = {
  var words = input.split(" /")
  var letters = words.map(item => item.split(" "))
  println(letters)
  letters.flatMap(_.toList)}
def goOverLetterCharacters(arrayElement:Array[String]): String ={
  var container:String = ""
  arrayElement.foreach(i=> container+=matchMorseLetter(i))
  container}
def matchMorseLetter(input:String): String =   input match {
  case ".-"  => "A"
  case "-..." => "B"
  case "-.-."  => "C"
  case "-.."  => "D"
  case "."  => "E"
  case "..-." => "F"
  case "--." => "G"
  case "...." => "H"
  case ".." => "I"
  case ".---" => "J"
  case "-.-" => "K"
  case ".-.." => "L"
  case "--" => "M"
  case "-." => "N"
  case "---" => "O"
  case ".--." => "P"
  case "--.-" => "Q"
  case ".-." => "R"
  case "..." => "S"
  case "-" => "T"
  case "..-" => "U"
  case "...-" => "V"
  case ".--" => "W"
  case "-..-" => "X"
  case "-.--" => "Y"
  case "--.." => "Z"
  case ".----" => "1"
  case "..---" => "2"
  case "...--" => "3"
  case "....-" => "4"
  case "....." => "5"
  case "-...." => "6"
  case "--..." => "7"
  case "---.." => "8"
  case "----." => "9"
  case "-----" => "0"
  case _ => " "}
goOverLetterCharacters(translate(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"))