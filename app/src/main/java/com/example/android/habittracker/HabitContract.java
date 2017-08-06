package com.example.android.habittracker;

import android.provider.BaseColumns;

/**
 * Created by CRIZMA-PC&LAPTOP on 03/08/2017.
 */

public class HabitContract {

    public HabitContract() {
    }

    public class HabitEntry implements BaseColumns {

        public final static String TABLE_NAME = "daily_tracking";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_DATE = "date";
        public final static String COLUMN_HABIT = "habit";
        public final static String COLUMN_COMMENT = "comment";

        public final static int HABIT_READING = 0;
        public final static int HABIT_PROGRAMMING = 1;
        public final static int HABIT_RUNNING = 2;
    }

}