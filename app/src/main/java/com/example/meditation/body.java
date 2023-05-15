package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class body extends AppCompatActivity {
    private Button button;
    List<methodConstuctor> actions = new ArrayList<methodConstuctor>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        button = findViewById(R.id.home1);
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
        actions.add(new methodConstuctor("В нашем теле происходит тысячи химических процессов, но мы их не замечаем. Осознание своего тела, ощущение его от макушки до кончиков пальцев на ногах — это еще один из прекрасных методов релаксации и концентрации внимания. Существует единственный момент, о котором вы должны знать — если поза очень удобная, вы просто можете заснуть :)",
                "Метод:\n" +
                        "\n" +
                        "1. Сядьте или лягте в удобную для вас позицию. Если сидите, не забывайте держать спину прямо!\n" +
                        "2. Дышите глубоко. Представьте себе, как напряжение покидает ваше тело с каждым выдохом. Если вас отвлекают какие-либо неприятные ощущения в вашем теле, постарайтесь найти такую позицию, в которой вы сможете полностью расслабиться.\n" +
                        "3. Перенесите свое внимание на кончики пальцев своих ног, сосредоточьтесь на малейших ощущениях, которые возникают в том месте. Представьте себе, как вы направляете свое дыхания к пальцам, наполняя их ощущением тепла и энергии.\n" +
                        "4. Когда эта зона полностью расслабится, направьте ваше внимание вверх по телу через колени, руки, позвоночник, лицо — прямиком к верхней части головы (макушке).\n" +
                        "5. Почувствуйте тепло, расслабление и спокойствие, которое полностью окутывает ваше тело."));
    }
}