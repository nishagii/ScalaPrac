object CaesarCipher {


  def encryptCaesar(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }


  def decryptCaesar(ciphertext: String, shift: Int): String = {
    encryptCaesar(ciphertext, -shift)
  }

 
  def cipher(text: String, shift: Int, func: (String, Int) => String): String = {
    func(text, shift)
  }

  
  def main(args: Array[String]): Unit = {

    val plaintext = "Hello, World!"
    val shiftValue = 3


    val encryptedText = cipher(plaintext, shiftValue, encryptCaesar)
    println(s"Encrypted: $encryptedText")

  
    val decryptedText = cipher(encryptedText, shiftValue, decryptCaesar)
    println(s"Decrypted: $decryptedText")
  }
}
