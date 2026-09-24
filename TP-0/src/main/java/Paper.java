public class Paper implements Move {

    @Override
    public Move vs(Paper paper){
        return this;
    }

    @Override
    public Move vs(Rock rock){
        return this;
    }

    @Override
    public Move vs(Scissors scissors){
        return scissors;
    }

}

