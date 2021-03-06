package com.example.stjepan.zavrsnirad_v1.data;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class FoodContract {

    private FoodContract(){}

    /**The "Content authority" is a name for the entire content provider, similar to the
     relationship between a domain name and its website.  A convenient string to use for the
     content authority is the package name for the app, which is guaranteed to be unique on the device. */
    public static final String CONTENT_AUTHORITY = "com.example.stjepan.zavrsnirad_v1";

    /**Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact the content provider. */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_FOOD = "food";

    public static final class FoodEntry /*implements BaseColumns*/{

        /** The content URI to access the food data in the provider */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_FOOD);

        public static final String CONTENT_LIST_TYPE=
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_FOOD;

        public static final String CONTENT_ITEM_TYPE =
               ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_FOOD;

        public final static String _ID_FOODS = "id_foods";
        public final static String TABLE_NAME = "foods";
        public final static String COLUMN_FOOD_NAME = "name";
        public final static String COLUMN_FAT_TOTAL = "fat_total";
        public final static String COLUMN_OMEGA3 = "omega3";
        public final static String COLUMN_OMEGA6 = "omega6";
        public final static String COLUMN_PROTEINS = "proteins_total";
        public final static String COLUMN_CARBOHYDRATES = "carbohydrates_total";
        public final static String COLUMN_ENERGY = "energy";

        public final static String TABLE_NAME_HELPER = "help_table";
        public final static String _ID_HELPER = "id_helper";
        public final static String FOREIGN_FOODS_ID = "fk_foods_id";
        public final static String FOREIGN_MENU_ID = "fk_menu_id";
        public final static String COLUMN_GRAM = "gram";
        public final static String COLUMN_GRAM_TOTAL = "gram_total";

        public final static String TABLE_NAME_MENU = "menu";
        public final static String _ID_MENU = "id_menu";
        public final static String FOOD_TIME = "drv";

        public final static String TABLE_NAME_MENU_TOTAL = "menu_total";
        public final static String _ID_MENU_TOTAL = "id_menu_total";
        public final static String COLUMN_BREAKFAST = "Doručak";
        public final static String COLUMN_LUNCH = "Ručak";
        public final static String COLUMN_DINNER = "Večera";
        public final static String COLUMN_DATE = "date";
    }
}


