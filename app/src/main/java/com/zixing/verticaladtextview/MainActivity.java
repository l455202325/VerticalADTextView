package com.zixing.verticaladtextview;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.zixing.adtextviewlib.VerticalADTextview;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private VerticalADTextview adTextview1;
    private VerticalADTextview adTextview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
//        adTextview1 = (VerticalADTextview) findViewById(R.id.vertical_ad_text1);
        adTextview2 = (VerticalADTextview) findViewById(R.id.vertical_ad_text2);
    }

    private void initData() {
        ArrayList<String> titleList1 = new ArrayList<>();
        ArrayList<String> titleList2 = new ArrayList<>();

        titleList1.add("珍珠钻石5折抢，仅此一天");
        titleList1.add("京东秋收季，新茶低至9.9包邮");
        titleList1.add("周五海囤日，周周秒杀9.9元起");

        titleList2.add("<font color=\'red\'>爆</font> 珍珠钻石5折抢，仅此一天");
        titleList2.add("<font color=\'red\'>HOT</font> 京东秋收季，新茶低至9.9包邮");
        titleList2.add("<font color=\'red\'>抢</font> 周五海囤日，周周秒杀9.9元起");

//        initADTextView(adTextview1);
        initADTextView(adTextview2);

//        adTextview1.setTextList(titleList1);//加入显示内容,集合类型
        adTextview2.setTextList(titleList2);//加入显示内容,集合类型

    }

    private void initADTextView(VerticalADTextview adTextview) {
        adTextview.setText(12, 5, Color.rgb(66, 66, 66));//设置属性
        adTextview.setTextStillTime(3000);//设置停留时长间隔
        adTextview.setAnimTime(400);//设置进入和退出的时间间隔
        //对单条文字的点击监听
        adTextview.setOnItemClickListener(new VerticalADTextview.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // TO DO
                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }
        });
//        adTextview.startAutoScroll();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        adTextview1.stopAutoScroll();
        adTextview2.stopAutoScroll();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        adTextview1.startAutoScroll();
        adTextview2.startAutoScroll();
    }
}
