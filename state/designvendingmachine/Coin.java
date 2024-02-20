package state.designvendingmachine;

public enum Coin {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTYFIVE(25);

    int value;
    
    Coin(int value){
        this.value = value;
    }
}
