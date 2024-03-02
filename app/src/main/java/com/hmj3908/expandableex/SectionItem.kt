package com.hmj3908.expandableex

data class SectionItem(
    val title: String,
    val color: Int,
    val itemList: List<String>,
    var expanded: Boolean = false
)
