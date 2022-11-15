package com.example.passportotabekaka.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.passportotabekaka.databinding.ItemRvBinding
import com.example.passportotabekaka.models.MyData
import com.example.passportotabekaka.models.User

class MyRvAdapter(val list: List<User>):RecyclerView.Adapter<MyRvAdapter.Vh>() {

    inner class Vh(var itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){

        fun onBind(user: User){
            itemRvBinding.imageTv.setImageURI(Uri.parse(MyData.path))
            itemRvBinding.tvSurname.text = user.surname
            itemRvBinding.tvName.text = user.name
            itemRvBinding.tvBirthday.text = user.birthday
            itemRvBinding.tvSeries.text = user.series
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
       return list.size
    }
}