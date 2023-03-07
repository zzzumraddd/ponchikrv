package uz.itschool.foodee

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.foodee.databinding.CategoryItemBinding

class Category_Adapter(var list :Array<CategoryFood>): RecyclerView.Adapter<Category_Adapter.Category_Holder>() {
    class Category_Holder(binding: CategoryItemBinding): RecyclerView.ViewHolder(binding.root){

        var name = binding.textView
        var card = binding.cardView
        var image = binding.imageView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Category_Holder {
        return Category_Holder(CategoryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: Category_Holder, position: Int) {
        holder.name.text = list.get(position).n
        holder.image.setImageResource(list.get(position).photo)
        holder.card.setBackgroundColor(list.get(position).color)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}