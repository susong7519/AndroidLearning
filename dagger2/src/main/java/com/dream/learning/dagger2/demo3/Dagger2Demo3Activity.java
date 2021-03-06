package com.dream.learning.dagger2.demo3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo3Activity extends AppCompatActivity {

    @Inject
    Dagger2Demo3Application mDagger2Demo3Application;
    @Inject
    Dagger2Demo3Application mDagger2Demo3Application2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // AndroidManifest 文件中必须设置对应的 application
        // android:name=".demo3.Dagger2Demo3Application"
        Dagger2Demo3Application.getDagger2Demo3Component().inject(this);

        if (mDagger2Demo3Application != null) {
            Log.d("XLog", "mDagger2Demo3Application != null " + mDagger2Demo3Application);
        } else {
            Log.d("XLog", "mDagger2Demo3Application == null");
        }

        if (mDagger2Demo3Application2 != null) {
            Log.d("XLog", "mDagger2Demo3Application2 != null " + mDagger2Demo3Application2);
        } else {
            Log.d("XLog", "mDagger2Demo3Application2 == null");
        }
    }
}
