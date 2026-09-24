public class Rock implements Move {

    @Override
    public Move vs(Rock rock){
        return this;
    }

    @Override
    public Move vs(Paper paper){
        return paper;
    }

    @Override
    public Move vs(Scissors scissors) {
        return this;
    }
}
