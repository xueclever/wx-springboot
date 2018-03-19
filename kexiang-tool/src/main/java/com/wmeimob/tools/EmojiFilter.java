package com.wmeimob.tools;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Shinez on 2016/12/19.
 */
public class EmojiFilter {
    private static final Pattern EMOJI = Pattern
            .compile(
                    "([\\x{1f600}-\\x{1f64f}]|[\\x{2702}-\\x{27b0}]|[\\x{1f680}-\\x{1f6ff}]|[\\x{1F170}-\\x{1F251}]|[\\x{1f300}-\\x{1f5ff}])",
                    Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);

    /**
     * 将昵称中含表情的字符替换成□
     *
     * @author huangrong
     * @param source
     * @return
     */
    public static String filter(String source) {
        Matcher emojiMatcher = EMOJI.matcher(source);
        ArrayList<String> strs = new ArrayList<String>();
        while (emojiMatcher.find()) {
            strs.add(emojiMatcher.group(1));
        }
        for (String s : strs) {
            source = source.replaceAll(s, "□");
        }
        return source.toString();
    }
}
