fun main() {
    //IF
    val openHours = 7
    val now = 20
    val office: String
    office = if (now > openHours) {
        "Office already open"
    } else {
        "Office is closed"
    }

    println(office)
}