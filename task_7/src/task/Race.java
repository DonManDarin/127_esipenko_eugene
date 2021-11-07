package task;

public enum Race {
    Orc(6,12,2){
        /*public int strength(){
            return 6;
        }
        public int health(){
            return 12;
        }
        public int dexterity(){
            return 2;
        }*/
    },
    Elf(2,9,9){
       /* public int strength(){
            return 2;
        }
        public int health(){
            return 9;
        }
        public int dexterity(){
            return 9;
        }*/
    },
    Dwarf(6,10,4){
       /* public int strength(){
            return 6;
        }
        public int health(){
            return 10;
        }
        public int dexterity(){
            return 4;
        }*/
    },
    Halfling(1,8,11){
       /* public int strength(){
            return 1;
        }
        public int health(){
            return 8;
        }
        public int dexterity(){
            return 11;
        }*/
    },
    Human(6,7,7){
       /* public int strength(){
            return 6;
        }
        public int health(){
            return 7;
        }
        public int dexterity(){
            return 7;
        }*/
    };

    /* public abstract int strength();
   public abstract int health();
   public abstract int dexterity();*/

    private final int strength;
    private final int health;
    private final int dexterity;
    Race(int strength, int health, int dexterity){
        this.strength = strength;
        this.dexterity = dexterity;
        this.health = health;
    }
    public int strength(){
        return strength;
    }
    public int dexterity(){
        return dexterity;
    }
    public int health(){
        return health;
    }
}