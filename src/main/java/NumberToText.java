public class NumberToText {

    private final long number;
    private String result ="";
    private int position = 0;
    private int count = 0;
    private int size = 0;
    private int million = 0;

    public NumberToText(long number,int million){
        this.number = number;
        this.million = million;
    }
    public NumberToText(long number){
        this.number = number;
        this.million = 0;
    }



    public String toText(){
        size = 0;
        count = 0;
        position = 0;
        return digitToText(this.number);
    }

    public String digitToText(long num) {
        this.count++;
        while(true){
            if(position == 0 && num < 20){
                return (result + basicNumberToText(num)).trim().replaceAll("  "," ");
            }
            if(num<10){
                if (position == 1){
                    result += decimalToText(num) + " ";
                    return result;
                } else if (position == 2 && num != 0){
                    result += basicNumberToText(num) + " hundred ";
                    return result;
                } else if (position == 3 && num != 0){
                    if (million == 0) {
                        result += basicNumberToText(num) + " thousand ";
                        return result;
                    } else {
                        result += basicNumberToText(num) + " million ";
                        return result;
                    }
                } else {
                    return result + "";
                }
            } else if (position > 2){
                result += new NumberToText(num, million +1).toText();
                if (million % 2 == 0 && (num % 1000) != 0) {
                    result += " thousand ";
                }else if (million % 2 != 0 && (num % 1000) != 0){
                    result += " million ";
                }
                return result;
            } else {
                this.position++;
                result = digitToText(num/10);
                this.position--;
                size++;
                if (size > 1 && position == 0 && (num = num % 100) < 20){
                    num = num % 100;
                    continue;
                }
                num = num % 10;
            }
        }
    }

    private static String decimalToText(long num) {
        switch ((int)num) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";

        }
    }

    private static String basicNumberToText(long num) {
        switch ((int)num){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";

        }
    }


}
