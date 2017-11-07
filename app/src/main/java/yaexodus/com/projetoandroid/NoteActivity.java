package yaexodus.com.projetoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import yaexodus.com.projetoandroid.MainActivity;
import yaexodus.com.projetoandroid.R;

/**
 * Created by IFSP- on 07/11/2017.
 */

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_note);

        final EditText editTextTitle=
                findViewById(R.id.edit_title);

        EditText editTextDescription =
                findViewById(R.id.edit_description);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(NoteActivity.this, editTextTitle.getText() +"salvo", Toast.LENGTH_SHORT).show();

                finish();
            }
        });



}
}
