public class Scissors implements Move {

    @Override
    public Move vs(Scissors scissors) {
        return this;
    }

    @Override
    public Move vs(Paper papper){
        return this;
    }

    @Override
    public Move vs(Rock rock){
        return rock;
    }
}
