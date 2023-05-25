import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fibonacciview.R

class NumbersRvAdapter(numbers: List<Int>)
class Numbersrvadapter (var numbersList:List<String>): RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_item,parent,false)
        return NumbersViewHolder(itemView)

    }


    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        var currentNumber = numbersList.get(position)
        holder.tvNumber.text=currentNumber


    }

    override fun getItemCount(): Int {
        return numbersList.size

    }

}
class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumber =itemView.findViewById<TextView>(R.id.text)


}