package br.edu.ifsp.dmo1.exemplosqlite.ui.main

interface ItemListDadoClickListener {

    fun clickEditItemList(id: Int, texto: String, numero: Int)

    fun clickDeleteItemList(id: Int)

}