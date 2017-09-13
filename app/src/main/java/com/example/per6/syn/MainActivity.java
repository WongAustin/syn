package com.example.per6.syn;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final int WHOLE_NOTE = 1000;
    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton,
    highaButton, highasButton, highbButton, highcButton, highcsButton, highdButton, highdsButton, higheButton, highfButton, highfsButton,
    highgButton, highgsButton, challenge0Button, challenge1Button, challenge3Button, challenge5Button;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote ,gNote, gsNote,
    highaNote, highasNote, highbNote, highcNote, highcsNote, highdNote, highdsNote, higheNote, highfNote, highfsNote ,highgNote, highgsNote;
    MediaPlayer p[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wirewidgets();
        setListeners();
        CreateMediaPlayers();
    }

    private void CreateMediaPlayers() {
        aNote = MediaPlayer.create(this,R.raw.scalea);
        asNote = MediaPlayer.create(this,R.raw.scalebb);
        bNote = MediaPlayer.create(this,R.raw.scaleb);
        cNote = MediaPlayer.create(this,R.raw.scalec);
        csNote = MediaPlayer.create(this,R.raw.scalecs);
        dNote = MediaPlayer.create(this,R.raw.scaled);
        dsNote = MediaPlayer.create(this,R.raw.scaleds);
        eNote = MediaPlayer.create(this,R.raw.scalee);
        fNote = MediaPlayer.create(this,R.raw.scalef);
        fsNote = MediaPlayer.create(this,R.raw.scalefs);
        gNote = MediaPlayer.create(this,R.raw.scaleg);
        gsNote = MediaPlayer.create(this,R.raw.scalegs);
        highaNote = MediaPlayer.create(this,R.raw.scalehigha);
        highasNote = MediaPlayer.create(this,R.raw.scalehighbb);
        highbNote = MediaPlayer.create(this,R.raw.scalehighb);
        highcNote = MediaPlayer.create(this,R.raw.scalehighc);
        highcsNote = MediaPlayer.create(this,R.raw.scalehighcs);
        highdNote = MediaPlayer.create(this,R.raw.scalehighd);
        highdsNote = MediaPlayer.create(this,R.raw.scalehighds);
        higheNote = MediaPlayer.create(this,R.raw.scalehighe);
        highfNote = MediaPlayer.create(this,R.raw.scalehighf);
        highfsNote = MediaPlayer.create(this,R.raw.scalehighfs);
        highgNote = MediaPlayer.create(this,R.raw.scalehighg);
        highgsNote = MediaPlayer.create(this,R.raw.scalehighgs);
        p = new MediaPlayer[]{ aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote,
                highaNote, highasNote, highbNote, highcNote, highcsNote, highdNote, highdsNote, higheNote, highfNote, highfsNote,
                highgNote, highgsNote};

    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        highaButton.setOnClickListener(this);
        highasButton.setOnClickListener(this);
        highbButton.setOnClickListener(this);
        highcButton.setOnClickListener(this);
        highcsButton.setOnClickListener(this);
        highdButton.setOnClickListener(this);
        highdsButton.setOnClickListener(this);
        higheButton.setOnClickListener(this);
        highfButton.setOnClickListener(this);
        highfsButton.setOnClickListener(this);
        highgButton.setOnClickListener(this);
        highgsButton.setOnClickListener(this);
    }

    private void wirewidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        highaButton = (Button) findViewById(R.id.button_higha);
        highasButton = (Button) findViewById(R.id.button_highas);
        highbButton = (Button) findViewById(R.id.button_highb);
        highcButton = (Button) findViewById(R.id.button_highc);
        highcsButton = (Button) findViewById(R.id.button_highcs);
        highdButton = (Button) findViewById(R.id.button_highd);
        highdsButton = (Button) findViewById(R.id.button_highds);
        higheButton = (Button) findViewById(R.id.button_highe);
        highfButton = (Button) findViewById(R.id.button_highf);
        highfsButton = (Button) findViewById(R.id.button_highfs);
        highgButton = (Button) findViewById(R.id.button_highg);
        highgsButton = (Button) findViewById(R.id.button_highgs);
        challenge0Button = (Button) findViewById(R.id.button_challenge0);
        challenge1Button =(Button) findViewById(R.id.button_challenge1);
        challenge3Button =(Button) findViewById(R.id.button_challenge3);
        challenge5Button = (Button) findViewById(R.id.button_challenge5);
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_a:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_as:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.button_higha:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_highas:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_highb:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_highc:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_highcs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_highd:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_highds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_highe:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_highf:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_highfs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_highg:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_highgs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            default:
        }


    challenge0Button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.e("SynthesizerActivity", "Challenge 0 Button clicked");
            try {
                eNote.start();
                delayPlaying(WHOLE_NOTE);
                fNote.start();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
        challenge1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("SynthesizerActivity", "Challenge 1 Button clicked");
                try {
                    eNote.start();
                    delayPlaying(WHOLE_NOTE);
                    fsNote.start();
                    delayPlaying(WHOLE_NOTE);
                    gNote.start();
                    delayPlaying(WHOLE_NOTE);
                    highaNote.start();
                    delayPlaying(WHOLE_NOTE);
                    highbNote.start();
                    delayPlaying(WHOLE_NOTE);
                    highcsNote.start();
                    delayPlaying(WHOLE_NOTE);
                    highdNote.start();
                    delayPlaying(WHOLE_NOTE);
                    higheNote.start();





                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        challenge3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("SynthesizerActivity", "Challenge 3 Button clicked");
                try {
                    p[7].start();
                    delayPlaying(WHOLE_NOTE);
                    p[9].start();
                    delayPlaying(WHOLE_NOTE);
                    p[10].start();
                    delayPlaying(WHOLE_NOTE);
                    p[12].start();
                    delayPlaying(WHOLE_NOTE);
                    p[14].start();
                    delayPlaying(WHOLE_NOTE);
                    p[16].start();
                    delayPlaying(WHOLE_NOTE);
                    p[17].start();
                    delayPlaying(WHOLE_NOTE);
                    p[19].start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        challenge5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("SynthesizerActivity", "Challenge 5 Button clicked");
                try {
                    p[1].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[1].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[20].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[20].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[21].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[21].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[20].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[5].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[5].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[4].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[4].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[2].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[2].start();
                    delayPlaying(WHOLE_NOTE/2);
                    p[0].start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
}
}
