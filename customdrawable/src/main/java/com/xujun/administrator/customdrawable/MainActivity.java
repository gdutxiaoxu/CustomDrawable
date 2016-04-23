package com.xujun.administrator.customdrawable;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.xujun.administrator.customdrawable.view.CircleImageDrawable;
import com.xujun.administrator.customdrawable.view.RoundImageDrawable;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.iv_circle)
    ImageView ivCircle;
    @Bind(R.id.iv_round_circle)
    ImageView ivRoundCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.girl);
        ivCircle.setImageDrawable(new CircleImageDrawable(bitmap));
        ivRoundCircle.setImageDrawable(new RoundImageDrawable(bitmap));


    }
}
