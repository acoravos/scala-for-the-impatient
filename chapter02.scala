package com.acoravos.scala.ch02

/**
 * Write a Scala equivalent for the Java loop
 * for (int i = 10; i >= 0; i--) System.out.println(i);
 */

object Ex04 extends App {

  //With a range and reverse
  (0 to 10).reverse.foreach(println)

  //With a for loop
  for (i <- 10.to(0, -1)) println(i)

  //With a for loop with Range
  for (i <- Range(10,0, -1)) println(i)

}

// using a method

def countdown(n: Int) = {
	for( i <- Range(n, 0, -1) )
		println(i)
}

countdown(10);
