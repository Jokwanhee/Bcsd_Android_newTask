package com.example.bcsd_newtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    lateinit var testAdapter: TestAdapter // 늦은 초기화
    val datas = mutableListOf<TestData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        clickBtnPage1()
        startRecycler()
    }

    private fun startRecycler() {
        testAdapter = TestAdapter(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = testAdapter

        datas.apply {
            add(TestData(img = R.drawable.ic_launcher_background, name = "조씨", age = 1))
            add(TestData(img = R.drawable.ic_launcher_background, name = "김씨", age = 2))
            add(TestData(img = R.drawable.ic_launcher_background, name = "이씨", age = 3))
            add(TestData(img = R.drawable.ic_launcher_background, name = "박씨", age = 5))
            add(TestData(img = R.drawable.ic_launcher_background, name = "최씨", age = 6))
            add(TestData(img = R.drawable.ic_launcher_background, name = "원씨", age = 7))
            add(TestData(img = R.drawable.ic_launcher_background, name = "백씨", age = 8))
            add(TestData(img = R.drawable.ic_launcher_background, name = "손씨", age = 9))
            add(TestData(img = R.drawable.ic_launcher_background, name = "주씨", age = 10))

            testAdapter.datas = datas
            recyclerView.addItemDecoration(VerticalDecorator(10))
            recyclerView.addItemDecoration(HorizontallDecorator(10))
            testAdapter.notifyDataSetChanged() // 리스트의 크기와 아이템이 둘 다 변경되는 경우 사용

        }
    }

    private fun clickBtnPage1() {
        val buttonPage2 = findViewById<Button>(R.id.page1_button)
        val intent = Intent(this, MainActivity::class.java)

        buttonPage2.setOnClickListener {
            startActivity(intent)
            finish()
        }
    }
}