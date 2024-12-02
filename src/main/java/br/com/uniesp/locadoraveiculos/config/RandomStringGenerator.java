package br.com.uniesp.locadoraveiculos.config;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomStringGenerator {

    // Fonte de caracteres para geração da string
    public static final String DIGITS = "0123456789";
    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER = UPPER.toLowerCase(Locale.ROOT);
    public static final String ALPHANUM = UPPER + LOWER + DIGITS;
    private final Random random;
    private final char[] symbols;
    private final char[] buf;

    public RandomStringGenerator(int length, Random random, String symbols) {
        if (length < 1) throw new IllegalArgumentException();
        if (symbols.length() < 2) throw new IllegalArgumentException();
        this.random = Objects.requireNonNull(random);
        this.symbols = symbols.toCharArray();
        this.buf = new char[length];
    }

    public RandomStringGenerator(int length, Random random) {
        this(length, random, ALPHANUM);
    }

    public RandomStringGenerator(int length) {
        this(length, new SecureRandom());
    }

    public String nextString() {
        for (int idx = 0; idx < buf.length; ++idx)
            buf[idx] = symbols[random.nextInt(symbols.length)];
        return new String(buf);
    }
}
