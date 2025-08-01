package me.mamiiblt.instafel.utils.localization;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import me.mamiiblt.instafel.R;

public class Locales {

    public static final Map<String, LocaleType> SUPPORTED_LOCALES;
    static {
        Map<String, LocaleType> map = new LinkedHashMap<>();
        map.put("en", new LocaleType("en", "English", "United States", R.drawable.ifl_flag_us));
        map.put("tr", new LocaleType("tr", "Türkçe", "Türkiye", R.drawable.ifl_flag_tr));
        map.put("az", new LocaleType("az", "Azərbaycanca", "Azərbaycan", R.drawable.ifl_flag_az));
        map.put("de", new LocaleType("de", "Deutsch", "Deutschland", R.drawable.ifl_flag_de));
        map.put("el", new LocaleType("el", "Ελληνικά", "Ελλάδα", R.drawable.ifl_flag_el));
        map.put("fr", new LocaleType("fr", "Français", "France", R.drawable.ifl_flag_fr));
        map.put("hu", new LocaleType("hu", "Magyar", "Magyarország", R.drawable.ifl_flag_hu));
        map.put("hi", new LocaleType("hi", "हिंदी", "भारत", R.drawable.ifl_flag_hi));
        map.put("es", new LocaleType("es", "Español", "España", R.drawable.ifl_flag_es));
        map.put("pt", new LocaleType("pt", "Portugal", "Português", R.drawable.ifl_flag_pt));
        map.put("pl", new LocaleType("pl", "Polski", "Polska", R.drawable.ifl_flag_pl));
        SUPPORTED_LOCALES = Collections.unmodifiableMap(map);
    }

    public static class LocaleType {
        public String langCode, langName, langCountry;
        public int flagDrawableID;

        public LocaleType(String langCode, String langName, String langCountry, int flagDrawableID) {
            this.langCode = langCode;
            this.langName = langName;
            this.langCountry = langCountry;
            this.flagDrawableID = flagDrawableID;
        }
    }
}
