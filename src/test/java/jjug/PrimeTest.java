package jjug;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrimeTest {

    @Test
    public void testPrimeFactor() {
        assertThat(PrimeFactors.divide(BigInteger.valueOf(100)).toString(), is(Arrays.asList(2, 2, 5, 5).toString()));
        assertThat(PrimeFactors.divide(BigInteger.valueOf(2000)).toString(), is(Arrays.asList(2, 2, 2, 2, 5, 5, 5).toString()));
        assertThat(PrimeFactors.divide(BigInteger.valueOf(9876)).toString(), is(Arrays.asList(2, 2, 3, 823).toString()));
        assertThat(PrimeFactors.divide(BigInteger.valueOf(987654321)).toString(), is(Arrays.asList(3, 3, 17, 17, 379721).toString()));
        assertThat(PrimeFactors.divide(BigInteger.valueOf(2147483646)).toString(), is(Arrays.asList(2, 3, 3, 7, 11, 31, 151, 331).toString()));
    }

}