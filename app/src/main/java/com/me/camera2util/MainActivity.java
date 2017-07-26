package com.me.camera2util;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        }

        /**
         * 设置壁纸
         * @param view
         */
        public void wallpaper(View view) {
                startWallpaper();

        }

        /**
         * 拍照
         * @param view
         */
        public void photograph(View view) {
                startActivity(new Intent(this,MyCameraActivity.class));
        }

        /**
         * 选择壁纸
         */
        private void startWallpaper(){
                Intent pickWallpaper = new Intent(Intent.ACTION_SET_WALLPAPER);
                Intent chooser = Intent.createChooser(pickWallpaper, getString(R.string.choose_wallpaper));
                startActivity(chooser);

        }

        /**
         * 拍照2
         * @param view
         */
        public void photograph2(View view) {

                startActivity(new Intent(this,Camera2Activity.class));
        }
}
