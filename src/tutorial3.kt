fun main(args: Array<String>) {
	var a = 20
	var b = 10
	var max = a
	if (b > a) max = b
	println(max)

	var max1: Int

	if (a > b) {
		max1 = a
	} else {
		max1 = b
	}

	println(max1)


	var max2 = if (a > b) a else b

	println(max2)
	
	var max3 = if (a>b){
		print("Choose a :")
		a
	} else{
		print("Choose b :")
		b
	}
	
	println(max3)
	
	var x = 1
	when(x){
		1-> println("x==1")
		2-> println("x==2")
		else ->{
			println("x is neither 1 nor 2")
		}
	}
	
	when(x){
		0,1 -> println("x==0  or x==1")
		else -> println("otherwise")
	}
	
	when(x){
		in 1..10 -> println("x is in range of 1 to 10")
		!in 11..20 -> println("x is outside the range")
		else -> println("none of the above")  
	}
	
	println(hasPrefix("prefix1"))
	
	val array = intArrayOf(1,2,3,4,5)
	
	for(item in array) print(item)
	
	for(i in array.indices)
		println(array[i])
	
	for((index,value) in array.withIndex() )
		println("Element at $index is $value")
	
	val valX = 10;
	println("Before valX")
	while(valX>0){
		//valX--; cannot reassign in val
	}
	
}
fun hasPrefix(x : Any)= when(x){
	is String -> x.startsWith("prefix")
	else -> false
}