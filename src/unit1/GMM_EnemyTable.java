package unit1;

import java.util.Random;

public class GMM_EnemyTable {
    private static final String[] SOLDIER_WEAPONS = {
        "Lebel Modele 1886",
        "Berthier Modele 1916",
        "Scoped Berthier Modele 1916",
        "Berthier Modele 1916 Mousqueton",
        "Fusil Automatique Modele 1917",
        "MAS-36",
        "Scoped MAS-36",
        "MAS-38",
        "Chauchat",
        "MAC-24/29",
        "Hotchkiss Modele 1914"
    };
    
    private static final double[] SOLDIER_WEIGHTS = {
            6.0,
            4.0,
            1.0,
            4.0,
            3.0,
            6.0,
            2.0,
            3.0,
            2.0,
            2.0,
            2.0
            
        };
        
        private static final String[] OFFICER_WEAPONS = {
            "Modele 1892 Revolver",
            "Savage Modele 1907 (.32)",
            "Savage Modele 1907 (.380)",
            "Ruby Pistol",
            "MAB Model D",
            "Modele 1935A",
            "MAS-38"
            
        };

        private static final double[] OFFICER_WEIGHTS = {
            6.0,
            3.0,
            3.0,
            6.0,
            6.0,
            6.0,
            6.0
        };

        private static final Random random = new Random();

        private int type;

        public GMM_EnemyTable(int type) {
            this.type = type;
        }

        public String getRandomEquipment() {
            if (type == 1) {
                return getRandomSoldierEquipment();
            } else if (type == 2) {
                return getRandomOfficerEquipment();
            } else {
                return "Invalid enemy type";
            }
        }

        private String getRandomSoldierEquipment() {
            return getRandomItemWithWeight(SOLDIER_WEAPONS, SOLDIER_WEIGHTS);
        }

        private String getRandomOfficerEquipment() {
            return getRandomItemWithWeight(OFFICER_WEAPONS, OFFICER_WEIGHTS);
        }

        private String getRandomItemWithWeight(String[] items, double[] weights) {
            double totalWeight = 0.0;
            for (double weight : weights) {
                totalWeight += weight;
            }

            double randomValue = random.nextDouble() * totalWeight;
            double cumulativeWeight = 0.0;
            for (int i = 0; i < items.length; i++) {
                cumulativeWeight += weights[i];
                if (randomValue < cumulativeWeight) {
                    return items[i];
                }
            }


            return "No item selected";
        }

        @Override
        public String toString() {
            return getRandomEquipment();
        }
    }