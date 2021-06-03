package com.example.nighttales;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class MainActivity extends AppCompatActivity {

    Button btn1;
   // private StorageReference ref=FirebaseStorage.getInstance().getReference().child("Story").child("T").child("T.zip");
    private StorageReference ref=FirebaseStorage.getInstance().getReference().child("Story").child("The Best Seller.zip");
    public static ArrayList<String> meta;
    String storyname;




    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        haveStoragePermission();
        btn1 = findViewById(R.id.btn1);
        btn1.setVisibility(View.GONE);
        meta=new ArrayList<>();
        haveStoragePermission();
        File createdir=new File(Environment.getExternalStorageDirectory(),"Download/Story/The Best Seller");
        if(!createdir.exists())
        {
            createdir.mkdirs();
        }
        File file=new File(Environment.getExternalStorageDirectory(),"Download/Story/The Best Seller/The_Best_Seller.zip");

        if(!file.exists()) {

            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    DownloadTask downloadTask = new DownloadTask();
                    downloadTask.execute(String.valueOf(uri));
                }
            });

        }
        File f=new File(Environment.getExternalStorageDirectory(),"Download/Story/The Best Seller/0.txt");
        if(f.exists())
        {
            btn1.setVisibility(View.VISIBLE);
            btn1.setText("Start Reading");
        }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ReadingFile(f.getPath(),meta);

                if(Integer.parseInt(meta.get(1))>0)
                {
                    Intent intent = new Intent(MainActivity.this, page2.class);
                    startActivity(intent);
                }
            }
        });

    }











    /*********************MY methods defined**************************/

    public class DownloadTask extends AsyncTask<String,Integer,String> {
        ProgressDialog progress;


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progress=new ProgressDialog(MainActivity.this);
            progress.setMessage("Donwloading Files");
            progress.setMax(100);
            progress.setProgress(0);
            progress.setProgressStyle(progress.STYLE_HORIZONTAL);
            progress.setCancelable(false);
            progress.show();
        }

        @Override
        protected String doInBackground(String... params) {
            String path=params[0];
            int file_length=0;
            try {
                URL url = new URL(path);
                URLConnection urlConnection=url.openConnection();
                urlConnection.connect();
                file_length=urlConnection.getContentLength();
               File new_folder=new File(Environment.getExternalStorageDirectory(),"Download/Story/The Best Seller");
              //  File new_folder=new File(Environment.getExternalStorageDirectory(),"Download/Story/T");
                if (!new_folder.exists())
                {
                    new_folder.mkdirs();
                }
                File input_file=new File(new_folder,"The_Best_Seller.zip");
               // File input_file=new File(new_folder,"T.zip");
                InputStream inputStream=new BufferedInputStream(url.openStream(),8192);
                byte[]data=new byte[1024];
                int total=0;
                int count=0;
                OutputStream outputStream=new FileOutputStream(input_file);
                while ((count=inputStream.read(data))!=-1){
                    total+=count;
                    outputStream.write(data,0,count);
                    int progressc=(int)total+100/file_length;
                    publishProgress(progressc);
                }
                inputStream.close();
                outputStream.close();
            }
            catch (MalformedURLException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "Downloaded";
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            progress.setProgress(values[0]);
        }

        @Override
        protected void onPostExecute(String result) {
            progress.hide();
            String srcpath="sdcard/Download/Story/The Best Seller/The_Best_Seller.zip";
            File check =new File("sdcard/Download/Story/The Best Seller/0.txt");
            if(!check.exists()) {
              //  Unzip(srcpath, "sdcard/Download/Story/T/T.zip");
                Unzip(srcpath, "sdcard/Download/Story/The Best Seller");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            btn1.setVisibility(View.VISIBLE);
        }
    }



    private static void Unzip(String zipFilePath,String destDir){
        File dir=new File(destDir);
        // create output directory if it doesn't exist
        if(!dir.exists())dir.mkdirs();
        FileInputStream fis;
        //buffer for read and write data to file
        byte[]buffer=new byte[1024];
        try{
            fis=new FileInputStream(zipFilePath);
            ZipInputStream zis=new ZipInputStream(fis);
            ZipEntry ze=zis.getNextEntry();
            while(ze!=null){
                String fileName=ze.getName();
                File newFile=new File(destDir+File.separator+fileName);
                System.out.println("Unzipping to "+newFile.getAbsolutePath());
                //create directories for sub directories in zip
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos=new FileOutputStream(newFile);
                int len;
                while((len=zis.read(buffer))>0){
                    fos.write(buffer,0,len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze=zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }


    }



    public  boolean haveStoragePermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.e("Permission error","You have permission");
                return true;
            } else {

                Log.e("Permission error","You have asked for permission");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else { //you dont need to worry about these stuff below api level 23
            Log.e("Permission error","You already have the permission");
            return true;
        }
    }


    public static void ReadingFile(String path,ArrayList list){

        try {
            FileInputStream inputStream = new FileInputStream(path);
            // this is to open a file from resource InputStream inputStream = context.getResources().openRawResource(R.raw.sample);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();

            while (line != null) {
                line=line.replace("\\n","\n");
                list.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    };

    /************App compactivity*************/
}
