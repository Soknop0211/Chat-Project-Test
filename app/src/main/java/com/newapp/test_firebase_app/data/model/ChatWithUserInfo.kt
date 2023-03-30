package com.newapp.test_firebase_app.data.model

import com.newapp.test_firebase_app.data.db.entity.Chat
import com.newapp.test_firebase_app.data.db.entity.UserInfo

data class ChatWithUserInfo(
    var mChat: Chat,
    var mUserInfo: UserInfo
)
