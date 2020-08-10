package lvn_10_1008.bttl;

public class Key implements Comparable<Key>{
    private Integer id;

    public Key(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Key key) {
        return this.id.compareTo(key.id);
    }
    @Override
    public int hashCode(){
        int hash = id%10;
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        return this.id.equals(((Key)(obj)).id);

    }
}
