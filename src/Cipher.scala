object Cipher extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val key = 1
    val singlechar = 'A'
    val wordString:String = "frosty"

    val Encription = (alphabet:String , key:Int , singlechar:Char ) => alphabet.charAt((alphabet.indexOf(singlechar) + key) % alphabet.size)

    val Decription = (alphabet:String , key:Int , singlechar:Char ) => alphabet.charAt((alphabet.indexOf(singlechar) - key + 26) % alphabet.size)

    val chiper = (f: (String , Int , Char) => Char , a:String , k:Int , s:String ) => s.map( x => f( a , k , x.toUpper ) )

    val encripted = chiper(Encription , alphabet , key , wordString)

    val decripted = chiper(Decription , alphabet , key , encripted)

    println(encripted)

    println(decripted)



}
