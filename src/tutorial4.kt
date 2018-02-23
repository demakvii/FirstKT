import kotlin.reflect.jvm.internal.impl.javax.inject.Inject

class Invoice {

}

class Empty

class Person constructor(firstName: String) {

}

class Person1(firstName: String) {

}

class Customer(firstName: String) {
	init {
		//logger.info("Customer initiatized with value ${name} ")
	}
}

class Customer1(name: String) {
	val customerKey = name.toUpperCase()
}

class Person2(val firstName: String, val lastName: String, var age: Int) {
	//
}

class Customer2 public @Inject constructor(name: String) {}

class Person3 {
	constructor(parent: Person3) {

	}
}

class Person4(name: String) {
	constructor(name: String, parent: Person4) : this(name) {
		//
	}
}

class Customer3(val customerName: String = "")

val invoice = Invoice()
val customer = Customer("mayur")

open class Base(p: Int)
class Derived(p: Int) : Base(p)

