package runners;

public enum Food {
    SPAGETI(20){
        @Override
        String whatISayAboutThisFood() {
            return "spageti is cheap but not so good";
        }
    }, PIZZA(50){
        @Override
        String whatISayAboutThisFood() {
            return "pizza is relatively cheap and delicious";
        }
    }, INDIAN(85){
        @Override
        String whatISayAboutThisFood() {
            return "I love this food but it is expensive";
        }
    };
    protected int worth;
     Food(int worth){
        this.worth = worth;
    }
    abstract String whatISayAboutThisFood();



}
