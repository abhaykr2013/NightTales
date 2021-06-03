package com.example.nighttales;



import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.io.File;


public class page2 extends AppCompatActivity {
    VideoView vd;
    MediaPlayer video, ring;
    Button so,sf;
    int vcurrentposition, mcurrentposition, count;
    private ViewPager viewPager;
    private slideAdapter myadapter;
    private FrameLayout frameLayout;
    int current=0,lastvid,lastmis,currentm=0;
    int scrollarray[ ],music[];
  //  int scrollarray[]={0,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,17,17,17,17,17,22,22,24,24,26,26,28,29,29,31,31,31,34,35,35,37,37,39,40,41,42,42,44};
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        Button so=findViewById(R.id.so);
        Button sf=findViewById(R.id.sf);
        so.setVisibility(View.GONE);
        sf.setVisibility(View.VISIBLE);
        frameLayout = findViewById(R.id.frameLayout);
        viewPager = findViewById(R.id.viewpager);
        vd = findViewById(R.id.videoView);
        scrollarray=new int[100];
        music=new int[100];
        lastvid=Integer.parseInt(MainActivity.meta.get(7));
        lastmis=Integer.parseInt(MainActivity.meta.get(8));
        for(int i=9;i<=lastvid;i++)
        {
           scrollarray[i-9]=Integer.parseInt(MainActivity.meta.get(i)) ;
        }
       for(int l=lastvid+1;l<=lastmis;l++)
        {
           music[l-(lastvid+1)]=Integer.parseInt(MainActivity.meta.get(l));
        }

       myadapter = new slideAdapter(this,MainActivity.meta.get(0),Integer.parseInt(MainActivity.meta.get(6)));

        viewPager.setAdapter(myadapter);

        TabLayout dots = findViewById(R.id.DotsLayout);
        dots.setupWithViewPager(viewPager, true);

        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ring.stop();
                so.setVisibility(View.GONE);
                sf.setVisibility(View.VISIBLE);
            }

        });
        sf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ring.start();
                so.setVisibility(View.VISIBLE);
                sf.setVisibility(View.GONE);
            }

        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onPageSelected(int position) {
               Toast.makeText(page2.this, "" + position, Toast.LENGTH_SHORT).show();


                if (current!=scrollarray[position])
                {
                            current=scrollarray[position];
                            File theme=new File(Environment.getExternalStorageDirectory(),"Download/Story/The Best Seller/bg"+scrollarray[position]+".mp4");
                            vd.setVideoPath(theme.getPath());
                }


                if (currentm != music[position])
                {
                           currentm=music[position];
                           ring.stop();
                           File z = new File(Environment.getExternalStorageDirectory(), "Download/Story/The Best Seller/mbg" + music[position] + ".mp3");
                           if(z.exists()){
                           Uri uri = Uri.fromFile(z);
                           ring = MediaPlayer.create(page2.this, uri);
                           ring.start();}
                }




            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });


        getWindow().setStatusBarColor(getResources().getColor(R.color.black));

        File start1=new File(Environment.getExternalStorageDirectory(),"Download/Story/The Best Seller/mbg0.mp3");
        ring = MediaPlayer.create(page2.this, Uri.fromFile(start1));
        ring.start();

       File start2=new File(Environment.getExternalStorageDirectory(),"Download/Story/The Best Seller/bg0.mp4");
        vd.setVideoPath(start2.getPath());
        vd.start();
        vd.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                video = mediaPlayer;
                video.setLooping(true);
                ring.setLooping(true);
                if (vcurrentposition != 0) {
                    video.seekTo(vcurrentposition);
                    video.start();
                    ring.seekTo(mcurrentposition);
                    ring.start();
                }
            }
        });
    }





    @Override
    protected void onPause() {
        super.onPause();
        vcurrentposition = video.getCurrentPosition();
        vd.pause();
        mcurrentposition = ring.getCurrentPosition();
        ring.pause();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        video.release();
        ring.release();


    }





}



