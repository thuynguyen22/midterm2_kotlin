package com.example.midterm_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

//class FoodAdapter(var mCtx: Context, var resources:Int, var items: Int): ArrayAdapter<Food>(mCtx, resources, items){
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
//        val view: View = layoutInflater.inflate(resources, null)
//
//        val imageView:ImageView = view.findViewById(R.id.foodImage)
//        val titleView:TextView = view.findViewById(R.id.foodName)
////        var mItem: Food = items.get(position)
//        val mItem: Food = items[position]
//        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.foodImage))
//        titleView.text = mItem.foodName
//        return view
//    }
//}
class FoodAdapter (var context : Context, var arrayFoods : ArrayList<Food>) : BaseAdapter() {

    class ViewHolder(row: View) {
        var textviewfoodname: TextView
        var imageviewfood: ImageView

        init {
            textviewfoodname = row.findViewById(R.id.foodName) as TextView
            imageviewfood = row.findViewById(R.id.foodImage) as ImageView
        }
    }

    override fun getCount(): Int {
        return arrayFoods.size
    }

    override fun getItem(position: Int): Any {
        return arrayFoods.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {
        var view: View?
        var viewholder: ViewHolder
        if (convertview == null) {
            var layoutinflater: LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.fooditem, null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        } else {
            view = convertview
            viewholder = convertview.tag as ViewHolder
        }
        var foods: Food = getItem(position) as Food
        viewholder.textviewfoodname.text = foods.foodName
        viewholder.imageviewfood.setImageResource(foods.foodImage)
        return view!!
    }
}



