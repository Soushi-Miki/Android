package app.miki.mikiso.sound

import android.annotation.SuppressLint
import android.media.MediaParser
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ドラムのサウンドファイルを読み込んで、プレイヤーをつくる
        val drumSound = MediaPlayer.create(this, R.raw.drum_sound)

        //ドラムがタッチされた時に呼ばれる
        drumImage.setOnTouchListener { view, event ->

            //タッチが始まった時に
            if (event.action == MotionEvent.ACTION_DOWN) {

                //ドラムが鳴っている画像に切り替える
                drumImage.setImageResource(R.drawable.drum_playing_image)
                //ドラムの音を巻き戻す
                drumSound.seekTo(0)
                //ドラムの音を再生する
                drumSound.start()
            }
            //タッチが終わるときに
            else if (event.action==MotionEvent.ACTION_UP){
                //ドラムが鳴っていない画像に切り替える
                drumImage.setImageResource(R.drawable.drum_image)
            }
            //タッチの処理を終える
            true
        }
        //ピアノサウンドファイルを読み込んで、プレイヤーをつくる
        val pianosound = MediaPlayer.create(this, R.raw.piano_sound)

        //ピアノがタッチされた時に呼ばれる
        pianoImage.setOnTouchListener{ view, event->

            //タッチが始まった時に
            if (event.action ==MotionEvent.ACTION_DOWN){
                //ピアノが鳴っている画像に切り替える
                pianoImage.setImageResource(R.drawable.piano_playing_image)
                //ピアノの音を巻き戻す
                pianosound.seekTo(0)
                //ピアノの音を再生する
                pianosound.start()
            }
            else if (event.action == MotionEvent.ACTION_UP){
                //ピアノが鳴っていない画像に切り替える
                pianoImage.setImageResource(R.drawable.piano_image)

            }
            //タッチの処理を終える
            true
        }
        //ギターサウンドファイルを読み込んで、プレイヤーをつくる
        val guitarSound = MediaPlayer.create(this, R.raw.guitar_sound)

        //ギターがタッチされた時に呼ばれる
        guitarImage.setOnTouchListener{ view, event->

            //タッチが始まった時に
            if (event.action ==MotionEvent.ACTION_DOWN){
                //ギターが鳴っている画像に切り替える
                guitarImage.setImageResource(R.drawable.guitar_playing_image)
                //ギターの音を巻き戻す
                guitarSound.seekTo(0)
                //ギターの音を再生する
                guitarSound.start()
            }
            else if (event.action == MotionEvent.ACTION_UP){
                //ギターが鳴っていない画像に切り替える
                guitarImage.setImageResource(R.drawable.guitar_image)

            }
            //タッチの処理を終える
            true
        }
    }
}


