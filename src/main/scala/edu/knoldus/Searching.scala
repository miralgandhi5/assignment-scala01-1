package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
   binarySearch(array,0,array.length-1,elem)

  }

  def linearSearch(inputList: Array[Int], value: Int): Boolean = {

    for (elem: Int <- inputList) {
      if (elem == value) {
        return true
      }

    }
    false
  }

  private def binarySearch(inputList:Array[Int], left: Int , right: Int, value: Int ): Boolean = {

    val middle: Int = (left + right) / 2
    if (right >= left) {
      if (inputList(middle) == value) {
        return true
      }
      else if (inputList(middle) > value) {
        binarySearch(inputList, middle + 1 ,right, value)
      }
      else {
        binarySearch(inputList, left , middle - 1, value)
      }
    }
    false
  }

}
