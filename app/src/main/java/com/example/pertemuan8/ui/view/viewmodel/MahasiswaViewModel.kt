package com.example.pertemuan8.ui.view.viewmodel

package com.example.pertemuan8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class MahasiswaViewModel : ViewModel() {
    // Req atau event
    private val _mahasiswaStateUI =
        MutableStateFlow(Mahasiswa())

    //Response atau state
    val mahasiswaUiState:
            StateFlow<Mahasiswa> =
        _mahasiswaStateUI.asStateFlow()

    fun saveDataMahasiswa(ls: MutableList<String>){
        _mahasiswaStateUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2]
            )
        }
    }

}
    }

}