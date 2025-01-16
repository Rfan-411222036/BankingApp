import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nim411222036_erfanfathoni.HistoryActivity;
import com.example.nim411222036_erfanfathoni.ProfileActivity;
import com.example.nim411222036_erfanfathoni.R;
import com.example.nim411222036_erfanfathoni.TransferActivity; // Pastikan kelas ini ada

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.profile_button).setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.transfer_button).setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, TransferActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.history_button).setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HistoryActivity.class);
            startActivity(intent);
        });
    }
}
