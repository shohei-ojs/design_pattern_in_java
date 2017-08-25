public interface iterator {
    // 次の要素が存在するかを調べる
    public abstract boolean hasNext();
    
    // 次の要素のオブジェクト
    public abstract Object  next();
}