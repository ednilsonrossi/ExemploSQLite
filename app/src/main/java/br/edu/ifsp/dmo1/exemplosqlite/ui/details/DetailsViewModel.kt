package br.edu.ifsp.dmo1.exemplosqlite.ui.details

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.edu.ifsp.dmo1.exemplosqlite.data.repository.MeuDadoRepository

class DetailsViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = MeuDadoRepository(application)

    private val _editionMode = MutableLiveData<Boolean>()
    val editonMode: LiveData<Boolean>
        get() = _editionMode

    private val _texto = MutableLiveData<String>()
    val texto : LiveData<String> = _texto

    private val _id = MutableLiveData<Int>()
    val id: LiveData<Int> = _id

    fun entryEditionMode(id: Int) {
        val dado = repository.getMeuDadoById(id)
        if (dado != null) {
            _editionMode.value = true;
            _texto.value = dado.texto
            _id.value = dado.id
        }
    }


}