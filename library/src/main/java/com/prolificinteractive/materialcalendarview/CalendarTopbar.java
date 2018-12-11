package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class CalendarTopbar extends LinearLayout {

    public CalendarTopbar(Context context) {
        super(context);
        init(context, null);
    }

    public CalendarTopbar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CalendarTopbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    protected void init(Context context, AttributeSet attrs) {
        View veiw = inflate(context, R.layout.calendar_view, this);
        setOrientation(VERTICAL);
    }
}
