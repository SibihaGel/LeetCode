package Classes;

import java.util.List;

public final class ImmutableClass {

    private final String field;

    private final List<Integer> list;

    public ImmutableClass(String field, List<Integer> list) {
        this.field = field;
        this.list = List.copyOf(list);
    }

    public String getField() {
        return this.field;
    }

    public List<Integer> getList (){
        return List.copyOf(list);
    }





}
