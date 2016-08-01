package vinay.com.paritycubetask.Ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by asus on 7/31/2016.
 */
public class CustomTextView extends TextView {
    public static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context, attrs);
    }

    private void applyCustomFont(Context context, AttributeSet attrs) {
        int textStyle = attrs.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", Typeface.NORMAL);

        Typeface customFont = selectTypeface(context, textStyle);
        setTypeface(customFont);
    }

    private Typeface selectTypeface(Context context, int textStyle) {
        /*
        * information about the TextView textStyle:
        * http://developer.android.com/reference/android/R.styleable.html#TextView_textStyle
        */
        switch (textStyle) {
            case Typeface.BOLD: // bold
                return FontCache.getTypeface("Roboto-Bold.ttf", context);

            case Typeface.ITALIC: // italic
                return FontCache.getTypeface("Roboto-Italic.ttf", context);

            case Typeface.BOLD_ITALIC: // bold italic
                return FontCache.getTypeface("Roboto-BoldItalic.ttf", context);

            case Typeface.NORMAL: // regular
            default:
//                return FontCache.getTypeface("Roboto-Regular.ttf", context);
                return FontCache.getTypeface("Roboto-BoldItalic.ttf", context);
        }
    }
}
