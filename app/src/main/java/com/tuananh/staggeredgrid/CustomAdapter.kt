package com.tuananh.staggeredgrid

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_recycler_view.view.*

/**
 * Created by FRAMGIA\vu.tuan.anh on 26/03/2018.
 */
class CustomAdapter(context: Context, private var personNameList: MutableList<String>?, private var personImageList: MutableList<Int>?) : RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    private var layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = personNameList!![position]
        holder.image.setImageResource(personImageList!![position])
        holder.rlRoot.setOnClickListener {
            // todo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        return MyViewHolder(layoutInflater.inflate(R.layout.item_recycler_view, parent, false))
    }

    override fun getItemCount(): Int {
        return personNameList!!.size
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.name!!
        val image = view.image!!
        val rlRoot = view.rlRoot!!
    }
}