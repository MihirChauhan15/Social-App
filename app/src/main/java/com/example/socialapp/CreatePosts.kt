package com.example.socialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.socialapp.usersDao.PostDao
import kotlinx.android.synthetic.main.activity_create.*
import kotlinx.android.synthetic.main.activity_main.*

class CreatePosts : AppCompatActivity() {
    private lateinit var postDao: PostDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        postDao =PostDao()
        post.setOnClickListener {
            val text = editTextTextPersonName.text.toString().trim()
            if(text.isNotEmpty()){

                postDao.addPosts(text)
                finish()
            }
        }
    }
}