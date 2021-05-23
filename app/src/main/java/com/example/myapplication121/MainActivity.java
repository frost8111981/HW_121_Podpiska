package com.example.myapplication121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickOnButtonOk();
        clickOnButtonDel();
    }

    private void clickOnButtonOk() {   //     1. Метод действия кнопки
        Button butOk = findViewById(R.id.button_ok); //     2. Создаем ссылку на созданную кнопку
        butOk.setOnClickListener(new View.OnClickListener() { //      3. Создали слушителя нажатия на кнопку
            @Override
            public void onClick(View v) { //     4. Анонимный метод нажатия на кнопку
                @SuppressLint("WrongViewCast") TextView txtV = findViewById(R.id.textView); //      5. Создаем ссылку на созданный аноним метод
                EditText txtEl = findViewById((R.id.login)); //       6. Создаем ссылку на элемент в котором вводятся значения ФИО
                EditText txtEp = findViewById((R.id.pass)); //       7. Создаем ссылку на элемент в котором вводятся значения пароля
                txtV.setText("Подписка на рассылку успешно оформлена для пользователя " + txtEl.getText() +" на электронный адрес " + txtEp.getText()); //
            }
        });
    }

    private void clickOnButtonDel() {
        Button butDel = findViewById(R.id.button_del);
        butDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtD = findViewById((R.id.textView));
                txtD.setText("");

            }
        });
    }

}