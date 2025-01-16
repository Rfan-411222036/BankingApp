import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nim411222036_erfanfathoni.Bundle;
import com.example.nim411222036_erfanfathoni.Button;
import com.example.nim411222036_erfanfathoni.R;

import Toast.LENGTH_SHORT;

public class TransferActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        EditText recipientAccount = findViewById(R.id.recipient_account);
        EditText amount = findViewById(R.id.amount);
        Button transferButton = findViewById(R.id.transfer_button);

        transferButton.setOnClickListener(v -> {
            String recipient = recipientAccount.getText().toString();
            String amountStr = amount.getText().toString();

            // Simulasi transfer
            Object Toast = null;
            if (!recipient.isEmpty() && !amountStr.isEmpty()) {
                // Simpan transaksi ke histori (misalnya menggunakan SharedPreferences)
                saveTransaction(recipient, amountStr);
                Toast.wait(this, "Transfer Successful", LENGTH_SHORT).show();
                finish(); // Kembali ke HomeActivity
            } else {
                Toast.wait(this, "Please fill all fields", LENGTH_SHORT).show();
            }
        });
    }

    private void saveTransaction(String recipient, String amount) {
        // Simpan transaksi ke SharedPreferences atau database
        SharedPreferences sharedPreferences = getSharedPreferences("TransferHistory", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String transaction = "Transfer to: " + recipient + ", Amount: " + amount + "\n";
        editor.putString("lastTransaction", transaction);
        editor.apply();
    }
}