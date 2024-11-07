///*พิธีไหว้ครู 20241104*/
//fun main() {
//    println("Hello kotlin")
//}
///*ตัวแปร 20241104*/
//fun main(){
//    val name="Cable"
//    var location:String="Thailand"
//    var score:Int=10
//    val GPA:Float=3.95F
//    var gpa=3.44F
//    var gender:Char='M'
//    println("Name : ${name}")
//    println("Location : ${location}")
//    println("My GPA is ${GPA} and my gpa is ${gpa}")
//    println("Gender : ${gender}")
//}
///*คำนวน 20241105*/
//fun main(){
//    val name="Cable"
//    val GPA:Float=3.95F
//    val gpa=3.44F
//    var height=1.9F
//    var weight=70
//    println("Name : $name")
//    println("my total GPA is ${GPA+gpa}")
//    println("height=$height m")
//    println("weight=$weight kg")
//    println("body mass index is ${weight/(height*height)}")
//    println("-----------------------")
//    println("legend question 2+2*2")
//    println("2+2*2 = ${2+2*2} or (2+2)*2 = ${(2+2)*2}")
//    println("just basic math for now.")
//}
/*Control flow if คำนวนเกรดอย่างง่ายมาก ๆ แสดงค่าเป็น println 20241107*/
fun main(){
    var score=75
        if (score >= 90) {
            println("A")
        } else if (score >= 80) {
            println("B")
        } else if (score >= 70) {
            println("C")
        } else if (score >= 60) {
            println("d")
        } else {
            println("F")
        }
}
