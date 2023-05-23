package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class candle extends AppCompatActivity {

    List<methodConstuctor> actions = new ArrayList<methodConstuctor>();
    MediaPlayer mediaPlayer ;

    @Override
    protected void onStop() {
        mediaPlayer.stop();
        super.onStop();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candle);
        setActionsData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MethodAdapter adapter = new MethodAdapter(this, actions);
        recyclerView.setAdapter(adapter);
        mediaPlayer = new MediaPlayer();
        AssetFileDescriptor descriptor = null;
        try {
            descriptor = getAssets().openFd("Ozzy_Osbourne_-_Bark_at_the_Moon_b64f0d257.mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            mediaPlayer.prepare();
            mediaPlayer.start();
            mediaPlayer.setLooping(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


   private void setActionsData() {
     actions.add(new methodConstuctor("Этим вы вряд ли сможете заняться в офисе, так что лучше опробуйте этот метод дома. В основе любой медитации лежит умение концентрировать свое внимание на объекте. Наше тело и сознание полностью расслаблено, но при этом мы сконцентрированы на определенном предмете. Это довольно сложно, если учесть, что в наше время многозадачности наше сознание только и делает, что переключается в короткий промежуток времени между несколькими задачами. Некоторые умудряются делать их практически одновременно. Но как уже не один раз было замечено, что успешное выполнение задания заключается в отсечении всего лишнего и концентрации на конкретной цели. В этом нам и поможет практика медитации со свечами.",
               "Метод:\n" +
                       "\n" +
                        "1. Выключите все источники света (если это вечер) или занавесьте окна шторами.\n" +
                        "2. Сядьте в удобную позицию, держа спину прямо.\n" +
                       "3. Зажгите свечу и поставьте ее на уровне ваших глаз на расстоянии вытянутой руки.\n" +
                        "4. Сосредоточьте свой взгляд на кончике пламени свечи, стараясь при этом моргать как можно реже. При выполнении этой техники ваши глаза могут начать слезиться, но это хорошо (одна из причин, по которой данная техника медитации помогает улучшить зрение).\n" +
                        "5. Позвольте пламени свечи заполнить ваше сознание. Если в вашу голову начнут лезть отвлекающие мысли, постарайтесь снова сосредоточиться на пламени свечи.\n" +
                        "6.Через несколько минут закройте глаза и сосредоточьтесь на изображении мерцающего и танцующего пламени свечи в вашем сознании.\n" +
                        "7. Откройте глаза и сделайте несколько глубоких вдохов."));
    }
}