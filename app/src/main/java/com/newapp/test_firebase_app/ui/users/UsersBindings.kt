package com.newapp.test_firebase_app.ui.users

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.newapp.test_firebase_app.data.db.entity.User

@BindingAdapter("bind_users_list")
fun bindUsersList(listView: RecyclerView, items: List<User>?) {
    items?.let { (listView.adapter as UsersListAdapter).submitList(items) }
}

