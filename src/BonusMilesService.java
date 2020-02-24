public class BonusMilesService {
    public int calculate (int cost) {
        int spentForBonus = 20;
        int bonusMiles = 1;
        int accuredBonus = cost / spentForBonus * bonusMiles;
        return accuredBonus;
    }
}
