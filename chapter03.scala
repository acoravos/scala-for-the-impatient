// Q1: Write a code snippet that sets a to an array
// of n random integers between 0 (inclusive) and n (exclusive)

var a = new Array[Int](10)
for(i <- 0 until a.length) a(i) = scala.util.Random.nextInt(10)
a   
