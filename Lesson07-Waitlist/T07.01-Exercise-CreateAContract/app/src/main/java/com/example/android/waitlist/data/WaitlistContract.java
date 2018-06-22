package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public class WaitlistContract {

    // COMPLETED (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    public static final class WaitlistEntry implements BaseColumns {
        // COMPLETED (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        public final static String TABLE_NAME = "waitlist";
        // COLUMN_GUEST_NAME -> guestName
        public final static String COLUMN_GUEST_NAME = "guestName";
        // COLUMN_PARTY_SIZE -> partySize
        public final static String COLUMN_PARTY_SIZE = "partySize";
        // COLUMN_TIMESTAMP -> timestamp
        public final static String COLUMN_TIMESTAMP = "timestamp";
    }

}
