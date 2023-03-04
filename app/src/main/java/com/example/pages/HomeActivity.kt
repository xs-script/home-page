package com.example.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginpage.R
import com.example.loginpage.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    private var listDataHome: ArrayList<DataHome> = ArrayList()
    private lateinit var homeAdapter: HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // function calls
        setData()
    }

    private fun setData() {
        //  rvList.visibility = View.GONE
        //setAnimViewGone(lParentContent,rvList)

        listDataHome.clear()

        listDataHome.add(DataHome(1, resources.getString(R.string.label_menu_title_menu_asset_masuk), resources.getString(R.string.label_menu_desc_1_menu_asset_masuk), resources.getString(R.string.label_menu_desc_2_menu_asset_masuk), R.drawable.ic_barang_masuk))
        listDataHome.add(DataHome(2, resources.getString(R.string.label_menu_title_menu_asset_keluar), resources.getString(R.string.label_menu_desc_1_menu_asset_keluar), resources.getString(R.string.label_menu_desc_2_menu_asset_keluar), R.drawable.ic_barang_keluar))
        listDataHome.add(DataHome(3, resources.getString(R.string.label_menu_title_menu_stock_opname), resources.getString(R.string.label_menu_desc_1_menu_stock_opname), resources.getString(R.string.label_menu_desc_2_menu_stock_opname), R.drawable.ic_stock_opname))
        listDataHome.add(DataHome(4, resources.getString(R.string.label_menu_title_menu_barang_assets), resources.getString(R.string.label_menu_desc_1_menu_barang_assets), resources.getString(R.string.label_menu_desc_2_menu_barang_assets), R.drawable.ic_product_assets))

        homeAdapter = HomeAdapter(listDataHome)
        binding.rvList.adapter = homeAdapter
        val layoutManager = LinearLayoutManager(this)
        binding.rvList.layoutManager = layoutManager
        binding.rvList.isNestedScrollingEnabled = false

        //   setAnimViewVisible(lParentContent,rvList,0)

    }

}