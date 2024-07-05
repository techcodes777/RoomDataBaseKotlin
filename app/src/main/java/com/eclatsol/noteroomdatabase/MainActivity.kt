package com.eclatsol.noteroomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.eclatsol.noteroomdatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), INoteRVAdapter,View.OnClickListener {

    lateinit var biding : ActivityMainBinding
    lateinit var viewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)

        //this line of app crash
//        viewModel = ViewModelProvider(this).get(NoteViewModel::class.java)

        biding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = NotesRVAdapter(this,this)
        biding.recyclerView.adapter = adapter

        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        )[NoteViewModel::class.java]
        viewModel.allNotes.observe(this, Observer {list ->
            list?.let {
                adapter.updateList(it)
            }
        })
        biding.addButton.setOnClickListener(this)
    }

    override fun onItemClicked(note: Note) {
        viewModel.deleteNote(note)
        Toast.makeText(this@MainActivity,"${note.text} Delete",Toast.LENGTH_SHORT).show()
    }

    override fun onClick(view: View?) {
        when(view!!.id){
            R.id.addButton ->{
                val noteText = biding.input.text.toString().trim()
                if(noteText.isNotEmpty()){
                   viewModel.insertNote(Note(noteText))
                    biding.input.text.clear()
                    Toast.makeText(this@MainActivity,"${noteText} Inserted",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


}