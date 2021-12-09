// Unicode Test for CS427 Issue link: https://github.com/pmd/pmd/issues/3423
package net.sourceforge.pmd.lang;

import org.junit.Test;

public class UnicodeTest {
    private static final int lᵤ = 1;
    private static final int μᵤ = 2;

    public static void main(String[] args) {
        System.out.println(lᵤ + μᵤ);
    }
}