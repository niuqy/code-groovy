package java_code
/**
 * Created by abner on 7/14/15.
 */
class MyClass {
    def num
    def calc(Closure closure) {
        closure(num)
    }
    def calc(n, Closure closure) {
        closure(n)
    }
    def calc(n1, n2, Closure closure) {
        closure(n1, n2)
    }
}
