package br.com.rafaelsamenezes.pdfviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.rafaelsamenezes.pdfviewer.adapters.FieldAdapter
import br.com.rafaelsamenezes.pdfviewer.model.FeedItem


class BMCDemonstration : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val feedItems: ArrayList<FeedItem> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmcdemonstration)

        recyclerView = findViewById(R.id.bmcdemo_rv)

        feedItems.add(FeedItem("Alice in the wonderland", R.drawable.alice))
        feedItems.add(FeedItem("Alice in the wonderland 2", R.drawable.alice))
        feedItems.add(FeedItem("Alice in the wonderland 3", R.drawable.alice))
        feedItems.add(FeedItem("Alice in the wonderland 4", R.drawable.alice))
        feedItems.add(FeedItem("Alice in the wonderland 5", R.drawable.alice))
        feedItems.add(FeedItem("Alice in the wonderland 6", R.drawable.alice))
        feedItems.add(FeedItem("Alice in the wonderland 6", R.drawable.alice))
        feedItems.add(FeedItem("Alice in the wonderland 7", R.drawable.alice))

        val adapter = FieldAdapter(feedItems, this)
        val layoutManager = GridLayoutManager(this, 4)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}