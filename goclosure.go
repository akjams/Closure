package main

import (
  "fmt"
)

func main() {
  c1 := makeCounter()
  c2 := makeCounter()
  
  fmt.Printf("c1: %d\n", c1());
  fmt.Printf("c2: %d %d %d\n", c2(), c2(), c2());
  fmt.Printf("c1: %d %d\n", c1(), c1());
}

func makeCounter() func() int {
  var count int
  
  incrementAndGet := func() int {
    count++
    return count
  }
  return incrementAndGet
}