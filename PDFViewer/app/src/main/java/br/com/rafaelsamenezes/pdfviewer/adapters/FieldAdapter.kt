package br.com.rafaelsamenezes.pdfviewer.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.rafaelsamenezes.pdfviewer.R
import br.com.rafaelsamenezes.pdfviewer.model.FeedItem


class FieldAdapter(recyclerDataArrayList: ArrayList<FeedItem>, mcontext: Context) :
    RecyclerView.Adapter<FieldAdapter.RecyclerViewHolder>() {
    private val courseDataArrayList: ArrayList<FeedItem>
    private val mcontext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val recyclerData: FeedItem = courseDataArrayList[position]
        holder.itemH1.text = recyclerData.title
        holder.itemImg.setImageResource(recyclerData.imgId)
    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return courseDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemH1: TextView
        val itemImg: ImageView

        init {
            itemH1 = itemView.findViewById(R.id.feed_card_h1)
            itemImg = itemView.findViewById(R.id.feed_card_img)
        }

    }

    init {
        courseDataArrayList = recyclerDataArrayList
        this.mcontext = mcontext
    }
}