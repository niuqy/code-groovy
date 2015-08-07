package other

import java_code.MyDate
import java_code.Song

/**
 * Created by abner on 7/15/15.
 */
class SongExample {
    static void main(args){
        def sng = new Song(name:"Le Freak",artist:"Chic", genre:"Disco")
        def sng2 = new Song(name:"Kung Fu Fighting")
        def sng3 = new Song()
        sng3.name = "Funkytown"
        sng3.artist = "Lipps Inc."
        sng3.setGenre("Disco")

        println sng.genre

        //involk java class
        def date = new MyDate();
        println date.whatDayToday()
    }
}
