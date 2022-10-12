package com.rteam.testtaskmolfar.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.children
import androidx.fragment.app.Fragment
import com.rteam.testtaskmolfar.R
import com.rteam.testtaskmolfar.databinding.FragmentHomeBinding
import com.rteam.testtaskmolfar.model.MainContentModel
import com.rteam.testtaskmolfar.utils.Mocks.mainMockList

class HomeFragment:Fragment(){
    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }
    var adapter: PagerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        setViewPager(mainMockList)

        return binding.root
    }

    private fun setViewPager(dataList: List<MainContentModel>) {
        adapter = PagerAdapter(requireActivity().supportFragmentManager)

        dataList.forEach { category ->
            val fragment = CategoryItemFragment()
            val bundle = Bundle()

            fragment.arguments = bundle
            adapter!!.addFragment(fragment, category.categoryNmae)
        }

        binding.viewPager.adapter = adapter
        binding.viewPager.offscreenPageLimit = 1
//        viewModel.tabPosition.observe(requireActivity() as MainActivity) {
//            binding.viewPager.currentItem = it
//        }

        binding.tabLayout.setViewPager(binding.viewPager)



    }
}