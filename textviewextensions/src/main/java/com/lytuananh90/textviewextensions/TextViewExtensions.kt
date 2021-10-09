package com.lytuananh90.textviewextensions

import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["stringResId"], requireAll = false)
fun TextView.setTextResourceId(resId: Int?) {
    resId?.let {
        this.setText(it)
    }
}

@BindingAdapter(value = ["htmlText"], requireAll = false)
fun TextView.setHtmlText(content: String?) {
    this.text = content?.let { HtmlCompat.fromHtml(it, HtmlCompat.FROM_HTML_MODE_LEGACY).trimEnd() } ?: ""
}