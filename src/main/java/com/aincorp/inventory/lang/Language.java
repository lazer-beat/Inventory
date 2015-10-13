package com.aincorp.inventory.lang;

import java.io.*;
import java.util.*;

/**
 * Created by Алмаз on 14.10.2015.
 */
public enum Language {

    INSTANCE;

    private final String KEY_LANG_ENGLISH = "English";
    private final String PATH_LANG_ENGLISH = "com.aincorp.inventory.lang.lang_en";
    private final String FILE_LANG_ENGLISH = "lang_en.properties";

    private final String KEY_LANG_RUSSIAN = "Russian";
    private final String PATH_LANG_RUSSIAN = "com.aincorp.inventory.lang.lang_ru";
    private final String FILE_LANG_RUSSIAN = "lang_ru.properties";

    private final String PATH_LANG_ROOT = "." + File.separator + "Snake" + File.separator + "Lang" + File.separator;

    private final String PATH_LANG_FILE = PATH_LANG_ROOT + "lang.ini";

    private final HashMap<String, String> languageMap = new HashMap<>();

    private String currentLanguage;

    private Language() {
        languageMap.put(KEY_LANG_ENGLISH, PATH_LANG_ENGLISH);
        languageMap.put(KEY_LANG_RUSSIAN, PATH_LANG_RUSSIAN);

        String language = loadLanguageSettingFromFile();

        currentLanguage = language;
    }

    private String loadLanguageSettingFromFile() {
        File root = new File(PATH_LANG_ROOT);
        File file = new File(PATH_LANG_FILE);
        int c;
        StringBuilder lang = new StringBuilder();

        BufferedReader buffer;

        if (root.exists() && file.exists()) {

            try {
                buffer = new BufferedReader(new FileReader(PATH_LANG_FILE));
            } catch (FileNotFoundException e) {
                System.out.println("Could not load lang");
                return null;
            }


            while (true) {
                try {
                    c = buffer.read();
                } catch (IOException e) {
                    System.out.println("Could not load lang");
                    return null;
                }

                if (c != -1) {
                    lang.append((char) c);
                } else {
                    break;
                }
            }

            try {
                buffer.close();
            } catch (IOException e) {
                System.out.println("Could not load lang");
                return null;
            }
        }

        if (lang.length() == 0) {
            return KEY_LANG_ENGLISH;
        } else {
            return lang.toString();
        }
    }

    private boolean saveLanguageSettingToFile(String language) {
        File root = new File(PATH_LANG_ROOT);
        File file = new File(PATH_LANG_FILE);
        if ((root.exists() && file.exists()) == false) {
            root.mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Could not save lang setting.");
                return false;
            }
        }

        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(PATH_LANG_FILE)));

            writer.write(language);
            writer.close();
        } catch (IOException e) {
            System.out.println("Unable to save lang setting to file");
            return false;
        }
        System.out.println("Lang setting saved to file");
        return true;
    }

    public String getCurrentLanguage() {

        return currentLanguage;
    }

    public String getLanguagePath(String language) {
        if (languageMap.containsKey(language)) {
            return languageMap.get(language);
        } else {
            //return default lang
            System.out.println("Invalid language.");
            return languageMap.get(KEY_LANG_ENGLISH);
        }
    }

    public boolean setLanguage(String language) {
        if (languageMap.containsKey(language)) {
            currentLanguage = language;
            saveLanguageSettingToFile(language);
            return true;
        } else {
            System.out.println("Invalid language.");
            return false;
        }
    }

    public ArrayList<String> getLanguagesAsList() {
        ArrayList<String> list = new ArrayList<String>();

        for (Map.Entry<String, String> cursor : languageMap.entrySet()) {
            list.add(cursor.getKey());
        }

        Collections.sort(list);
        return list;
    }

    public Properties getLangAsProperties() {
        Properties prop = new Properties();
        String path = null;

        if (currentLanguage.equals(KEY_LANG_ENGLISH)) {
            path = FILE_LANG_ENGLISH;
        } else if (currentLanguage.equals(KEY_LANG_RUSSIAN)) {
            path = FILE_LANG_RUSSIAN;
        } else {
            path = FILE_LANG_ENGLISH;
            System.out.println("Lang to Properties error!");
        }

        try {
            prop.load(getClass().getResourceAsStream((path)));
        } catch (IOException e) {
            System.out.println("Could not load language as property!");
            prop = null;
        }
        return prop;
    }
}
