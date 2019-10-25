package com.example.sahambluechips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var rvStock: RecyclerView
    private var list: ArrayList<Stock> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvStock = findViewById(R.id.rv_stock)
        rvStock.setHasFixedSize(true)

        list.addAll(StockData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvStock.layoutManager = LinearLayoutManager(this)
        val listStockAdapter = ListStockAdapter(list)
        rvStock.adapter = listStockAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profile -> {
                val personalInformation1 = Intent(this@MainActivity, personalInformation::class.java)
                startActivity(personalInformation1)
            }
        }
    }
}
