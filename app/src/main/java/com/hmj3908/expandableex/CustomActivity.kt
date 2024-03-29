package com.hmj3908.expandableex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hmj3908.expandableex.databinding.ActivityCustomBinding

class CustomActivity : AppCompatActivity() {

    private val adapter = ParentAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityCustomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = adapter
        var customArray = arrayListOf<String>()
        for(i in 0..23) {
            customArray.add(i.toString())
        }
        adapter.addSectionItem(
            SectionItem("Title0", R.color.colorPrimary, customArray, false)
        )
//        adapter.addSectionItem(
//            SectionItem("Title1", R.color.md_yellow_100, arrayListOf("item0", "item1", "item2", "item3"))
//        )
//        adapter.addSectionItem(
//            SectionItem("Title2", R.color.md_amber_700, arrayListOf("item0", "item1", "item2", "item3"))
//        )
//        adapter.addSectionItem(
//            SectionItem("Title3", R.color.md_orange_200, arrayListOf("item0", "item1", "item2", "item3"))
//        )
//        adapter.addSectionItem(
//            SectionItem("Title4", R.color.md_green_200, arrayListOf("item0", "item1", "item2", "item3"))
//        )
//        adapter.addSectionItem(
//            SectionItem("Title5", R.color.md_blue_100, arrayListOf("item0", "item1", "item2", "item3"))
//        )
//        adapter.addSectionItem(
//            SectionItem("Title6", R.color.md_blue_200, arrayListOf("item0", "item1", "item2", "item3"))
//        )
//        adapter.addSectionItem(
//            SectionItem("Title7", R.color.md_purple_100, arrayListOf("item0", "item1", "item2", "item3"))
//        )
//        adapter.addSectionItem(
//            SectionItem("Title8", R.color.md_purple_200, arrayListOf("item0", "item1", "item2", "item3"))
//        )
    }
}