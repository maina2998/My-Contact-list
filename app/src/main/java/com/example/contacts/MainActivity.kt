package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcontacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displaycontacts()
    }
    fun displaycontacts(){
        val contactsList= listOf<Contacts>(
            Contacts(Name="edna",phonenumber="071234567",email="eddna@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8cGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts(Name="Mercy Wangari" ,"1332088389","kinyanjuimercywangari@gmail.com","https://images.unsplash.com/photo-1539571696357-5a69c17a67c6?ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8cGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts(Name="Grace Maina","128993920039","mainagrace@gmail.com","https://images.unsplash.com/photo-1517841905240-472988babdf9?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts(Name = "Rebecca Wambui","777654332223","wambuirebeka@gmail.com","https://images.unsplash.com/photo-1488161628813-04466f872be2?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fHBlb3BsZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"), Contacts(Name = "Nancy Kabura","18288291990090","kaburanancy@gmail.com","https://images.unsplash.com/photo-1524504388940-b1c1722653e1?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fHBlb3BsZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts(Name  = "Wanjiru Njiru","1289293993982","njiruwanjiru@gmail.com","https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBlb3BsZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts(Name= "Frankilin Mwangi","3228388384892929","mwangifrankilin@gmail.com","https://images.unsplash.com/photo-1501196354995-cbb51c65aaea?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fHBlb3BsZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),

        )
        rvcontacts= findViewById(R.id.rvcontacts)
        val contactsAdapter=ContactsRVAdapter(contactsList,baseContext)
        rvcontacts.layoutManager= LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactsAdapter
    }



    }
