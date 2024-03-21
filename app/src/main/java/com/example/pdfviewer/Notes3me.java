package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Notes3me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes3me);

        PDFView syll=findViewById(R.id.pdfview);
        //syll.fromUri(Uri.parse("https://docs.google.com/document/d/1pJ0xZilIlkph3XzaqrfF06w0XFIJpQxcA8HqHVQfxs8/edit")).load();
syll.fromAsset("3rdSemME.pdf").load();
    }
}