package com.example.meditation;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class breath extends AppCompatActivity {

    private Button button;
    List<methodConstuctor> actions = new ArrayList<methodConstuctor>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breath);
        button = findViewById(R.id.hause);
        setActionsData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MethodAdapter adapter = new MethodAdapter(this, actions);
        recyclerView.setAdapter(adapter);
        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(intent);
        }
    };
   private void setActionsData() {
       actions.add(new methodConstuctor("Глубокое дыхание — один из самых простых и эффективных техник, которая доступна не только тем, кто давно практикует, но и новичкам.",
               "Метод:\n" +
                        "\n" +
                        "1. Найдите приятное тихое место, где вас никто не побеспокоит 10-15 минут.\n" +
                        "2. Сядьте в удобную позу, обязательно держа спину прямо. Это может быть поза ноги по-турецки на полу, а может быть и удобный стул, но при этом ноги должны обязательно стоять на земле полной ступней.\n" +
                       "3. Закройте глаза и положите руки на колени ладонями вверх.\n" +
                       "4. Несколько минут просто наблюдайте за вашим дыханием. Осознайте и прочувствуйте, как воздух проходит через ваши ноздри и горло. Почувствуйте, как во время дыхания поднимается и опускается ваша грудная клетка. Обратите внимание на то, как напряженность мягко покидает ваше тело вместе с выдыхаемым воздухом через рот.\n" +
                        "5. Когда вы почувствовали, что ваше тело расслабилось, измените ритм вашего дыхания. Сделайте глубокий вдох на счет «один», затем задержите ваше дыхание на четыре секунды, и выдыхайте медленно на счет «два».\n" +
                       "6. Продолжайте дышать по методу «один-четыре-две», сосредоточив свое внимание на дыхании, в течении 10 минут.\n" +
                       "\n" +
                       "Как вариант, вы можете делать это под специальную медитативную музыку со звоночками через определенный интервал времени. Таким образом вы сможете отслеживать время вашей медитации более спокойным и приятным образом."));
   }
}