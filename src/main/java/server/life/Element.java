package server.life;

/**
 * 元素属性
 * @author Xiaoye
 */
public enum Element {
    /**
     * 中性
     */
    NEUTRAL,
    /**
     * 物理属性
     */
    PHYSICAL,
    /**
     * 火属性
     */
    FIRE,
    /**
     * 冰属性
     */
    ICE,
    /**
     * 光属性
     */
    LIGHTING,
    /**
     * 毒属性
     */
    POISON,
    /**
     * 圣属性
     */
    HOLY,
    /**
     * 黑暗
     */
    DARKNESS;

    public static Element getFromChar(char c) {
        switch (Character.toUpperCase(c)) {
            case 'F':
                return FIRE;
            case 'I':
                return ICE;
            case 'L':
                return LIGHTING;
            case 'S':
                return POISON;
            case 'H':
                return HOLY;
            case 'P':
                return NEUTRAL;
            //  return PHYSICAL;
           /* case 'D': // Added on v.92 MSEA
                return DARKNESS;*/
            case 'G':
            case 'J':
            case 'K':
            case 'M':
            case 'N':
            case 'O':
            case 'Q':
            case 'R':
        }
        throw new IllegalArgumentException("unknown elemnt char " + c);
    }
}
