package com.example.kotlinstudy

import android.content.Context
import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


open class BaseActivity<T : ViewDataBinding>(@LayoutRes private val layoutResId: Int) : AppCompatActivity() {
    protected lateinit var binding: T
    private var lastBackPressedTime: Long = 0

    companion object{
        const val TAG: String = "로그"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)
    }

    // EditText에서 외부 클릭 시 포커스 해제
    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_DOWN) {
            val v = currentFocus
            if (v is EditText) {
                val outRect = Rect()
                v.getGlobalVisibleRect(outRect)
                if (!outRect.contains(event.rawX.toInt(), event.rawY.toInt())) {
                    v.clearFocus()
                    val imm: InputMethodManager =
                        getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0)
                }
            }
        }
        return super.dispatchTouchEvent(event)
    }

    // 뒤로가기
    fun backPressed() {
        val currentTime = System.currentTimeMillis()
        val differenceTime = currentTime - lastBackPressedTime
        if (differenceTime in 0..2000) {
            finish()
        } else {
            lastBackPressedTime = currentTime
            Toast.makeText(this, getString(R.string.one_more_touch_end), Toast.LENGTH_SHORT).show()
        }
    }

//    fun nextActivity(packageContext: Context, cls:Class<T>) {
//        val intent = Intent(packageContext, cls)
//        startActivity(intent)
//    }

}