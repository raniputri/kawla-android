package rani.kawla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import  android.support.v4.view.ViewPager;

public class NewsActivity extends AppCompatActivity {
   // ViewPager viewPager;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

     //   viewPager = (ViewPager) findViewById(R.id.viewPager);

     //   ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

     //   viewPager.setAdapter(viewPagerAdapter);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //Call Read rss asyntask to fetch rss
        ReadRss readRss = new ReadRss(this, recyclerView);
        readRss.execute();
    }
}
