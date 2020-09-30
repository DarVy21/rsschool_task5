package subtask2


class MiniMaxSum {

  private  val outArray: IntArray = IntArray(2)
    private var max=0
    private var min=0

    fun getResult(input: IntArray): IntArray {

        input.sort()
        for (i in 0 until input.size-1){
            min+=input[i]
        }
        for (i in 1 until input.size){
            max+=input[i]
        }
        outArray[0]=min
        outArray[1]=max
        return outArray
    }
}
