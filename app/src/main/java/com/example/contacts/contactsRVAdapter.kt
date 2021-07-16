package com.example.contacts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.ContactDetailsActivity
import com.squareup.picasso.Picasso

class ContactsRVAdapter(var contactsList: List<Contacts>, var context: Context):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contacts_list_item,parent,false)
        return ContactsViewHolder(itemView)

    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
       var contact = contactsList.get(position)
        holder.tvname.text=contact.Name
        holder.tvphonenumber.text=contact.phonenumber
        holder.tvemail.text=contact.email

        Picasso.get()
            .load(contact.imageUrl)
            .resize(80,80)
            .centerCrop()
//            .placeholder(R.drawable.defaulted)
            .into(holder.ivContacts)

        holder.cvcontact.setOnClickListener{
      val intent =Intent(context,ContactDetailsActivity::class.java)
            intent.putExtra("Name",contact.Name)
            intent.putExtra("phone",contact.phonenumber)
            intent.putExtra("email",contact.email)
            intent.putExtra("image",contact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
        holder.ivContacts.setOnClickListener{
            Toast.makeText(context,"You have clicked on my face.",Toast.LENGTH_LONG).show()
        }
        holder.tvname.setOnClickListener{
            Toast.makeText(context,"You have clicked on my name.",Toast.LENGTH_LONG).show()}
        holder.tvemail.setOnClickListener{
            Toast.makeText(context,"You have clicked on my email.",Toast.LENGTH_LONG).show()}
        holder.tvphonenumber.setOnClickListener {
            Toast.makeText(context, "You have clicked on my phonenumber.", Toast.LENGTH_LONG).show()}
        }


    override fun getItemCount(): Int {
        return  contactsList.size

    } }
class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    var tvname = itemView.findViewById<TextView>(R.id.tvname)
    var tvphonenumber = itemView.findViewById<TextView>(R.id.tvphonenumber)
    var tvemail = itemView.findViewById<TextView>(R.id.tvemail)
    var ivContacts=itemView.findViewById<ImageView>(R.id.ivContacts)
    var cvcontact =itemView.findViewById<CardView>(R.id.cvcontact)
}




