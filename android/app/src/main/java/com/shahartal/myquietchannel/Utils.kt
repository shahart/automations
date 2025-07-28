package com.shahartal.myquietchannel

object Utils {

    fun getYY(no: Int): String {
        var input = no
        val letters = arrayOf("ה'","ד'","ג'","ב'","א'","ת","ש","ר","ק","צ","פ","ע","ס","נ","מ","ל","כ","י","ט","ח","ז","ו","ה","ד","ג","ב","א")
        val values = arrayOf(5000,4000,3000,2000,1000,400,300,200,100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1)
        var output = "";
        while (input > 0) {
            for (i in 0..letters.size) {
                if (input == 16) {
                    return output + "טז"
                }
                if (input == 15) {
                    return output + "טו"
                }
                if (input >= values[i]) {
                    input -= values[i]
                    output += letters[i]
                    break
                }
            }
        }
        return output
    }
}