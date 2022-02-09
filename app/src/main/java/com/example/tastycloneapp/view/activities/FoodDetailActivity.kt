package com.example.tastycloneapp.view.activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tastycloneapp.model.remote.api.response.InstructionX
import com.example.tastycloneapp.model.remote.api.response.ItemX
import com.example.tastycloneapp.repositories.Repo
import com.example.tastycloneapp.view.adapters.PreparationAdapter
import com.example.tastycloneapp.viewmodel.MainViewModel
import com.example.tastycloneapp.viewmodel.ViewModelFactory
import com.example.tastycloneapp.R
import kotlinx.android.synthetic.main.activity_food_detail.*


class FoodDetailActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        viewModel = ViewModelProvider(this, ViewModelFactory(Repo())).get(MainViewModel::class.java)

        if (intent != null) {
            val data = intent.getIntExtra("foodName", -1)       // random default value
            viewModel.getDetail(data).observe(this, Observer {
                setData(it)
            })
        }
        back_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setData(it: ItemX?) {
        it?.apply {
            tvdishName.text = name
            val uri = Uri.parse(video_url)
            vvdishVideo.setVideoURI(uri)
            vvdishVideo.start()
            calories.text = "${nutrition.calories.toString()}g"
            fat.text = "${nutrition.fat.toString()}g"
            carbohydrates.text = "${nutrition.carbohydrates.toString()}g"
            sugar.text = "${nutrition.sugar.toString()}g"
            fiber.text = "${nutrition.fiber.toString()}g"
            protein.text = "${nutrition.protein.toString()}g"
            val preplist = it.instructions as ArrayList<InstructionX>
            setRecyclerview(preplist)
        }
    }

    fun setRecyclerview(preplist: ArrayList<InstructionX>) {
        rvPreapartion.apply {
            adapter = PreparationAdapter(preplist)
            layoutManager =
                LinearLayoutManager(this@FoodDetailActivity, LinearLayoutManager.VERTICAL, false)
        }
    }
}