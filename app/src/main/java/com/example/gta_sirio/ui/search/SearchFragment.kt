package com.example.gta_sirio.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.gta_sirio.ProductsAdapter
import com.example.gta_sirio.databinding.FragmentSearchBinding
import com.example.gta_sirio.model.Product

class SearchFragment : Fragment() {

    private lateinit var searchViewModel: SearchViewModel
    private var _binding: FragmentSearchBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        searchViewModel =
                ViewModelProvider(this).get(SearchViewModel::class.java)

        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val root: View = binding.root
//
//        val textView: TextView = binding.textSearch
//        searchViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

//        val products = arrayListOf<Product>()
//        for (i in 0..100){
//            products.add(Product("Produit test", "https://via.placeholder.com/200", 149.99))
//        }
//
//        binding.recycleView.apply {
//            layoutManager = GridLayoutManager(this@SearchFragment, 2)
//            adapter = ProductsAdapter(products)
//        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
