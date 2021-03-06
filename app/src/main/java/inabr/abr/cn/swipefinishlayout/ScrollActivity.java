package inabr.abr.cn.swipefinishlayout;

import android.os.Bundle;
import android.view.View;

import inabr.abr.cn.swipefinishlayout.view.SwipeFinishLayout;


public class ScrollActivity extends SwipeFinishActivity {

    private View mCloseView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        // 只支持下滑退出
        setSlideFinishFlags(SwipeFinishLayout.FLAG_SCROLL_DOWN_FINISH);

        mCloseView = findViewById(R.id.img_close);
        mCloseView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScrollActivity.this.finish();
            }
        });
    }
}
