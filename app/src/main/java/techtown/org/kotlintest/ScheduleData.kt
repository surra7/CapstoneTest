package techtown.org.kotlintest

import java.io.Serializable

data class ScheduleData (
    val name : String,
    val time : String,
    //val img : Int
): Serializable