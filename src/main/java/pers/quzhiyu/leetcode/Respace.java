package pers.quzhiyu.leetcode;

import java.util.Arrays;

/**
 * 面试题 17.13. 恢复空格
 *
 * 哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，
 * 并且大写也弄成了小写。
 * 像句子"I reset the computer. It still didn’t boot!"
 * 已经变成了"iresetthecomputeritstilldidntboot"。
 * 在处理标点符号和大小写之前，你得先把它断成词语。当然了，你有一本厚厚的词典dictionary，不过，有些词没在词典里。
 * 假设文章用sentence表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。
 * 注意：本题相对原题稍作改动，只需返回未识别的字符数
 *
 *
 *
 * 示例：
 *
 * 输入：
 * dictionary = ["looked","just","like","her","brother"]
 * sentence = "jesslookedjustliketimherbrother"
 * 输出： 7
 * 解释： 断句后为"jess looked just like tim her brother"，共7个未识别字符。
 *
 */
public class Respace {
    public int respace(String[] dictionary, String sentence) {
        Arrays.sort(dictionary,(a,b)->b.length() - a.length());
        for (int i = 0; i < dictionary.length; i++) {
            sentence = sentence.replaceAll(dictionary[i], "");
        }
        return sentence.length();
    }

    public static void main(String[] args) {
        String[] dictionary = {"looked","just","like","her","brother"};
        String  sentence = "jesslookedjustliketimherbrother";
        int respace = new Respace().respace(dictionary, sentence);
        System.out.println(respace);
    }
}
