package com.example.lpufoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.lpufoods.models.RestaurantModel

import kotlinx.android.synthetic.main.activity_success_order.*

class SuccessOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_order)

        val restaurantModel: RestaurantModel? = intent.getParcelableExtra("RestaurantModel")
        val actionbar: ActionBar? = supportActionBar
        actionbar?.setTitle(restaurantModel?.name)
        actionbar?.setSubtitle(restaurantModel?.address)
        actionbar?.setDisplayHomeAsUpEnabled(false)

        buttonDone.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
    }
}