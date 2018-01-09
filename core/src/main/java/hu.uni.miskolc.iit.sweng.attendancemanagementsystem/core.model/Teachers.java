package core.model;

public class Teachers {

    private int _Teacher_id;
    private String _Teacher_name;

    public Teachers( int Teacher_id,String Teacher_name ){
        this._Teacher_id = Teacher_id;
        this._Teacher_name = Teacher_name;
    }

    public int get_Teacher_id() {
        return _Teacher_id;
    }

    public String get_Teacher_name() {
        return _Teacher_name;
    }

    public void set_Teacher_id(int _Teacher_id) {
        this._Teacher_id = _Teacher_id;
    }

    public void set_Teacher_name(String _Teacher_name) {
        this._Teacher_name = _Teacher_name;
    }
}
