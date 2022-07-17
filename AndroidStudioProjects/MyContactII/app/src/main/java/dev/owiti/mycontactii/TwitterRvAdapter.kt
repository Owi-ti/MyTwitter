package dev.owiti.mycontactii

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.owiti.mycontactii.databinding.TweetListItemBinding

class TwitterRvAdapter(var TweetList:List<Twitter>): RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item, parent, false)
        return TwitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTweet=TweetList.get(position)
        holder.tvName.text=currentTweet.name
        holder.tvHandle.text=currentTweet.handle
        holder.tvTweet.text=currentTweet.tweet
        holder.tvViews.text=currentTweet.views
        holder.tvViews2.text=currentTweet.views2
        holder.tvViews3.text=currentTweet.views3
        holder.tvViews4.text=currentTweet.views4
        holder.tvViews5.text=currentTweet.views5




    }

    override fun getItemCount(): Int {
        return TweetList.size
    }

}

class TwitterViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet )
    var tvViews=itemView.findViewById<TextView>(R.id.tvViews)
    var tvViews2=itemView.findViewById<TextView>(R.id.tvViews2)
    var tvViews3=itemView.findViewById<TextView>(R.id.tvViews3 )
    var tvViews4=itemView.findViewById<TextView>(R.id.tvViews4)
    var tvViews5=itemView.findViewById<TextView>(R.id.tvViews5)
    var ivTweet=itemView.findViewById<ImageView>(R.id.ivTweet )

}
