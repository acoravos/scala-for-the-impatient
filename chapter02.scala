package com.acoravos.scala.ch02

/** 
 * QUESTION 4: Write a Scala equivalent for the Java loop
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

/**
 * QUESTION 5: Write a procedure countdown(n: Int)
 * that prints the numbers from n to 0;
 */

object Ex05 extends App {

  def countdown(n: Int) = {
	for( i <- Range(n, 0, -1) )
		println(i)
}

countdown(10);

/**
 * QUESTION 6: Write a for loop for computing the product
 * of the Unicode codes of all letters in a string;
 */

object Ex06 extends App {

  def unicodeproduct(str: String) = {
	var result: Long = 1;
	for( characters <- str ) result *= characters.toLong
	result
}

println(unicodeproduct("Hello"));

/**
 * QUESTION 7: Solve the preceding exercise wihtout writing
 * a loop. Hint: Look at the StringOps ScalaDoc;
 */

object Ex07 extends App {

  // 1L is a long (twos complement integer) of 64 bits
  "Hello".foldLeft(1L)((a, b) => a * b)

}

/**
 * QUESTION 8: Write a function product(s : String) that
 * competes the product as described in the previous exercise;
 */

object Ex08 extends App {

  def product(s: String): Long = {
	"Hello".foldLeft(1L)((a, b) => a * b)
   }

product("Hello")

/**
 * QUESTION 9: Make the function of the preceding exercise
 * a recursive function;
 */

object Ex09 extends App {

  def productRecursive(s: String): Long = {
	if(s.length == 0) 1
	else s(0) * productRecursive(s drop 1)
   }

productRecursive("Hello")

 }

}
