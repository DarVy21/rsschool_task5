package subtask3

class BillCounter {

    private var sum=0
    private var count=0

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
       for (i in bill.indices){
           if (i!=k){
               sum+=bill[i]
           }
       }
        count=sum/2
        if(count!=b)return (b-count).toString()
        else return "Bon Appetit"

    }
}
