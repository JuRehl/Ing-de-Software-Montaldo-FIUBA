public interface Move {
    Move vs(Paper paper);
    Move vs(Scissors scissors);
    Move vs(Rock rock);
}
