package java_code

/**
 * Created by abner on 7/15/15.
 */
class Song {
    def name
    def artist
    def genre

    def  String toString(){
        "${name},${artist},${genre}"
    }

    def getGenre(){
//        genre.toUpperCase()
        genre?.toLowerCase()
    }
}
