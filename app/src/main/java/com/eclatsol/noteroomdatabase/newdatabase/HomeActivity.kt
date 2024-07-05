package com.eclatsol.noteroomdatabase.newdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.eclatsol.noteroomdatabase.R
import com.eclatsol.noteroomdatabase.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity(), IAddDataAdapter, View.OnClickListener {

    private lateinit var viewModel: AddDataViewModel

    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val addDataAdapter = AddDataAdapter(this, this)
        binding.recyclerViewAddData.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewAddData.adapter = addDataAdapter


        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        )[AddDataViewModel::class.java]
        viewModel.allAddData.observe(this, Observer { list ->
            list?.let {
                addDataAdapter.updateList(it)
            }
        })

        binding.btnSubmit.setOnClickListener(this)
    }

    override fun onItemClick(addData: AddData) {
        viewModel.delete(addData)
        Toast.makeText(this@HomeActivity,"${addData.text}",Toast.LENGTH_SHORT).show()
    }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.btnSubmit -> {
                val etText = binding.etValue.text.toString().trim()
                if (etText.isNotEmpty()){
                    viewModel.insert(AddData(etText))
                    binding.etValue.text.clear()
                    Toast.makeText(this@HomeActivity,"${etText.toString()}",Toast.LENGTH_SHORT).show()
                }

            }
        }
    }
}