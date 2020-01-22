import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class NumberToTextTest {

    @Test
    public void given_primary_number_should_return_number_to_text() {
        //assertThat(NumberToText.of(1)).isEqualTo("one");
        assertEquals( "one", new NumberToText(1).toText());
        assertEquals( "two", new NumberToText(2).toText());
        assertEquals( "three", new NumberToText(3).toText());
        assertEquals( "four", new NumberToText(4).toText());
        assertEquals( "five", new NumberToText(5).toText());
        assertEquals( "six", new NumberToText(6).toText());
        assertEquals( "seven", new NumberToText(7).toText());
        assertEquals( "eight", new NumberToText(8).toText());
        assertEquals( "nine", new NumberToText(9).toText());
        assertEquals( "ten", new NumberToText(10).toText());
        assertEquals( "eleven", new NumberToText(11).toText());
        assertEquals( "twelve", new NumberToText(12).toText());
    }

    @Test
    public void given_2_digit_should_return_2_digit_number_to_text() {
        assertEquals( "thirty six", new NumberToText(36).toText());
        assertEquals( "sixteen", new NumberToText(16).toText());
        assertEquals( "ninety six", new NumberToText(96).toText());
        assertEquals( "thirteen", new NumberToText(13).toText());
        assertEquals( "fifty", new NumberToText(50).toText());
    }

    @Test
    public void given_4_digit_should_return_4_digit_number_to_text() {
        assertEquals( "one thousand one hundred twenty three", new NumberToText(1123).toText());
        assertEquals( "two thousand one hundred", new NumberToText(2100).toText());
        assertEquals( "three thousand one hundred ninety nine", new NumberToText(3199).toText());
        assertEquals( "four thousand fifty", new NumberToText(4050).toText());
        assertEquals( "one thousand one", new NumberToText(1001).toText());
        assertEquals( "eight thousand fourteen", new NumberToText(8014).toText());
        assertEquals( "five thousand", new NumberToText(5000).toText());
        assertEquals( "nine thousand nine hundred ninety nine", new NumberToText(9999).toText());
    }

    @Test
    public void given_more_than_3_digit_should_return_more_than_4_digit_number_to_text() {
        assertEquals( "one thousand one hundred twenty three", new NumberToText(1123).toText());
        assertEquals( "two thousand one hundred", new NumberToText(2100).toText());
        assertEquals( "three thousand one hundred ninety nine", new NumberToText(3199).toText());
        assertEquals( "four thousand fifty", new NumberToText(4050).toText());
        assertEquals( "one thousand one", new NumberToText(1001).toText());
        assertEquals( "eight thousand fourteen", new NumberToText(8014).toText());
        assertEquals( "five thousand", new NumberToText(5000).toText());
        assertEquals( "nine thousand nine hundred ninety nine", new NumberToText(9999).toText());

        assertEquals( "ten thousand", new NumberToText(10000).toText());
        assertEquals( "ten thousand five", new NumberToText(10005).toText());
        assertEquals( "twenty thousand nineteen", new NumberToText(20019).toText());
        assertEquals( "thirty thousand seventy eight", new NumberToText(30078).toText());
        assertEquals( "fifty thousand two hundred", new NumberToText(50200).toText());
        assertEquals( "fifty thousand three hundred three", new NumberToText(50303).toText());
        assertEquals( "fifty thousand two hundred fifty four", new NumberToText(50254).toText());
        assertEquals( "fifty thousand two hundred thirteen", new NumberToText(50213).toText());
        assertEquals( "fifty nine thousand one hundred twenty three", new NumberToText(59123).toText());
        assertEquals( "eighty five thousand", new NumberToText(85000).toText());
        assertEquals( "eighty five thousand two hundred twelve", new NumberToText(85212).toText());

        assertEquals( "one hundred eighty five thousand two hundred twelve", new NumberToText(185212).toText());
        assertEquals( "six hundred eighty five thousand two hundred twelve", new NumberToText(685212).toText());
        assertEquals( "nine hundred fifty thousand two hundred thirteen", new NumberToText(950213).toText());
        assertEquals( "nine hundred thousand nineteen", new NumberToText(900019).toText());
        assertEquals( "nine hundred ninety nine thousand nine hundred ninety nine", new NumberToText(999999).toText());
    }

    @Test
    public void given_more_than_5_digit_should_return_more_than_4_digit_number_to_text() {
        assertEquals( "one million", new NumberToText(1000000).toText());
        assertEquals( "one million one", new NumberToText(1000001).toText());
        assertEquals( "eight million thirteen", new NumberToText(8000013).toText());
        assertEquals( "twenty five million", new NumberToText(25000000).toText());
        assertEquals( "twenty five million one", new NumberToText(25000001).toText());
        assertEquals( "twenty five million thirteen", new NumberToText(25000013).toText());
        assertEquals( "sixty nine million one hundred fifty eight thousand three hundred thirteen", new NumberToText(69158313).toText());
        assertEquals( "sixty nine million one hundred fifty eight thousand thirteen", new NumberToText(69158013).toText());
        assertEquals( "nine hundred sixty nine million one hundred fifty eight thousand three hundred thirteen", new NumberToText(969158313).toText());
        assertEquals( "one hundred twenty three thousand nine hundred sixty nine million one hundred fifty eight thousand three hundred thirteen", new NumberToText(123969158313L).toText());
        assertEquals( "nine hundred ninety nine thousand nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", new NumberToText(999999999999L).toText());
    }

}
