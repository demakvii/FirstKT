fun main(args: Array<String>) {
	val oneMillion = 1_000_000
	val a : Int = 1000
	println(a==a)
	val boxedA : Int? = a
	val anotherBoxedA  : Int? = a
	println(boxedA===anotherBoxedA)
	
	println(oneMillion)
	
	val b1 : Byte  = 1
	var c1 : Int = b1.toInt();
	println(c1)
	
	val l = 1L + 3
	println(l);
	var y = 0x000FF000
	val x = (1 shl 2) and y
	println(x)
	println(y.inv())

	val asc = Array(5,{i->(i*i).toString()})
	println(asc[0]);
	
	val x1 : IntArray=intArrayOf(1,2,3)
	x1[0] = x1[1] + x1[2]
	println(x1[0]);
	//String
	val s = "String";
	for(c in s){
		println(c)
	}
	//String literals
	var s1 = "Hello, world!\n"
	println(s1)
	
	var text = """
			for(c in "foo")
				print(c)
 	""".trimMargin()	
	println(text)
	 
	//String Template
	val i1 = 10
	val s2 = "i = $i1"
	println(s2)
	
	

}