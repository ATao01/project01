import sun.font.FontRunIterator;

import java.util.concurrent.ForkJoinPool;

/**
 * ClassName: GreekAlphabet
 * Description:
 *
 * @Author A-Tao
 * @Create 2023/9/6 14:23
 * @Version 1.0
 */
public class GreekAlphabet {
    public static void main(String[] args) {
        char[] table = new char[]{'α','β','γ','δ','ε','ζ','η','θ','ι',
                'κ','λ','μ','ν','ξ','ο','π','ρ','ς','σ','τ','υ','φ','χ','ψ','ω'};
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]);
        }
    }
}
