package id.migratingdagger.hilt.ui.list

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.migratingdagger.common.Binder
import id.migratingdagger.common.events.OnViewHolderItemSelected
import id.migratingdagger.hilt.R
import id.migratingdagger.hilt.repository.entity.News

class NewsListItemViewHolder(
    private val view: View,
    listener: OnViewHolderItemSelected<News?>? = null
) : RecyclerView.ViewHolder(view), Binder<News> {

    private val mTitleTextView: TextView = view.findViewById(R.id.news_title)
    private val mBodyTextView: TextView = view.findViewById(R.id.news_body)

    private var currentNews: News? = null

    init {
        listener?.let { l ->
            view.setOnClickListener { l(currentNews) }
        }
    }

    override fun bind(model: News) {
        currentNews = model
        model.run {
            mTitleTextView.text = title
            mBodyTextView.text = body
        }
    }
}