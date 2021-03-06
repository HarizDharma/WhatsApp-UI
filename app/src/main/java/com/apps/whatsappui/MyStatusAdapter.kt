package com.apps.whatsappui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ScrollingTabContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_status_item.*

class MyStatusAdapter(private val context: Context, private val items: ArrayList<MyStatus>):
    RecyclerView.Adapter<MyStatusAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.my_status_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView: View):
        RecyclerView.ViewHolder(containerView), LayoutContainer {
            fun bindItem(item:MyStatus) {
                txtFriendNameStatus.text=item.nama
                txtDateStatus.text=item.tanggal
                this.pp2.setImageResource(item.profil)
            }
        }
}