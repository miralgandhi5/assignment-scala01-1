package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    myBinarySearch(array, 0, array.length - 1, elem)

  }

  def linearSearch(inputList: Array[Int], value: Int): Boolean = {

    for (elem: Int <- inputList) {
      if (elem == value) {
        return true
      }

    }
    false
  }

  private def myBinarySearch(inputList: Array[Int], left: Int, right: Int, value: Int): Boolean = {


    if (right >= left) {

      val middle: Int = left + (right - left) / 2
      if (inputList(middle) == value) {
        true
      }

      else if (inputList(middle) < value) {
        myBinarySearch(inputList, middle + 1, right, value)
      }
      else {
        myBinarySearch(inputList, left, middle - 1, value)
      }
    }
    else {
      false

    }

  }

}
