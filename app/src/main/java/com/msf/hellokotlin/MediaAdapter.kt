package com.msf.hellokotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_media_item.view.*

/**
 * Created by karthick on 10/7/2017.
 */

class MediaAdapter(val items: List<MediaItem>, val listener: (MediaItem) -> Unit)
    : RecyclerView.Adapter<MediaAdapter.ViewHolder>() {
//    interface onMediaClickListener {
//        fun onClick(mediaItem: MediaItem)
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //val v = LayoutInflater.from(parent.context).inflate(R.layout.view_media_item, parent, false)
        val v = parent.inflate(R.layout.view_media_item)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: MediaItem) = with(itemView) {
            mediaTitle.text = item.title
            mediaImage.loadURL(item.thumbURL)

            media_video_indicator.visibility = when (item.type) {
                MediaItem.Type.VIDEO -> View.VISIBLE
                MediaItem.Type.PHOTO -> View.GONE
            }
        }
    }
}