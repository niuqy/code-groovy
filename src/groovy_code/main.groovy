package groovy_code

import java_code.Hello
import java_code.MyClass

/**
 * Created by abner on 7/14/15.
 */
Hello hello = new Hello()
hello.helloWorld();

MyClass myClass = new MyClass(num:3);
myClass.calc { x ->
    println x * x
}
myClass.calc(5){x ->
    println(x*x)
}
myClass.calc(6,7){x,y ->
    println x*y
}
