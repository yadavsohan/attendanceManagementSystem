package hu.uni.miskolc.iit.sweng.attendanceManagementSystem.core.model;

public class attendancetable {
    private String _student_name;
    private int    _status;
    private String _semester;
    private String _subject;
    private String _month;

    public attendancetable(String student_name,int status,String semester,String subject,String month ){

        this ._student_name  = student_name ;
        this ._status = status;
        this._semester = semester;
        this._subject = subject ;
        this._month = month ;

    }

    public String get_student_name() {
        return _student_name;
    }

    public int get_status() {
        return _status;
    }

    public String get_semester() {
        return _semester;
    }

    public String get_subject() {
        return _subject;
    }

    public String get_month() {
        return _month;
    }

    public void set_month(String _month) {
        this._month = _month;
    }

    public void set_semester(String _semester) {
        this._semester = _semester;
    }

    public void set_status(int _status) {
        this._status = _status;
    }

    public void set_student_name(String _student_name) {
        this._student_name = _student_name;
    }

    public void set_subject(String _subject) {
        this._subject = _subject;
    }

}
