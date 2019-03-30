package com.example.mylistapp

import android.icu.text.LocaleDisplayNames
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getString(R.string.app_list)
        val firstNames = resources.getStringArray(R.array.first_names)
        val lastNames = resources.getStringArray(R.array.last_names)
        val profilePicture = resources.getStringArray(R.array.avatars)
        user_list_view.adapter=UserAdapter(firstNames,lastNames,profilePicture)
        user_list_view.layoutManager=LinearLayoutManager(this)

    }


}
