package com.company;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class String_spiliting {
    public static void main(String[] args) {
        String str = "MississipieMississipieMississipie";
        String spilit_str = str.substring(4,8);
        
        System.out.println(spilit_str);
        Pattern p = Pattern.compile("Mi(.*?)pi");
        Matcher m = p.matcher(str);
        while(m.find()){
            //System.out.println(m.group(1));
        }
        String html =  "</div><div class=\"clear\"></div></div><div class=\"lister-item mode-detail\"><div class=\"lister-item-image\"><a href=\"/name/nm0451166/?ref_=nmls_pst\" > <img alt=\"Amjad Khan\" height=\"209\"src=\"https://m.media-amazon.com/images/M/MV5BOWUzNjU3YTUtOGIyMi00MDk3LTk1NDMtMzY4MDZlNDFhNTFhXkEyXkFqcGdeQXVyMTExNDQ2MTI@._V1_UY209_CR73,0,140,209_AL_.jpg\" width=\"140\" />";
        p = Pattern.compile("<img alt=\"(.*?)\"");
        m = p.matcher(html);
        while(m.find()){
            System.out.println(m.group(1));
        }
        p = Pattern.compile("src=\"(.*?)_V1");
        m = p.matcher(html);
        while(m.find()){
            System.out.println(m.group(1));
        }
    }
}
