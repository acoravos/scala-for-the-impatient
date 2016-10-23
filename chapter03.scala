// Q1: Write a code snippet that sets a to an array
// of n random integers between 0 (inclusive) and n (exclusive)
import util.Random

var a = new Array[Int](10) 
for(i <- 0 until a.length) a(i) = Random.nextInt(10)
a 

// Q2: Write a loop that swaps adjacent elements of an array of
// integers. For example, Array (1,2,3,4,5) becomes Array(2,1,4,3,5)

for (elem <- arr) 
