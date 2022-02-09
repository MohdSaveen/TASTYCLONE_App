package com.example.tastycloneapp.view.interfaces

import com.example.tastycloneapp.model.remote.searchResponse.ResultSearchModel

interface OnSearchCardClicked{
    fun onSearchCardClicked(resultSearchModel : ResultSearchModel)
}