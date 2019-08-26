package cn.aethli.thoth.utils;

/**
 * @device: Hades
 * @author: Termite
 * @date: 2019-08-26 13:58
 **/
public class StringUtils {

  /**
   * 将term转换为请求所需五位数
   *
   * @param term
   * @return
   */
  public static String termParamsConvert(String term) {
    if (term.length() < 5) {
      term = "0" + term;
    }
    return term;
  }

  /**
   * 跳到下一个需要爬取的期数
   *
   * @param term
   * @param num
   * @return
   */
  public static String termJump(String type, String term, String num) {
    //七星彩处理
    if ("8".equals(type) && Integer.parseInt(term.substring(term.length() - 3)) >= 300) {
      return String
          .valueOf((Integer.parseInt(term.substring(0, term.length() - 3)) + 1) * 1000);
    } else {
      return String.valueOf(Integer.parseInt(term) + Integer.parseInt(num));

    }
  }
}