package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend("Samsul Arifin", "Laki-laki","samsul@stimata.ac.id",
        "08123456789", "Bogor")
        )
        listTeman.add(
            MyFriend("Dian Wahyuningsih", "Perempuan", "dian@stimata.ac.id",
        "081987654321", "Sidoarjo")
        )
        listTeman.add(
            MyFriend("Baba", "Perempuan", "baba@stimata.ac.id",
                "0819876511111", "Medan")
        )
        listTeman.add(
            MyFriend("Bobo", "Laki-laki", "bobo@stimata.ac.id",
                "081900054321", "Surabaya")
        )
        listTeman.add(
            MyFriend("Bibi", "Perempuan", "bibi@stimata.ac.id",
                "082287654321", "Kupang")
        )
        listTeman.add(
            MyFriend("Bubu", "Laki-laki", "bubu@stimata.ac.id",
                "081444654321", "Kalimantan")
        )
        listTeman.add(
            MyFriend("Bebe", "Perempuan", "bebe@stimata.ac.id",
                "081987600021", "Tulungagung")
        )
        listTeman.add(
            MyFriend("Caca", "Perempuan", "caca@stimata.ac.id",
                "085987004321", "Sumberpucung")
        )
        listTeman.add(
            MyFriend("Cici", "Perempuan", "cici@stimata.ac.id",
                "081999654321", "Meikarta")
        )
        listTeman.add(
            MyFriend("Coco", "Laki-laki", "coco@stimata.ac.id",
                "082287554321", "Blitar")
        )
        listTeman.add(
            MyFriend("Cece", "Perempuan", "cece@stimata.ac.id",
                "081987000000", "Kepanjen")
        )
        listTeman.add(
            MyFriend("Dada", "Perempuan", "dada@stimata.ac.id",
                "081987774321", "Inggris")
        )
        listTeman.add(
            MyFriend("Didi", "Laki-laki", "didi@stimata.ac.id",
                "081999954321", "Bandung")
        )
        listTeman.add(
            MyFriend("Dudu", "Perempuan", "dudu@stimata.ac.id",
                "081987655521", "Trenggalek")
        )
        listTeman.add(
            MyFriend("Dede", "Laki-laki", "dede@stimata.ac.id",
                "085557654321", "Jerman")
        )
    }

    private fun tampilTeman() {
        rv_ListMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_ListMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }  


    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
