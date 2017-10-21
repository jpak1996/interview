package com.jetbrains;

class Solution {
    public int onesDigit(char char_num, StringBuilder sb) {
        switch (char_num) {
            case '1':
                sb.append(" One");
                break;
            case '2':
                sb.append(" Two");
                break;
            case '3':
                sb.append(" Three");
                break;
            case '4':
                sb.append(" Four");
                break;
            case '5':
                sb.append(" Five");
                break;
            case '6':
                sb.append(" Six");
                break;
            case '7':
                sb.append(" Seven");
                break;
            case '8':
                sb.append(" Eight");
                break;
            case '9':
                sb.append(" Nine");
                break;
            default:
                return 0;
        }
        return 1;
    }
    public void tensDigit(char char_num, StringBuilder sb) {
        switch (char_num) {
            case '2':
                sb.append(" Twenty");
                break;
            case '3':
                sb.append(" Thirty");
                break;
            case '4':
                sb.append(" Forty");
                break;
            case '5':
                sb.append(" Fifty");
                break;
            case '6':
                sb.append(" Sixty");
                break;
            case '7':
                sb.append(" Seventy");
                break;
            case '8':
                sb.append(" Eighty");
                break;
            case '9':
                sb.append(" Ninety");
                break;
            default:
                break;
        }
    }
    public void specialTensDigit(String string_num, StringBuilder sb) {
        switch (string_num) {
            case "10":
                sb.append(" Ten");
                break;
            case "11":
                sb.append(" Eleven");
                break;
            case "12":
                sb.append(" Twelve");
                break;
            case "13":
                sb.append(" Thirteen");
                break;
            case "14":
                sb.append(" Fourteen");
                break;
            case "15":
                sb.append(" Fifteen");
                break;
            case "16":
                sb.append(" Sixteen");
                break;
            case "17":
                sb.append(" Seventeen");
                break;
            case "18":
                sb.append(" Eighteen");
                break;
            case "19":
                sb.append(" Nineteen");
                break;
            default:
                break;
        }
    }
    public void solveHundreds(String string_num, StringBuilder sb) {
        char char_num = string_num.charAt(0);
        int ret = onesDigit(char_num, sb);
        if(ret==1) {
            sb.append(" Hundred");
        }

        char_num = string_num.charAt(1);
        if(char_num=='1') {
            String tens = string_num.substring(1,3);
            specialTensDigit(tens, sb);
        }
        else {
            tensDigit(char_num, sb);
            char_num = string_num.charAt(2);
            onesDigit(char_num, sb);
        }


    }

    public String numberToWords(int num) {
        if (num==0) {
            return "Zero";
        }
        String string_num = Integer.toString(num);
        int length = string_num.length();
        StringBuilder sb = new StringBuilder();
        String subgroup = "";

        for(int i=0; i<10-length; i++) {
            string_num = "0" + string_num;
        }
        //0 000 012 345
        char bil = string_num.charAt(0);
        int res = onesDigit(bil, sb);
        if(res==1) {
            sb.append(" Billion");
        }

        for(int i=1; i<10; i+=3) {
            subgroup = string_num.substring(i,(i+3<=10 ? i+3 : 10));

            if(num>=1000000 && i==1 && !subgroup.equals("000")) {
                solveHundreds(subgroup,sb);
                sb.append(" Million");
            }
            else if(num>=1000 && i==4 && !subgroup.equals("000")) {

                solveHundreds(subgroup,sb);
                sb.append(" Thousand");
            }
        }
        solveHundreds(subgroup,sb);
        // System.out.println(sb.toString());
        return sb.toString().substring(1);


    }
}