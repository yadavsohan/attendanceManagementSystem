package core.model;

public class subjecttable {
    private int _student_id;
    private String _student_name;
    private  String _course;
    private String _semester;

    public  subjecttable(int student_id,String student_name,String course,String semester){
        this._course  = course;
        this._semester =semester;
        this._student_id = student_id;
        this._student_name =student_name;

    }

    public String get_semester() {
        return _semester;
    }

    public String get_student_name() {
        return _student_name;
    }

    public int get_student_id() {
        return _student_id;
    }

    public String get_course() {
        return _course;
    }

    public void set_student_name(String _student_name) {
        this._student_name = _student_name;
    }

    public void set_semester(String _semester) {
        this._semester = _semester;
    }

    public void set_course(String _course) {
        this._course = _course;
    }

    public void set_student_id(int _student_id) {
        this._student_id = _student_id;
    }
}
