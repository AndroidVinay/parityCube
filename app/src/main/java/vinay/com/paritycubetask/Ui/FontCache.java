package vinay.com.paritycubetask.Ui;

/**
 * Created by asus on 7/31/2016.
 */
import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

/**
 * Simple font cache, keeps us from having to reload the same font over
 * and over again.
 */
public class FontCache {
    private static HashMap<String, Typeface> fontCache = new HashMap<>();

    public static Typeface getTypeface(String fontname, Context context) {
        Typeface typeface = fontCache.get(fontname);

        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), fontname);
            } catch (Exception e) {
                return null;
            }

            fontCache.put(fontname, typeface);
        }

        return typeface;
    }
}