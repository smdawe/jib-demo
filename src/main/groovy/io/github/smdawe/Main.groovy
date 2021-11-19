package io.github.smdawe

class Main {

  static void main(args) {
    15.times {
      println message()
      Thread.sleep(1_000)
    }
  }

  static String message() {
    UUID.randomUUID().toString()
  }

}