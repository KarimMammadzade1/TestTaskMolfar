package com.rteam.testtaskmolfar.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rteam.testtaskmolfar.R
import com.rteam.testtaskmolfar.databinding.FragmentCategoryItemBinding
import com.rteam.testtaskmolfar.model.InnerContentModel
import com.rteam.testtaskmolfar.model.RecyclerContent
import com.rteam.testtaskmolfar.ui.adapters.ContentRecyclerViewAdapter
import com.rteam.testtaskmolfar.utils.Mocks.innerContentMockList

class CategoryItemFragment :Fragment(){
    private val binding:FragmentCategoryItemBinding by lazy{
        FragmentCategoryItemBinding.inflate(layoutInflater)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dataList = getRecyclerData(requireArguments().getInt("catId"))
        binding.recyclerView.adapter = ContentRecyclerViewAdapter(dataList)


        return binding.root
    }

    private fun getRecyclerData(catId: Int): List<RecyclerContent> {
        return innerContentMockList.find {
            it.catId == catId
        }!!.contentList
    }
}