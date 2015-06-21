package com.jareddlc.openfit.util;

public final class OpenFitDataTypeOld {
    // DataType
    public static final OpenFitDataTypeOld BIT;
    public static final OpenFitDataTypeOld BYTE;
    public static final OpenFitDataTypeOld DOUBLE;
    private static final OpenFitDataTypeOld ENUM$VALUES[];
    public static final OpenFitDataTypeOld FLOAT;
    public static final OpenFitDataTypeOld INT;
    public static final OpenFitDataTypeOld LONG;
    public static final OpenFitDataTypeOld SHORT;
    public static int i;
    public static String s;
    // OpenFitDataType
    public static final OpenFitDataTypeOld DATA_TYPE_ALARM;
    public static final OpenFitDataTypeOld DATA_TYPE_ALARM_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_ALERT_STYLE;
    public static final OpenFitDataTypeOld DATA_TYPE_CALLER_INFO;
    public static final OpenFitDataTypeOld DATA_TYPE_CALL_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_CHATON;
    public static final OpenFitDataTypeOld DATA_TYPE_CMAS;
    public static final OpenFitDataTypeOld DATA_TYPE_CONNECTION_OFF;
    public static final OpenFitDataTypeOld DATA_TYPE_CONNECTION_ON;
    public static final OpenFitDataTypeOld DATA_TYPE_DELETE_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_DELETE_APP_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_DELETE_BY_MAX_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_DOSAGE_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_DOSAGE_ALARM;
    public static final OpenFitDataTypeOld DATA_TYPE_EAS;
    public static final OpenFitDataTypeOld DATA_TYPE_EMAIL;
    public static final OpenFitDataTypeOld DATA_TYPE_EMAIL_REPLY_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_EMAIL_REPLY_MESSAGE;
    public static final OpenFitDataTypeOld DATA_TYPE_GENERAL;
    public static final OpenFitDataTypeOld DATA_TYPE_IMAGE;
    public static final OpenFitDataTypeOld DATA_TYPE_IMAGE_REQUEST;
    public static final OpenFitDataTypeOld DATA_TYPE_INCOMING_CALL;
    public static final OpenFitDataTypeOld DATA_TYPE_LIMITATION_END;
    public static final OpenFitDataTypeOld DATA_TYPE_LIMITATION_START;
    public static final OpenFitDataTypeOld DATA_TYPE_MESSAGE;
    public static final OpenFitDataTypeOld DATA_TYPE_MISSED_CALL;
    public static final OpenFitDataTypeOld DATA_TYPE_MYSINGLE;
    public static final OpenFitDataTypeOld DATA_TYPE_NOTI_END;
    public static final OpenFitDataTypeOld DATA_TYPE_QUICK_REPLY_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_QUICK_REPLY_MESSAGE;
    public static final OpenFitDataTypeOld DATA_TYPE_READ_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_READ_ALL_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_READ_MYSINGLE_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_REJECT_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_REJECT_MESSAGE;
    public static final OpenFitDataTypeOld DATA_TYPE_REPORT;
    public static final OpenFitDataTypeOld DATA_TYPE_RESERVED;
    public static final OpenFitDataTypeOld DATA_TYPE_SAFETY;
    public static final OpenFitDataTypeOld DATA_TYPE_SHOW_ON_DEVICE_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_SMART_RELAY_REMOTE_OFF;
    public static final OpenFitDataTypeOld DATA_TYPE_SMART_RELAY_REMOTE_ON;
    public static final OpenFitDataTypeOld DATA_TYPE_SMART_RELAY_REQUEST;
    public static final OpenFitDataTypeOld DATA_TYPE_SMART_RELAY_RESPONSE;
    public static final OpenFitDataTypeOld DATA_TYPE_SPLANNER;
    public static final OpenFitDataTypeOld DATA_TYPE_SPLANNER_ACTION;
    public static final OpenFitDataTypeOld DATA_TYPE_SYNC_END;
    public static final OpenFitDataTypeOld DATA_TYPE_SYNC_START;
    public static final OpenFitDataTypeOld DATA_TYPE_TIME_FORMAT;
    public static final OpenFitDataTypeOld DATA_TYPE_WATER_INTAKE;
    public static final OpenFitDataTypeOld DATA_TYPE_WEATHER;
    //private static final OpenFitDataType ENUM$VALUES[];

