package com.aincorp.inventory.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Алмаз on 07.09.14.
 */
public class CalendarUtils {

    /**
     * Стандартный формат даты год-месяц-день.
     */
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Возвращает дату в виде отформатированной строки.Для определенной даты в методе
     * мспользуется формат.
     *
     * @param calendar дата которая вернется строкой
     * @return отформатированная строка
     */
    public static String format(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return DATE_FORMAT.format(calendar.getTime());
    }
}
