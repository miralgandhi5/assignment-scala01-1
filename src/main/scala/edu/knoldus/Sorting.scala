package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    myInsertionSort(array)
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    mySelectionSort(array, 0)
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    myBubbleSort(array)

  }

  private def myInsertionSort(inputList: Array[Int]): Array[Int] = {
    val indexList = 1 to inputList.length - 1

    for (index <- indexList) {
      val key = inputList(index)
      var j = index - 1
      while ((j >= 0) && (inputList(j) > key)) {
        inputList(j + 1) = inputList(j)
        j = j - 1
      }
      inputList(j + 1) = key

    }
    inputList

  }


  private def myBubbleSort(inputList: Array[Int]): Array[Int] = {


    for (index <- 0 until inputList.length) {
      for (j <- 0 until inputList.length - index - 1) {
        if (inputList(j) > inputList(j + 1)) {

          val temp = inputList(j)
          inputList(j) = inputList(j + 1)
          inputList(j + 1) = temp

        }
      }
    }
    inputList
  }

  private def mySelectionSort(inputList: Array[Int], startIndex: Int): Array[Int] = {

    if (startIndex >= inputList.length - 1) {
      return inputList
    }
    var minIndex = startIndex
    for (index <- startIndex until inputList.length) {

      if (inputList(index) < inputList(minIndex)) {
        minIndex = index
      }
    }

    val temp = inputList(startIndex)
    inputList(startIndex) = inputList(minIndex)
    inputList(minIndex) = temp
    mySelectionSort(inputList, startIndex + 1)

  }

}
