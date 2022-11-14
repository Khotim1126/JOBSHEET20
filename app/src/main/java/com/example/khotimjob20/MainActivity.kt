package com.example.khotimjob20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.khotimjob20.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "FITRI RAHMAWATI",
        "HAMDAN AINUN NA'IM",
        "HENI WIJAYANTI",
        "IBNU RIF'AN",
        "JIHAN SALWA FITRIANI",
        "KHOTIMATUS SA'ADAH",
        "LADA'ARDI S.L",
        "LATIFAH IRSYADIAH",
        "MAULIDA INTAN NUR AINI",
        "MIFTAKHUL JANNAH",
        "MUH ASA SUSILO F.S"
    )

    val listNis = arrayOf(
        "2992",
        "2993",
        "2995",
        "2997",
        "3000",
        "3002",
        "3003",
        "3005",
        "3008",
        "3010",
        "3011"
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}