    private OpenFitDataTypeOld(String s, int i) {
        //super();
        this.s = s;
        this.i  = i;
    }

    public static OpenFitDataTypeOld[] values() {
        OpenFitDataTypeOld adatatype[] = ENUM$VALUES;
        int i = adatatype.length;
        OpenFitDataTypeOld adatatype1[] = new OpenFitDataTypeOld[i];
        System.arraycopy(adatatype, 0, adatatype1, 0, i);
        return adatatype1;
    }

    static {
        // DataType
        BYTE = new OpenFitDataTypeOld("BYTE", 0);
        SHORT = new OpenFitDataTypeOld("SHORT", 1);
        INT = new OpenFitDataTypeOld("INT", 2);
        LONG = new OpenFitDataTypeOld("LONG", 3);
        FLOAT = new OpenFitDataTypeOld("FLOAT", 4);
        DOUBLE = new OpenFitDataTypeOld("DOUBLE", 5);
        BIT = new OpenFitDataTypeOld("BIT", 6);
        OpenFitDataTypeOld adatatype[] = new OpenFitDataTypeOld[7];
        adatatype[0] = BYTE;
        adatatype[1] = SHORT;
        adatatype[2] = INT;
        adatatype[3] = LONG;
        adatatype[4] = FLOAT;
        adatatype[5] = DOUBLE;
        adatatype[6] = BIT;
        ENUM$VALUES = adatatype;
        // OpenFitDataType
        DATA_TYPE_INCOMING_CALL = new OpenFitDataTypeOld("DATA_TYPE_INCOMING_CALL", 0);
        DATA_TYPE_MISSED_CALL = new OpenFitDataTypeOld("DATA_TYPE_MISSED_CALL", 1);
        DATA_TYPE_NOTI_END = new OpenFitDataTypeOld("DATA_TYPE_NOTI_END", 2);
        DATA_TYPE_EMAIL = new OpenFitDataTypeOld("DATA_TYPE_EMAIL", 3);
        DATA_TYPE_MESSAGE = new OpenFitDataTypeOld("DATA_TYPE_MESSAGE", 4);
        DATA_TYPE_ALARM = new OpenFitDataTypeOld("DATA_TYPE_ALARM", 5);
        DATA_TYPE_SPLANNER = new OpenFitDataTypeOld("DATA_TYPE_SPLANNER", 6);
        DATA_TYPE_WEATHER = new OpenFitDataTypeOld("DATA_TYPE_WEATHER", 7);
        DATA_TYPE_WATER_INTAKE = new OpenFitDataTypeOld("DATA_TYPE_WATER_INTAKE", 8);
        DATA_TYPE_DOSAGE_ALARM = new OpenFitDataTypeOld("DATA_TYPE_DOSAGE_ALARM", 9);
        DATA_TYPE_CHATON = new OpenFitDataTypeOld("DATA_TYPE_CHATON", 10);
        DATA_TYPE_MYSINGLE = new OpenFitDataTypeOld("DATA_TYPE_MYSINGLE", 11);
        DATA_TYPE_GENERAL = new OpenFitDataTypeOld("DATA_TYPE_GENERAL", 12);
        DATA_TYPE_REJECT_ACTION = new OpenFitDataTypeOld("DATA_TYPE_REJECT_ACTION", 13);
        DATA_TYPE_ALARM_ACTION = new OpenFitDataTypeOld("DATA_TYPE_ALARM_ACTION", 14);
        DATA_TYPE_SPLANNER_ACTION = new OpenFitDataTypeOld("DATA_TYPE_SPLANNER_ACTION", 15);
        DATA_TYPE_DOSAGE_ACTION = new OpenFitDataTypeOld("DATA_TYPE_DOSAGE_ACTION", 16);
        DATA_TYPE_SMART_RELAY_REQUEST = new OpenFitDataTypeOld("DATA_TYPE_SMART_RELAY_REQUEST", 17);
        DATA_TYPE_SMART_RELAY_RESPONSE = new OpenFitDataTypeOld("DATA_TYPE_SMART_RELAY_RESPONSE", 18);
        DATA_TYPE_READ_ACTION = new OpenFitDataTypeOld("DATA_TYPE_READ_ACTION", 19);
        DATA_TYPE_CONNECTION_ON = new OpenFitDataTypeOld("DATA_TYPE_CONNECTION_ON", 20);
        DATA_TYPE_CONNECTION_OFF = new OpenFitDataTypeOld("DATA_TYPE_CONNECTION_OFF", 21);
        DATA_TYPE_DELETE_ACTION = new OpenFitDataTypeOld("DATA_TYPE_DELETE_ACTION", 22);
        DATA_TYPE_SHOW_ON_DEVICE_ACTION = new OpenFitDataTypeOld("DATA_TYPE_SHOW_ON_DEVICE_ACTION", 23);
        DATA_TYPE_QUICK_REPLY_MESSAGE = new OpenFitDataTypeOld("DATA_TYPE_QUICK_REPLY_MESSAGE", 24);
        DATA_TYPE_QUICK_REPLY_ACTION = new OpenFitDataTypeOld("DATA_TYPE_QUICK_REPLY_ACTION", 25);
        DATA_TYPE_REJECT_MESSAGE = new OpenFitDataTypeOld("DATA_TYPE_REJECT_MESSAGE", 26);
        DATA_TYPE_LIMITATION_START = new OpenFitDataTypeOld("DATA_TYPE_LIMITATION_START", 27);
        DATA_TYPE_LIMITATION_END = new OpenFitDataTypeOld("DATA_TYPE_LIMITATION_END", 28);
        DATA_TYPE_TIME_FORMAT = new OpenFitDataTypeOld("DATA_TYPE_TIME_FORMAT", 29);
        DATA_TYPE_ALERT_STYLE = new OpenFitDataTypeOld("DATA_TYPE_ALERT_STYLE", 30);
        DATA_TYPE_EMAIL_REPLY_MESSAGE = new OpenFitDataTypeOld("DATA_TYPE_EMAIL_REPLY_MESSAGE", 31);
        DATA_TYPE_EMAIL_REPLY_ACTION = new OpenFitDataTypeOld("DATA_TYPE_EMAIL_REPLY_ACTION", 32);
        DATA_TYPE_IMAGE = new OpenFitDataTypeOld("DATA_TYPE_IMAGE", 33);
        DATA_TYPE_CALL_ACTION = new OpenFitDataTypeOld("DATA_TYPE_CALL_ACTION", 34);
        DATA_TYPE_CMAS = new OpenFitDataTypeOld("DATA_TYPE_CMAS", 35);
        DATA_TYPE_EAS = new OpenFitDataTypeOld("DATA_TYPE_EAS", 36);
        DATA_TYPE_SAFETY = new OpenFitDataTypeOld("DATA_TYPE_SAFETY", 37);
        DATA_TYPE_REPORT = new OpenFitDataTypeOld("DATA_TYPE_REPORT", 38);
        DATA_TYPE_SYNC_START = new OpenFitDataTypeOld("DATA_TYPE_SYNC_START", 39);
        DATA_TYPE_SYNC_END = new OpenFitDataTypeOld("DATA_TYPE_SYNC_END", 40);
        DATA_TYPE_CALLER_INFO = new OpenFitDataTypeOld("DATA_TYPE_CALLER_INFO", 41);
        DATA_TYPE_IMAGE_REQUEST = new OpenFitDataTypeOld("DATA_TYPE_IMAGE_REQUEST", 42);
        DATA_TYPE_SMART_RELAY_REMOTE_ON = new OpenFitDataTypeOld("DATA_TYPE_SMART_RELAY_REMOTE_ON", 43);
        DATA_TYPE_SMART_RELAY_REMOTE_OFF = new OpenFitDataTypeOld("DATA_TYPE_SMART_RELAY_REMOTE_OFF", 44);
        DATA_TYPE_DELETE_APP_ACTION = new OpenFitDataTypeOld("DATA_TYPE_DELETE_APP_ACTION", 45);
        DATA_TYPE_READ_ALL_ACTION = new OpenFitDataTypeOld("DATA_TYPE_READ_ALL_ACTION", 46);
        DATA_TYPE_READ_MYSINGLE_ACTION = new OpenFitDataTypeOld("DATA_TYPE_READ_MYSINGLE_ACTION", 47);
        DATA_TYPE_DELETE_BY_MAX_ACTION = new OpenFitDataTypeOld("DATA_TYPE_DELETE_BY_MAX_ACTION", 48);
        DATA_TYPE_RESERVED = new OpenFitDataTypeOld("DATA_TYPE_RESERVED", 49);
        OpenFitDataTypeOld aedatatype[] = new OpenFitDataTypeOld[50];
        aedatatype[0] = DATA_TYPE_INCOMING_CALL;
        aedatatype[1] = DATA_TYPE_MISSED_CALL;
        aedatatype[2] = DATA_TYPE_NOTI_END;
        aedatatype[3] = DATA_TYPE_EMAIL;
        aedatatype[4] = DATA_TYPE_MESSAGE;
        aedatatype[5] = DATA_TYPE_ALARM;
        aedatatype[6] = DATA_TYPE_SPLANNER;
        aedatatype[7] = DATA_TYPE_WEATHER;
        aedatatype[8] = DATA_TYPE_WATER_INTAKE;
        aedatatype[9] = DATA_TYPE_DOSAGE_ALARM;
        aedatatype[10] = DATA_TYPE_CHATON;
        aedatatype[11] = DATA_TYPE_MYSINGLE;
        aedatatype[12] = DATA_TYPE_GENERAL;
        aedatatype[13] = DATA_TYPE_REJECT_ACTION;
        aedatatype[14] = DATA_TYPE_ALARM_ACTION;
        aedatatype[15] = DATA_TYPE_SPLANNER_ACTION;
        aedatatype[16] = DATA_TYPE_DOSAGE_ACTION;
        aedatatype[17] = DATA_TYPE_SMART_RELAY_REQUEST;
        aedatatype[18] = DATA_TYPE_SMART_RELAY_RESPONSE;
        aedatatype[19] = DATA_TYPE_READ_ACTION;
        aedatatype[20] = DATA_TYPE_CONNECTION_ON;
        aedatatype[21] = DATA_TYPE_CONNECTION_OFF;
        aedatatype[22] = DATA_TYPE_DELETE_ACTION;
        aedatatype[23] = DATA_TYPE_SHOW_ON_DEVICE_ACTION;
        aedatatype[24] = DATA_TYPE_QUICK_REPLY_MESSAGE;
        aedatatype[25] = DATA_TYPE_QUICK_REPLY_ACTION;
        aedatatype[26] = DATA_TYPE_REJECT_MESSAGE;
        aedatatype[27] = DATA_TYPE_LIMITATION_START;
        aedatatype[28] = DATA_TYPE_LIMITATION_END;
        aedatatype[29] = DATA_TYPE_TIME_FORMAT;
        aedatatype[30] = DATA_TYPE_ALERT_STYLE;
        aedatatype[31] = DATA_TYPE_EMAIL_REPLY_MESSAGE;
        aedatatype[32] = DATA_TYPE_EMAIL_REPLY_ACTION;
        aedatatype[33] = DATA_TYPE_IMAGE;
        aedatatype[34] = DATA_TYPE_CALL_ACTION;
        aedatatype[35] = DATA_TYPE_CMAS;
        aedatatype[36] = DATA_TYPE_EAS;
        aedatatype[37] = DATA_TYPE_SAFETY;
        aedatatype[38] = DATA_TYPE_REPORT;
        aedatatype[39] = DATA_TYPE_SYNC_START;
        aedatatype[40] = DATA_TYPE_SYNC_END;
        aedatatype[41] = DATA_TYPE_CALLER_INFO;
        aedatatype[42] = DATA_TYPE_IMAGE_REQUEST;
        aedatatype[43] = DATA_TYPE_SMART_RELAY_REMOTE_ON;
        aedatatype[44] = DATA_TYPE_SMART_RELAY_REMOTE_OFF;
        aedatatype[45] = DATA_TYPE_DELETE_APP_ACTION;
        aedatatype[46] = DATA_TYPE_READ_ALL_ACTION;
        aedatatype[47] = DATA_TYPE_READ_MYSINGLE_ACTION;
        aedatatype[48] = DATA_TYPE_DELETE_BY_MAX_ACTION;
        aedatatype[49] = DATA_TYPE_RESERVED;
        //ENUM$VALUES = aedatatype;
    }
}
