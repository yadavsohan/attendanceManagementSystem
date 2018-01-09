package core.model;

public class Reports {
    private String _student_attendance;
    private String _staff_attendance;
    private  String _attendance_evaluation;
    private String _defaulters_list;

    public Reports(String student_attendance,String staff_attendance,String attendance_evaluation,String defaulters_list ){

        this._student_attendance = student_attendance;
        this._staff_attendance = staff_attendance;
        this._attendance_evaluation = attendance_evaluation;
        this._defaulters_list = defaulters_list;

    }

    public String get_attendance_evaluation() {
        return _attendance_evaluation;
    }

    public String get_staff_attendance() {
        return _staff_attendance;
    }

    public String get_defaulters_list() {
        return _defaulters_list;
    }

    public String get_student_attendance() {
        return _student_attendance;
    }

    public void set_attendance_evaluation(String _attendance_evaluation) {
        this._attendance_evaluation = _attendance_evaluation;
    }

    public void set_defaulters_list(String _defaulters_list) {
        this._defaulters_list = _defaulters_list;
    }

    public void set_staff_attendance(String _staff_attendance) {
        this._staff_attendance = _staff_attendance;
    }

    public void set_student_attendance(String _student_attendance) {
        this._student_attendance = _student_attendance;
    }
}