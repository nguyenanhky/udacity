package kynv1.fsoft.components


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var btnAction:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAction = findViewById(R.id.btn_action)
        btnAction.setOnClickListener {
            val message = "Chào mừng bạn đến với Snackbar!"
            val duration = Snackbar.LENGTH_LONG

            val snackbar = Snackbar.make(
                it, // View cha mà Snackbar sẽ hiển thị trên đó
                message, // Nội dung thông báo
                duration // Thời gian hiển thị (có thể là LENGTH_SHORT hoặc LENGTH_LONG)
            )

            snackbar.setAction("Đóng") {
                // Xử lý khi người dùng bấm nút "Đóng"
                snackbar.dismiss()
            }

            snackbar.show()
        }

    }
}