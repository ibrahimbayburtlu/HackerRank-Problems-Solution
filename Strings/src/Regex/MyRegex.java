package Regex;

//YOU SHOULD ONLY SUBMIT THE FOLLOWING BLOCK
class MyRegex {
    String Limit_0_255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = Limit_0_255 + "\\." + Limit_0_255
            + "\\." + Limit_0_255
            + "\\." + Limit_0_255;
}
